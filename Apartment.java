/**
 * This class is extends the Residential class which extends the Building class. This class has methods to displayData and draw the building 
 * code to the screen. It also has setters and getters for the variables in the class. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - Apartment class
 * 2/28/2021
 * Spring 2021
 */
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * Empty constructor that calls on super constructor and  sets all the variables
	 */
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = true;
	}//end constructor
	
	/**
	 * Constructor that calls on super constructor to set all variables
	 * @param projectName name of project
	 * @param completeAddress full address
	 * @param totalSquareFeet square feet 
	 * @param occupancyGroup based off table
	 * @param subgroup based off the table
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}//end constructor

	/**
	 * Method that calls the drawing code to the screen
	 */
	public void draw() {
		System.out.println("\nDrawing Code for Apartment.");
	}//end draw
	
	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	public String displayData() {
		String isParkAvail = "";
		String laundry = ""; 
		
		if(laundryRoom == true)
			laundry = "Y";
		else if(laundryRoom = false)
			laundry = "N";
		if(parkingAvailable == true)
			isParkAvail = "Y";
		else if(parkingAvailable == false)
			isParkAvail = "N";
		
		String building = "\nProject Name: " + projectName;
		building = building + "\nAddress: " + completeAddress;
		building = building + "\nSquare Feet: " + totalSquareFeet;
		building = building + "\nOccupancyGroup: " + occupancyGroup;
		building = building + "\nOccupancy Subgroup: " + subgroup;
		building = building + "\nNumber of Rentable Units: " + numRentableUnits;
		building = building + "\nAverage Unit Size " + avgUnitSize;
		building = building + "\nNumber of Bedrooms: " + numBedrooms;
		building = building + "\nNumber of Bathrooms: " + numBathrooms;
		building = building + "\nLaundry: " + laundry;
		building = building + "\nParking Available: " + isParkAvail;
		return building;
	}//end displayData

	/**
	 * Finds the number of rentable units
	 * @return the number of rentable units
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end get units

	/**
	 * Sets the number of units available to rent
	 * @param numRentableUnits the number of available units
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end set units

	/**
	 * Finds the average unit size
	 * @return average unit size
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end get average size

	/**
	 * Set the average unit size
	 * @param avgUnitSize average unit size
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end set average size

	/**
	 * Find if parking is available
	 * @return true if parking is available, false if not
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end is parking

	/**
	 * Set true if parking is available
	 * @param parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end set parking

	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ",\n projectName=" + projectName + ", completeAddress="
				+ completeAddress + ",\n totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class
