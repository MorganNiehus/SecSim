//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 8
//Due Date: 4/24/16
//************************
package prob3;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Games2 {
	
	public static void main(String[] args){
		Player p1 = new Player("Benito", 33);
		Player p2 = new Player("Quincy", 14);
		Player p3 = new Player("Lean", 22);
		Player p4 = new Player("Carly", 41);
		Player p5 = new Player("Pepper", 18);
		
		TreeSet<Player> team = new TreeSet<>(new NameComparator());
		TreeSet<Player> pointTeam = new TreeSet<>(new PointsComparator());
		
		team.addAll(Arrays.asList(p1,p2,p3,p4,p5));
		System.out.println("\nPlayers sorted by name:");
		for(Player p : team) System.out.println(p);
		
		pointTeam.addAll(Arrays.asList(p1,p2,p3,p4,p5));
		System.out.println("\nPlayers sorted by points:");
		for(Player p : pointTeam) System.out.println(p);
		
		Set<Player> big = getPlayersAbove(team,20);
		System.out.println("\nPlayers with a lot of points:");
		for(Player p : big) System.out.println(p);


	}
	
	public static Set<Player> getPlayersAbove(TreeSet<Player> team, int value){
		Player p = new Player("dummy", value);//create dummy
		team.add(p);//add dummy
		TreeSet<Player> organSet = new TreeSet<>(new PointsComparator());//organized set
		organSet.addAll(team);//add all the players
		Set<Player> sets = (TreeSet<Player>)organSet.tailSet(p);//get the tail set
		sets.remove(p);//remove the dummy
		return sets;
	}
	
}
