/**
 * Super class that sets the instance variables about a property. 
 * This class will be overridden and extended to all other classes. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - Building Class
 * 2/28/2021
 * Spring 2021
 */
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	/**
	 * Empty constructor that sets all initial variables
	 */
	public Building(){
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end constructor
	
	/**
	 * Constructor that sets all variables
	 * @param projectName name of project
	 * @param completeAddress full address
	 * @param totalSquareFeet square feet 
	 * @param occupancyGroup based off table
	 * @param subgroup based off the table
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end constructor
	
	/**
	 * Method that calls the drawing code to the screen
	 */
	public void draw() {
		System.out.println("\nDrawing Code for Building.");
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
		return building;
	}//end displayData

	/**
	 * Method that finds the name of the project
	 * @return the name of the project
	 */
	public String getProjectName() {
		return projectName;
	}//end get name

	/**
	 * Method that sets the project name
	 * @param projectName name of the project
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end set name

	/**
	 * Method that finds the address
	 * @return address
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end get address

	/**
	 * Sets address of property
	 * @param completeAddress address of property
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end set address

	/**
	 * Finds the area of the property
	 * @return the area of the property
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end get square feet

	/**
	 * Sets the area of the property
	 * @param totalSquareFeet total area of the property
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end set square feet

	/**
	 * Finds the occupancy group
	 * @return occupancy group 
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end get occupancy group

	/**
	 * Sets the building occupancy group
	 * @param occupancyGroup based off building codes
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end set occupancy group

	/**
	 * Method finds the subgroup 
	 * @return subgroup off table
	 */
	public String getSubgroup() {
		return subgroup;
	}//end get subgroup

	/**
	 * sets the subgroup based off table code
	 * @param subgroup based off table
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end set subgroup

	/**
	 * Method displays data in a formatted string
	 * @return data in a formatted string
	 */
	@Override
	public String toString() {
		return "Building [projectName= " + projectName + ", completeAddress= " + completeAddress + ",\n totalSquareFeet= "
				+ totalSquareFeet + ", occupancyGroup= " + occupancyGroup + ", subgroup= " + subgroup + "]";
	}//end to string
	
}//end class
