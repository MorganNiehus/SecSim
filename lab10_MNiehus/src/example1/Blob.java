package example1;

public class Blob {
	private int age;
	private int volume;

	public Blob(int age, int volume) {
		super();
		this.age = age;
		this.volume = volume;
	}

	public int getAge() {
		return age;
	}
	public int getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "(age=" + age + ":volume=" + volume +")";
	}
	
}
