
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building(){
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = this.projectName;
		completeAddress = this.completeAddress;
		totalSquareFeet = this.totalSquareFeet;
		occupancyGroup = this.occupancyGroup;
		subgroup = this.subgroup;
	}
	
	public void draw() {
		
	}
	
	public String displayData() {
		
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	
	
	

}
