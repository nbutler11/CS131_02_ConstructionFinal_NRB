/**
 * This class extends the Building class. This class has methods to displayData and draw the building 
 * code to the screen. It also has setters and getters for the variables in the class. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - Residential class
 * 2/28/2021
 * Spring 2021
 */
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	/**
	 * Empty constructor that calls on super constructor and  sets all the variables
	 */
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = true;
	}//end constructor
	
	/**
	 * Constructor that calls on super constructor to set all variables
	 * @param projectName name of project
	 * @param completeAddress full address
	 * @param totalSquareFeet square feet 
	 * @param occupancyGroup based off table
	 * @param subgroup based off the table
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}//end constructor

	/**
	 * Method that calls the drawing code to the screen
	 */
	public void draw() {
		System.out.println("\nDrawing Code for Residential Building.");
	}//end draw
	
	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	public String displayData() {
		String laundry = ""; 
		
		if(laundryRoom == true)
			laundry = "Y";
		else if(laundryRoom = false)
			laundry = "N";
		
		String building = "\nProject Name: " + projectName;
		building = building + "\nAddress: " + completeAddress;
		building = building + "\nSquare Feet: " + totalSquareFeet;
		building = building + "\nOccupancyGroup: " + occupancyGroup;
		building = building + "\nOccupancy Subgroup: " + subgroup;
		building = building + "\nNumber of Bedrooms: " + numBedrooms;
		building = building + "\nNumber of Bathrooms: " + numBathrooms;
		building = building + "\nLaundry Room: " + laundry;
		return building;
	}//end displayData

	/**
	 * Find the number of bedrooms
	 * @return number of bedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end get bedroom

	/**
	 * Sets the number of bedrooms
	 * @param numBedrooms number of bedrooms
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end set bedroom

	/**
	 * Finds the number of bathrooms
	 * @return the number of bathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end get bathrooms

	/**
	 * Sets the number of bathrooms
	 * @param numBathrooms number of bathrooms
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end set Bathrooms

	/**
	 * Finds if there is a laundry room
	 * @return laundryRoom true is there is a laundry room
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end is laundry

	/**
	 * Set laundry room to true if there is laundry room
	 * @param laundryRoom is there a laundry room
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end set laundry

	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms= " + numBedrooms + ", numBathrooms= " + numBathrooms + ", laundryRoom= "
				+ laundryRoom + ",\n projectName= " + projectName + ", completeAddress= " + completeAddress 
				+ ",\n totalSquareFeet= " + totalSquareFeet + ", occupancyGroup= " 
				+ occupancyGroup + ", subgroup= " + subgroup + "]";
	}//end toString
	
}//end class
