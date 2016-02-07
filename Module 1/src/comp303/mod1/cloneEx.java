package comp303.mod1;
public class cloneEx {
	
		 
		public static void main(String arg[]){
	 
			Employee joe = new Employee();
	       // joe.setName("Jamie Zawinski");
	 
	 Employee jcop = joe.clone();
	 System.out.println(jcop.getName());
	 System.out.println(jcop.getDesignation());
	 jcop.dob[0] = 200;
	 System.out.println(joe.dob[0]);
	 
	 
	 
		}

}
