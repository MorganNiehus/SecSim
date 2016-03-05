package martian;

public class RedMartian extends Martian{

	public RedMartian(int id){
		super(id);
	}
	
	@Override
	public String speak(){
		return getId() + " Rubly Red";
	}
	
	@Override
	public String toString(){
		return "Red " + super.toString();
	}
	
}
