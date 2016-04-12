package customException;

public class IllegalIdException extends RuntimeException{
	
	public IllegalIdException(String name, int id, String gender){
		super("Employees that require review: " + name + " " + id + " " + gender);
	}

}
