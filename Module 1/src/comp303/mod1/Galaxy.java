package comp303.mod1;

public class Galaxy {
	
	/**
	 * Regular constructor
	 * @param aMass Mass of galaxy
	 * @param aName Name of galaxy
	 * */
	public Galaxy(double aMass, String aName) {
	  fMass = aMass;
	  fName = aName;
	}
	
	/**
	 * Copy constructor
	 * @param aGalaxy An instance of class Galaxy
	 * */
	
	public Galaxy(Galaxy aGalaxy) {
		this(aGalaxy.getMass(), aGalaxy.getName());
	}
	
	/**
	 * @return Mass of galaxy is returned*/
	public double getMass() {
		return fMass;
	}
	
	public String getName() {
		return fName;
	}
	
	public void setMass(double aMass) {
		fMass = aMass;
	}
	

	private double fMass;
	private final String fName;
	
	public static void main(String[] args) {
		Galaxy m101 = new Galaxy(15.0, "M101");
		
		Galaxy m101CopyOne = new Galaxy(m101);
		m101CopyOne.setMass(25.0);
		System.out.println("M101 mass: " + m101.getMass());
		System.out.println("M101Copy mass: " + m101CopyOne.getMass());
	}
}
