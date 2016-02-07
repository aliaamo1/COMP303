package comp303.mod1;



public class Test {
	
	public static void main(String[] args) {
	Department department = new Department(1, "Finance");
	EmployeeC originalEmployee = new EmployeeC(1, "Ram", department);
	
	/*
	 * Shallow copy - clonedEmployeeC and originalEmployee both share the same 
	 * reference to originalEmployee's department
	 * */
	EmployeeC clonedEmployee = new EmployeeC(originalEmployee); 
	
	System.out.println("Orinigal:- " + originalEmployee.toString());
	System.out.println("Duplicate:- " + clonedEmployee.toString());
	
	
	clonedEmployee.getDepartment().setName("Equity");
	
	System.out.println("Orinigal:- " + originalEmployee.toString());
	System.out.println("Duplicate:- " + clonedEmployee.toString());
	
	}

}
