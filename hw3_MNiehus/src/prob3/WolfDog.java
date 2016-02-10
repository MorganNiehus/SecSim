//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob3;

public class WolfDog extends Dog{

	private int meanness;
	
	public WolfDog(int meanness, int age)
	{
		super(age);
		name = "wd";
		this.meanness = meanness;
	}
	
	public WolfDog(int meanness, int age, String name)
	{
		super(age, name);
		this.meanness = meanness;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result = super.toString() + ", meaness: " + meanness;//simply override the toString and print the extras
		return result;
	}
}
