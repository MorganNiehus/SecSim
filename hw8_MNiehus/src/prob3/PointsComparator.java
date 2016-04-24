//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 8
//Due Date: 4/24/16
//************************
package prob3;

import java.util.Comparator;

public class PointsComparator implements Comparator<Player>{
	public int compare(Player p1, Player p2){
		int diff = p1.getPoints() - p2.getPoints();
		if(diff < 0)
			return -1;
		else if(diff > 0)
			return 1;
		else
			return 0;
	}
}
