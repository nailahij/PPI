import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolsList {

	private ArrayList<School> theList;
	
	public SchoolsList() {
		this.theList = new ArrayList<School>(); //initialize a new ArrayList
	}
	
	public void loadTextFile(String filename) {
		try {
			FileReader fr = new FileReader(filename);//wrapper for the filename and path 
			BufferedReader br = new BufferedReader(fr);//open file
			//read the file
			System.out.println(br.readLine());//read a line
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			//save line from this point on
			String data = br.readLine();
			while(data!=null) {
				this.addSchool(data);
				data = br.readLine();
			}
			
		}catch(InputMismatchException m) {
			
		}
		catch (FileNotFoundException e) {//filename or path of file incorrect
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {// an other issues with getting the file or operating on the file
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SchoolsList sl = new SchoolsList();
		sl.loadTextFile("src/ga_public_school_list.csv");
		sl.displaySchoolsInSystem(625);
		sl.writeToFile("src/testDoc.txt", 625);
		sl.writeBinary("src/allSchools.bin");
		//sl.addSchool("601,Appling County,103,Appling County High School,	Baxley");
	}
	
	
	public boolean addSchool(String school) {
		School s=null;
		try {
		Scanner scan = new Scanner(school).useDelimiter("\\s*,\\s*");// comma separated, but if spaces are before or after, remove them as well.
		int sysID = scan.nextInt(); //SystemID first
		String sysName = scan.next(); //System name next
		int schID = scan.nextInt(); //school ID next
		String schName = scan.next(); //school name next
		String city = scan.next(); //city next
		scan.close();
		//Create new school object
		s = new School(sysID, sysName, schID, schName,city);
		}catch(InputMismatchException e) {
			System.out.println("I never saw that, did you?");
			return false;
		}
		//add to arraylist
		if(!theList.contains(s)) {//check if school alread in the arraylist
			theList.add(s);
			return true;
		}else return false;
	}

	public void displaySchoolsInSystem(int sysID) {
		System.out.println("Schools for "+sysID+"\n============================\n");
		for(int i=0; i<theList.size();i++) {//loop through arraylist
			if(theList.get(i).getSystemID()==sysID) {//find schools that match the system id
				System.out.println(theList.get(i));// print info on matching school
			}
		}
	}
	
	public int writeToFile(String filename, int sysID) {
		try {
			FileWriter fw = new FileWriter(filename);//wrapper for filename and path
			BufferedWriter bw = new BufferedWriter(fw);//open text file 
			
			System.out.println("Schools for "+sysID+"\n============================\n");
			for(int i=0; i<theList.size();i++) {
				if(theList.get(i).getSystemID()==sysID) {
					bw.write(theList.get(i).toString());//write to file
				}
			}
			
			bw.close(); //close text file
			fw.close();//close wrapper
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;//return count of number of lines written. How can we do this?
	}
	
	public void writeBinary(String filename) {
		try {
			FileOutputStream fos = new FileOutputStream(filename);//wrapper for file and path
			ObjectOutputStream oos = new ObjectOutputStream(fos); //open binary file
			for(int i=0; i< theList.size(); i++) {
				oos.writeObject(theList.get(i));//write object to byte stream
			}
			oos.close();//close file
			fos.close();//close wrapper
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
