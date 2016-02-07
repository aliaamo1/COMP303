package comp303.mod1;


public class Employee implements Cloneable {

	 private final String name = "po";
	 private  String designation;
	 public int[] dob = {1,2,95};

	 public Employee() {
	 this.setDesignation("Programmer");
	 }
	 public String getDesignation() {
	 return designation;
	 }

	 public void setDesignation(String designation) {
	 this.designation = designation;
	 }

	 public String getName() {
	 return name;
	 }

	 //public void setName(String name) {
	// this.name = name;
	 //}

	 public Employee clone() {
		 try{
			 return (Employee) super.clone();
		 }
		 catch (CloneNotSupportedException exception) {
			 return null;
		 }
	 }
	}

	
	
