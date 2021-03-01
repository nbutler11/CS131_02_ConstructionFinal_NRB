/**
 * This class is extends the Residential class which extends the Building class. This class has methods to displayData and draw the building 
 * code to the screen. It also has setters and getters for the variables in the class. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - SingleFamilyHome class
 * 2/28/2021
 * Spring 2021
 */
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	/**
	 * Empty constructor that calls on super constructor and  sets all the variables
	 */
	public SingleFamilyHome() {
		super();
		garage = true;
	}//end constructor
	
	/**
	 * Constructor that calls on super constructor to set all variables
	 * @param projectName name of project
	 * @param completeAddress full address
	 * @param totalSquareFeet square feet 
	 * @param occupancyGroup based off table
	 * @param subgroup based off the table
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}//end constructor

	/**
	 * Method that calls the drawing code to the screen
	 */
	public void draw() {
		System.out.println("\nDrawing Code for Single Family Home.");
	}//end draw
	
	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	public String displayData() {
		String laundry = ""; 
		String parkgarage = "";
		
		if(laundryRoom == true)
			laundry = "Y";
		else if(laundryRoom = false)
			laundry = "N";
		
		if(garage == true)
			parkgarage = "Y";
		else if(garage == false)
			parkgarage = "N";
		
		String home = "\nProject Name: " + projectName;
		home = home + "\nAddress: " + completeAddress;
		home = home + "\nSquare Feet: " + totalSquareFeet;
		home = home + "\nOccupancyGroup: " + occupancyGroup;
		home = home + "\nOccupancy Subgroup: " + subgroup;
		home = home + "\nNumber of Bedrooms: " + numBedrooms;
		home = home + "\nNumber of Bathrooms: " + numBathrooms;
		home = home + "\nLaundry Room: " + laundry;
		home = home + "\nGarage: " + parkgarage;
		return home;
	}//end displayData

	/**
	 * Finds if there is a garage
	 * @return true if there is a garage, false if not
	 */
	public boolean isGarage() {
		return garage;
	}//end garage

	/**
	 * Sets garage to true if there is a garage
	 * @param garage true if there is a garage, false if not
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end set garage

	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ",\n projectName="
				+ projectName + ", completeAddress=" + completeAddress + ",\n totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString

}//end class
