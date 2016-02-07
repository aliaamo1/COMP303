package comp303.mod1;

public class EmployeeC {
	 
    private String name;
    private int id;
    private Department department;
 
    public Department getDepartment() {
        return department;
    }
 
    public String getName() {
        return name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setDepartment(Department department) {
        this.department = department;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    /** 
     * Regular constructor
     * */
    public EmployeeC(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
 
    /* Shallow copy constructor
    public EmployeeC(EmployeeC oldEmployee) {
        this.id = oldEmployee.id;
        this.name = oldEmployee.name;
        this.department = oldEmployee.department;  //shallow cloning
    } */
 
    /* Deep copy constructor */
    public EmployeeC(EmployeeC oldEmployee) {
    	this.id = oldEmployee.id;
    	this.name = oldEmployee.name;
    	this.department = new Department(oldEmployee.department);
    }
    
    @Override
    public String toString() {
        return "Employee Id: " + id + "\tEmployee Name: " + name + "\t" + department;
    }
}
