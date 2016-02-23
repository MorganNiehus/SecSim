package martian;

public class RedMartian extends Martian{

	public RedMartian(int id){
		super(id);
	}
	
	public String speak(){
		return getId() + "Rublby Rock";
	}
	
	public String toString(){
		return "Red " + super.toString();
	}
	
}
