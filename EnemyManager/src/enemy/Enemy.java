package enemy;

public abstract class Enemy {
	
	private int id;
	private double damage;
	private double health;
	
	protected Enemy(int id){
		this.id = id;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public Object compareTo(Enemy e){
		return this.getId() - e.getId();
	}
	
	
	
	

}
