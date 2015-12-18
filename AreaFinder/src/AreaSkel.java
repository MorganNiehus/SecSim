import java.util.*;
public class AreaSkel {

	private double length = 1;
	private double width = 1;
	private double area = 0;
	
	public AreaSkel(){
		
	}
	
	public AreaSkel(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getArea(){
		area = length * width;
		return area;
	}
	
	public String toString(){
		String result = " ";
		result = "Lenght:\t" + getLength() +
				 "\nWidth:\t" + getWidth() +
				 "\nArea:\t" + getArea();
		return result;
	}
	
}
