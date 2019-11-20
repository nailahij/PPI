/*
 * [CircleTester].java
 * Author: [Nailah Jones]
 * Submission Date: [16 March 2019]
 *
 * Purpose:This program will serve as a tester for the calling of methods from
 * the Circle Class.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the Georgia Southern University's Academic Honesty Policy and
 * the policies of this course. Any publishing or posting of
 * source code for this project is strictly prohibited.
 */
public class CircleTester {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
	//	System.out.println(circle1.toString());
		circle1.setRadius(3);
		circle1.setX(4);
		circle1.setY(3);
	//	System.out.println(circle1.toString());
		Circle circle2 = new Circle();
	//	circle2.setRadius(5.3);
//		System.out.println(circle2.toString());
//		System.out.println(circle1.computeArea(34));
//		System.out.println(circle1.computeDiameter(34)); 
//		System.out.println(circle1.computePerimeter(34));
//		System.out.println(circle2.computeArea(5.3));
//		System.out.println(circle2.computeDiameter(5.3)); 
//		System.out.println(circle2.computePerimeter(5.3));
//		System.out.println(circle1.isUnitCircle(34, 4, 3));
//		System.out.println(circle2.isUnitCircle(5.3, 0, 0));
//		System.out.println(circle1.equals(circle2));
//		System.out.println(circle2.equals(circle2));
		circle2.setX(4);
		circle2.setY(10);
		circle2.setRadius(3);
	//	System.out.println(circle1.equals(circle2));
		//System.out.println(circle2.toString());
	//	System.out.println(circle1.isConcentric(circle2));
		circle1.distance(circle2);
		System.out.println(circle1.distance(circle2));
		System.out.println(circle1.intersects(circle2));


	}


}

