//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob3;

public class Dog {

	private int age;
	protected String name;
	
	public Dog()
	{
		age = 0;
		name = "d0";
	}
	
	public Dog(int age)
	{
		this.age = age;
		name = "d1";
	}
	
	public Dog(String name)
	{
		this.name = name;
		age = 1;
	}
	
	public Dog(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public String toString()
	{
		String result = "";
		result = "Dog-name: " + name + ", " + "age " + age;
		return result;
	}
	
}
