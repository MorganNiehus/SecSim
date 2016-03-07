package martian;


public abstract class Martian implements Comparable<Martian>, Cloneable{
	
	private int id;
	private int vol = 1;
	
	public Martian(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public boolean equals(Object o){
		Martian m = (Martian)o;
		
		if(this.id == m.getId()){
			return true;
		}
		else
			return false;
	}
	
	public int compareTo(Martian m){
		
		return this.id - m.getId();
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public String toString(){
		String result = "";
		result = "id: " + id + "volume: " + vol;
		return result;
	}
	
	public abstract String speak();
	
	
	
	
	
}
