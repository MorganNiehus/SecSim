//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 8
//Due Date: 4/24/16
//************************
package prob2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class Games {
	
	public static void main(String[] args){
		HashMap<String,Integer> game1 = new HashMap<>();
		game1.put("Chen", 4);
		game1.put("Allie", 9);
		game1.put("Reece", 4);
		game1.put("Skuye", 6);
		game1.put("Meshell", 6);
		HashMap<String,Integer> game2 = new HashMap<>();
		game2.put("Chen", 8);
		game2.put("Zyrene", 4);
		game2.put("Skuye", 2);
		game2.put("Meshell", 3);
		
		System.out.println(getTotals(game1, game2));
	}
	
	public static TreeMap<String, Integer> getTotals(HashMap<String, Integer> game1, HashMap<String, Integer> game2){
		
		TreeMap<String, Integer> tmap = new TreeMap<>();//treemap
		Set<String>g1keys = game1.keySet();//all game 1s keys
		Set<String>g2keys = game2.keySet();//all game 2s keys
		
		g1keys.retainAll(g2keys);// retain all from game2
		
		for(String k : g1keys){
			tmap.put(k, game1.get(k) + game2.get(k));//add all the keys together and put them in the tmap
		}
		return tmap;
	}

}
