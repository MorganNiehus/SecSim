package customException;

import java.io.*;
import java.util.*;

public class EmployeeTester {

	public static void main(String[] args) throws IOException{
		File infile = new File("EmployeeDraftSheet.txt");
		Scanner s = new Scanner(infile);
		
		while(s.hasNext()){
			String name = s.next() + " " + s.next();
			addEmps(name, s.nextInt(), s.next());
		}
	}
	
	public static void addEmps(String name, int id, String gender)throws IOException{
		try{
		Employee empTest = new Employee(name, id, gender);
		}
		catch(IllegalIdException e){
			File voidList = new File("DeniedApplicants.txt");
			PrintWriter output = new PrintWriter(new FileOutputStream(voidList, true));
			
			output.println(e.getMessage());
			output.close();
		}
	}
}
