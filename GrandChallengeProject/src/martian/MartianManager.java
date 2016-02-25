package martian;

import java.util.ArrayList;

public class MartianManager {
	
	private ArrayList<Martian> martians = new ArrayList<>();
	private ArrayList<ITeleporter> teleporters = new ArrayList<>();

	
	public boolean addMartian(Martian m){
		if(!martians.contains(m)){
			
			martians.add(m);
			
			if(m instanceof GreenMartian){
				teleporters.add((GreenMartian)m);
			}
			return true;
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		MartianManager cman = new MartianManager();
		
		for(Martian m : martians){
			cman.addMartian((Martian)m.clone());
		}
		
		return cman;
	}
	
	public Martian getMartianClosestToId(int id){
		Martian closest = null;
		int minDist = Integer.MAX_VALUE;
		for(Martian m : martians){
			int dist = Math.abs(m.getId()-id);
			
			if(dist < minDist){
				minDist = dist;
				closest = m;
			}
		}
		return closest;
	}
	
	public String groupSpeak(){
		StringBuilder msg = new StringBuilder();
		for(Martian m : martians){
			msg.append(m.speak() + "\n");
		}
		return msg.toString();
	}
	
	public String groupTeleport(String dest){
		
	}
	
	
	
	
	
	
	
	
	
	


}
