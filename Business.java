
public class Business extends Building {
	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits=0;
	}
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		projectName = this.projectName;
		completeAddress = this.completeAddress;
		totalSquareFeet = this.totalSquareFeet;
		occupancyGroup = this.occupancyGroup;
		subgroup = this.subgroup;
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", getNumRentableUnits()=" + getNumRentableUnits() + ", displayData()="
				+ displayData() + ", getProjectName()=" + getProjectName() + ", getCompleteAddress()="
				+ getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()="
				+ getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
