//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 8
//Due Date: 4/24/16
//************************
package prob1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise21_1 {
	
	public static void main(String[] args){
		ArrayList<String> names1 = new ArrayList<>();
		ArrayList<String> names2 = new ArrayList<>();
		
		names1.add("George");
		names1.add("Jim");
		names1.add("John");
		names1.add("Blake");
		names1.add("Kevin");
		names1.add("Michael");
		names2.add("George");
		names2.add("Katie");
		names2.add("Kevin");
		names2.add("Michelle");
		names2.add("Ryan");
		
		
		HashSet<String> set1 = new HashSet<>(names1);//set 1
		HashSet<String> set2 = new HashSet<>(names2);//set 2
		
		HashSet<String> set1Clone1 = (HashSet<String>) set1.clone();//set1 clone
		HashSet<String> set2Clone2 = (HashSet<String>) set2.clone();//set2 clone
		
		HashSet<String> union = new HashSet(set1);//union with set 1
		union.addAll(set2);//add all the elements from 2
		
		HashSet<String> difference = new HashSet(set1);//difference with set 1
		difference.addAll(set2);//add all from set2
		difference.removeAll(set2);//remove all from set2
		
		HashSet<String> intersection = new HashSet(set1);//add all from one
		intersection.retainAll(set2);//retain all from 2
		
		//printing
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Union: " + union);
		System.out.println("Difference: " + difference);
		System.out.println("Intersection: " + intersection);
	}
}
