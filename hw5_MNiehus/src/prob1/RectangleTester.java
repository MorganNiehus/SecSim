package prob1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class RectangleTester {

	public static void main(String[] args) throws IOException{
		
		File infill = new File("rectangles.txt");
		Scanner s = new Scanner(infill);
		
		Rectangle r1 = new Rectangle(0, 0);
		
		while (s.hasNext()){
			r1.setWidth(s.nextDouble());
			r1.setHeight(s.nextDouble());
		}
		s.close();
		
		File newInfill = new File("IllegalRectangles.txt");
		if(newInfill.exists()){
			System.exit(1);
		}
		
		PrintWriter output = new PrintWriter(newInfill);
		
		output.print(r1);
		
		output.close();
		
		
		

		
	}

}