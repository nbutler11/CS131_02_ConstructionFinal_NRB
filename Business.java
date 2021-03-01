/**
 * This class extends the Building class. This class has methods to displayData and draw the building 
 * code to the screen. It also has setters and getters for the variables in the class. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - Business class
 * 2/28/2021
 * Spring 2021
 */
public class Business extends Building {
	protected int numRentableUnits;
	
	/**
	 * Empty constructor that calls on super constructor and  sets all the variables
	 */
	public Business() {
		super();
		numRentableUnits=0;
	}//end constructor
	
	/**
	 * Constructor that calls on super constructor to set all variables
	 * @param projectName name of project
	 * @param completeAddress full address
	 * @param totalSquareFeet square feet 
	 * @param occupancyGroup based off table
	 * @param subgroup based off the table
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		projectName = this.projectName;
		completeAddress = this.completeAddress;
		totalSquareFeet = this.totalSquareFeet;
		occupancyGroup = this.occupancyGroup;
		subgroup = this.subgroup;
	}//end constructor
	
	/**
	 * Method that calls the drawing code to the screen
	 */
	public void draw() {
		System.out.println("\nDrawing Code for Business Building.");
	}//end draw
	
	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	public String displayData() {
		String building = "\nProject Name: " + projectName;
		building = building + "\nAddress: " + completeAddress;
		building = building + "\nSquare Feet: " + totalSquareFeet;
		building = building + "\nOccupancyGroup: " + occupancyGroup;
		building = building + "\nOccupancy Subgroup: " + subgroup;
		building = building + "\nNumber of Rentable Units: " + numRentableUnits;
		return building;
	}//end displayData
	
	/**
	 * Finds the number of units available to rent
	 * @return number of rentable units in place
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end get units

	/**
	 * Sets the number of units available
	 * @param numRentableUnits number of rentable units
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end set units

	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits= " + numRentableUnits + ", projectName= " + projectName + 
				",\n completeAddress= " + completeAddress + ", totalSquareFeet= " + totalSquareFeet + 
				",\n occupancyGroup= " + occupancyGroup + ", subgroup= " + subgroup + "]";
	}//end toString
	
}//end class
