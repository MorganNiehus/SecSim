package geometricObjects;

public class ShapeTester {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		System.out.println("******Test 1 cloning");
		
		GeometricObject c1 = new Circle(5);
		
		c1.setColor("red");
		
		GeometricObject c1Clone = (GeometricObject) c1.clone();
		
		System.out.println(c1.toString());
		
		System.out.println(c1Clone.toString());
		
		
		
		
		
	}
	
}
