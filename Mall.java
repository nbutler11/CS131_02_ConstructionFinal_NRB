
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}

	public void draw() {
		
	}
	
	public String displayData() {
		
	}

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + ", displayData()=" + displayData()
				+ ", getNumRentedUnits()=" + getNumRentedUnits() + ", getMedianUnitSize()=" + getMedianUnitSize()
				+ ", getNumParkingSpaces()=" + getNumParkingSpaces() + ", getNumRentableUnits()="
				+ getNumRentableUnits() + ", toString()=" + super.toString() + ", getProjectName()=" + getProjectName()
				+ ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet()
				+ ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
