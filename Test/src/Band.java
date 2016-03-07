import java.util.ArrayList;

public class Band {

	ArrayList<Instrument> instrums = new ArrayList<>();
	
	public boolean addInstrument(Instrument i){
		if(!instrums.contains(i)){
			instrums.add(i);
			return true;
		}
		else
			return false;
	}
	
	public String allPlay(){
		StringBuilder msg = new StringBuilder();
		for(Instrument i : instrums){
			msg.append(i.play() + "\n");
		}
		return msg.toString();
	}
	
}
