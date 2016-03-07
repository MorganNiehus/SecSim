package geometricObjects;

public class Circle extends GeometricObject{

	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getDiameter(){
		return (getRadius() * 2);
	}
	
	@Override
	public double getArea(){
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	@Override
	public double getPerimeter(){
		return 2 * Math.PI * getRadius();
	}
	
}
