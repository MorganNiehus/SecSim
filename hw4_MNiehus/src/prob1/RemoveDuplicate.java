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
		
		removeDuplicate(numbers);
		
		for(int i = 0; i < numbers.size(); i++)
			System.out.print(numbers.get(i) + " ");
		
		
		System.out.println();
		
		

		

	}
	
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i < list.size(); i++)
		{
			if(list.contains(i))
			{
				temp.add(i);
			}
		}
		list.clear();
		
		for(int i = 0; i < temp.size(); i++)
		{
			list.add(temp.get(i));
		}
	}

}
