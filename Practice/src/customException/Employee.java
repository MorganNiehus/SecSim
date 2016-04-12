package customException;

public class Employee{
	
	private String name;
	private int id;
	private String gender;
	
	public Employee(){
		
	}
	
	public Employee(String name, int id, String gender){
		this.name = name;
		this.id = id;
		this.gender = gender;
		
		if(id < 1000){
			throw new IllegalIdException(name, id, gender);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString(){
		String result = "Name: " + getName() + " " + "ID: " + getId() + "Gender: " + getGender();
		return result;
 	}
	
	

}
