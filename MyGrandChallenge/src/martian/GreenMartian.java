package martian;

public class GreenMartian extends Martian implements ITeleporter{
	
	public GreenMartian(int id){
		super(id);
	}
	
	@Override
	public String speak(){
		return getId() + "Greenly";
	}
	
	public String teleport(String dest){
		return getId() + "Teleported to " + dest;
	}
	
	public String toString(){
		return "Green " + super.toString();
	}

}
