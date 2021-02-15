
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		garage = true;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}

	public void draw() {
		
	}
	
	public String displayData() {
		
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", numRentableUnits=" + numRentableUnits + ", projectName="
				+ projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", displayData()=" + displayData()
				+ ", isGarage()=" + isGarage() + ", getNumBedrooms()=" + getNumBedrooms() + ", getNumBathrooms()="
				+ getNumBathrooms() + ", isLaundryRoom()=" + isLaundryRoom() + ", toString()=" + super.toString()
				+ ", getNumRentableUnits()=" + getNumRentableUnits() + ", getProjectName()=" + getProjectName()
				+ ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet()
				+ ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubgroup()=" + getSubgroup() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
