import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2){
		double diff = o1.getSalary() - o2.getSalary();
		if(diff < 0.0) return -1;
		else if(diff > 0.0) return 1;
		else return 0;
	}
}