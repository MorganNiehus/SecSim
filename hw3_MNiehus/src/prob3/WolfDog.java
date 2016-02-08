package prob3;

public class WolfDog extends Dog{

	private int meanness;
	
	public WolfDog(int meanness, int age)
	{
		super(age);
		name = "wd";
		this.meanness = meanness;
	}
	
	public WolfDog(int meanness, int age, String name)
	{
		super(age, name);
		this.meanness = meanness;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result = super.toString() + ", meaness: " + meanness;
		return result;
	}
}
