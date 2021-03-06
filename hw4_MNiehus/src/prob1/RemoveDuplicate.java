//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 4
//Due Date: 2/24/16
//************************
package prob1;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(34);
		numbers.add(5);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(4);
		numbers.add(33);
		numbers.add(2);
		numbers.add(2);
		numbers.add(4);
		//print original numbers
		System.out.print("Input Numbers: ");
		for(int i = 0; i < numbers.size(); i++)
			System.out.print(numbers.get(i) + " ");
		
		
		System.out.println();
		
		removeDuplicate(numbers);
		
		//print Distinct Numbers
		System.out.print("Distinct Numbers: ");
		for(int i = 0; i < numbers.size(); i++)
			System.out.print(numbers.get(i) + " ");
		
	}
	
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		//create a temp array
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++)
		  {
			
			
			if(!temp.contains(list.get(i)))//if temp doesn't contain a number
				{
					temp.add(list.get(i));//add it
				}
		  }
		  
		list.clear();
		  
		for(int i = 0; i < temp.size(); i++)
		  {
			  list.add(temp.get(i));//print temp array
		  }
	}

}
