//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 8
//Due Date: 4/24/16
//************************
package prob3;

import java.util.Comparator;

public class NameComparator implements Comparator<Player>{
	public int compare(Player p1, Player p2){
		return p1.getName().compareTo(p2.getName());
	}
}
