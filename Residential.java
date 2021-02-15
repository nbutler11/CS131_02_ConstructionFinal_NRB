
public class Residential extends Business{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = true;
	}
	

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}



	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}


	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + ", getNumBedrooms()=" + getNumBedrooms()
				+ ", getNumBathrooms()=" + getNumBathrooms() + ", isLaundryRoom()=" + isLaundryRoom()
				+ ", getNumRentableUnits()=" + getNumRentableUnits() + ", toString()=" + super.toString()
				+ ", displayData()=" + displayData() + ", getProjectName()=" + getProjectName()
				+ ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet()
				+ ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
