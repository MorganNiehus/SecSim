package martian;

public class GreenMartian extends Martian implements ITeleporter{
	
	public GreenMartian(int id){
		super(id);
	}
	
	public String speak(){
		return getId() + "Grubly Grock";
	}
	
	@Override
	public String teleport(String dest){
		return getId() + "Teleporting to " + dest;
	}
	
	@Override
	public String toString(){
		return "Green " +  super.toString();
	}

}
