
public class Trumpet extends Instrument{
	
	private String note;
	
	public Trumpet(String playerName, String note){
		super(playerName);
		this.note = note;
	}
	
	public String getNote(){
		return note;
	}
	
	public String play(){
		return getName() + " Trumpet " + getNote();
	}

}
