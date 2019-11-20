import java.io.Serializable;
import java.util.InputMismatchException;
//Serializable interface tags objects of the class as writable as a byte stream 
public class School implements Serializable{

	private String schoolName, systemName, city;
	private int schoolID, systemID;
	
	public School(int systemID, String systemName,int schoolID,String schoolName, String city) {
		this.schoolID = schoolID;
		this.schoolName = schoolName;
		this.systemID = systemID;
		this.systemName = systemName;
		this.city = city;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}

	public int getSystemID() {
		return systemID;
	}

	public void setSystemID(int systemID) {
		this.systemID = systemID;
	}
	
	public boolean equals(Object otherSchool) {
		if(otherSchool instanceof School) {
			School other = (School)otherSchool;
			return (this.systemID==other.systemID && this.schoolID == other.schoolID);
		}else throw new InputMismatchException();
	}
	
	public String toString() {
		return this.getCity()+" "+this.getSchoolName()+" "+this.getSystemID();
	}
}
