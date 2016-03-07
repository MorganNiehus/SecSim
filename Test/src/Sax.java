
public class Sax extends Instrument{
	
	private String note;
	
	public Sax(String playerName, String note){
		super(playerName);
		this.note = note;
	}
	
	public String getNote(){
		return note;
	}
	
	public String play(){
		return getName() + " Sax " + getNote(); 
	}

}
