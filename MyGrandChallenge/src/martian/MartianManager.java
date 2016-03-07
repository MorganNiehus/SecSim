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
	
	public String groupSpeak(){
		StringBuilder msg = new StringBuilder();
		for(Martian m : martians){
			msg.append(m.speak() + "\n");
		}
		return msg.toString();
	}
	
	public String groupTeleport(String dest){
		StringBuilder msg = new StringBuilder();
		for(ITeleporter m : teleporters){
			msg.append(m.teleport(dest) + "\n");
		}
		return msg.toString();
	}

}
