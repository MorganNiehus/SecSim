import java.util.ArrayList;

public abstract class Instrument {
	
	private String playerName;
	
	protected Instrument(String playerName){
		this.playerName = playerName;
	}
	
	public String getName(){
		return playerName;
	}
	
	public abstract String play();
	
}
