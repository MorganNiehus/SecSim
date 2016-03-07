package prob1;

public class IllegalRectangleException extends RuntimeException{
<<<<<<< HEAD

	private double width;
	private double height;
	private double area;
	
	public IllegalRectangleException(double width, double height, double area){
		super("Illegal Rectangle " + width + " " + height + " " + area);
		this.width = width;
		this.height = height;
		this.area = area;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getArea(){
		return area;
	}
	
=======
	

>>>>>>> 633fab66122e815a182996ff138fc36a7b3a9d19
}
