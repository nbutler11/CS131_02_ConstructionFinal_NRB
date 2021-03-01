/**
 * This class is extends the Business class which extends the Building class. This class has methods to displayData and draw the building 
 * code to the screen. It also has setters and getters for the variables in the class. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - Mall class
 * 2/28/2021
 * Spring 2021
 */
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * Empty constructor that calls on super constructor and  sets all the variables
	 */
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end constructor
	
	/**
	 * Constructor that calls on super constructor to set all variables
	 * @param projectName name of project
	 * @param completeAddress full address
	 * @param totalSquareFeet square feet 
	 * @param occupancyGroup based off table
	 * @param subgroup based off the table
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}//end constructor

	/**
	 * Method that calls the drawing code to the screen
	 */
	public void draw() {
		System.out.println("\nDrawing Code for Mall.");
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
		building = building + "\nNumber of Rented Units: " + numRentedUnits;
		building = building + "\nMedian Unit Size: " + medianUnitSize;
		building = building + "\nNumber of Parking Spaces: " + numParkingSpaces;
		return building;
	}//end displayData

	/**
	 * Finds the number of rented units
	 * @return number of rented units
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end get rented units

	/**
	 * Sets the number of rented units
	 * @param numRentedUnits number of rented units
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end set rented units

	/**
	 * Finds the median unit size
	 * @return the median unit size
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end get unit size

	/**
	 * Sets the median unit size
	 * @param medianUnitSize the median unit size
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end set unit size

	/**
	 * Finds the number of parking spaces
	 * @return the number of parking spaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end get parking spaces

	/**
	 * Set the number of parking spaces
	 * @param numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end set number parking spaces

	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits= " + numRentedUnits + ", medianUnitSize= " + medianUnitSize + ", numParkingSpaces= "
				+ numParkingSpaces + ", numRentableUnits= " + numRentableUnits + ",\n projectName= " + projectName
				+ ", completeAddress= " + completeAddress + ",\n totalSquareFeet= " + totalSquareFeet + ", occupancyGroup= "
				+ occupancyGroup + ", subgroup= " + subgroup + "]";
	}//end toString
	
}//end class
