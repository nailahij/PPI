/*
 * [Circle].java
 * Author: [Nailah Jones]
 * Submission Date: [16 March 2019]
 *
 * Purpose: This class will serve as an operating class that will be called in
 * CircleTester.
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
public class Circle {
	private double x;
	private double y;
	private double radius;
	//String center = x,y ;

	//string ="";
	public String toString() {
		double r = radius;
		String s1 = ("center: ( " + x + "," + y + ")\n");
		String s2 = ("radius: " + r);
		return s1 +s2;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x =x;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}
	public double getY() {
		return y;
	}
	public void setY( double y) {
		this.y = y;
	}
	public double computeArea (double radius) {
		double Area = Math.PI * radius * radius;
		return Area;
	}
	public double computePerimeter (double radius) {
		double Perimeter = 2 * Math.PI * radius;
		return Perimeter;
	}
	public double computeDiameter (double radius) {
		double Diameter = radius * 2;
		return Diameter;
	}
	public boolean isUnitCircle (double radius, double x, double y) {
		if (radius == 1 && x == 0 && y == 0) {
			return true;
		}else {
			return false;
		}

	}
	public boolean equals(Circle anotherCircle) {
		if( radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y) {
		return true;
	}
		return false;
	}
	public boolean isConcentric(Circle anotherCircle) {
		if (anotherCircle.radius != this.radius && anotherCircle.x == this.x && anotherCircle.y == this.y) {
			return true;

		}
		return false;
	}
public double distance (Circle anotherCircle) {
	double distance = Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
	return distance;
}
public boolean intersects (Circle anotherCircle) {
	double distance = Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
	double sum = anotherCircle.radius + this.getRadius();
	if ( distance < sum) {
	return true;
	}
	return false;
}
}


