
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = true;
	}
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}

	public void draw() {
		
	}
	
	public String displayData() {
		
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", displayData()=" + displayData() + ", getNumRentableUnits()="
				+ getNumRentableUnits() + ", getAvgUnitSize()=" + getAvgUnitSize() + ", isParkingAvailable()="
				+ isParkingAvailable() + ", getNumBedrooms()=" + getNumBedrooms() + ", getNumBathrooms()="
				+ getNumBathrooms() + ", isLaundryRoom()=" + isLaundryRoom() + ", toString()=" + super.toString()
				+ ", getProjectName()=" + getProjectName() + ", getCompleteAddress()=" + getCompleteAddress()
				+ ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup()
				+ ", getSubgroup()=" + getSubgroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
