package lektion.classes;

public class Circle {
	private double r = 1.0;
	private String color = "blue";
	
	public Circle(String startcolor) {
		color = startcolor;
		System.out.println(r + " " + color);
		r = 20;
	}
	
	
	
	
	public double getR() {
		return r;
	}
	
	public void setR(double newR) {
		r = newR;
	}
	
	

}
