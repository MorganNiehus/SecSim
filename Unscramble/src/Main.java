import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args){
		
		 String[] words = {"lefty", "righty", "brick"};
		 
		 String word = "yftle";
		 
		 isolate(word, words);
		 
		
	}
	
	public static void isolate(String word, String[] list){
		
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i].indexOf(word));
		}
		
	}

}
