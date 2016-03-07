package martian;

public abstract class Martian implements Comparable<Martian>,Cloneable {
	
	private int id;
	private int volume = 1;
	
	public Martian(int id){
		this.id = id;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public int compareTo(Martian m){
		return this.getId() - m.getId();
	}
	
	@Override
	public boolean equals(Object o){
		Martian m = (Martian)o;
		if(this.id == m.getId() ){
			return true;
		}
		else
			return false;
	}
	
	public int getId(){
		return id;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
	public abstract String speak();
	
	@Override
	public String toString(){
		return String.format("Martian id = %d vol = %d", id, volume);
		
	}
}
