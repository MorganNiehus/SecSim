package Default;

import java.io.*;
import java.util.*;

public class FileReader {
	
	public static void main(String[] args) throws IOException{
		File infile = new File("scores.txt");
		Scanner s = new Scanner(infile);
		
		ArrayList<String> students = new ArrayList<>();
		
		while(s.hasNext()){
			String name = s.next();
			String id = s.nextInt() + "";
			students.add("Student: " + name + " " + "ID: " + id);
		}
		
		File outFile = new File("NeatScores.txt");
		PrintWriter output = new PrintWriter(outFile);
		
		for(String student : students){
			output.println(student);
		}
		output.close();
	}
	

}
