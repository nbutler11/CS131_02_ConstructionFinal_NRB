/**
 * This class is the application of all classes and instantiates building, business, 
 * residential, mall, and apartment classes.
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 2 - Construction Application Class
 * 2/28/2021
 * Spring 2021
 */
public class ConstructionApplication {
	public static void main(String[] args) {
		
		Building myBuild = new Building();
		Building myB = new Building("Brady House", "287 East Street | Louisville, Kentucky 40208", 
				1078, "Residential", "R1");
		myBuild.setProjectName("Park Hill Mall");
		myBuild.setCompleteAddress("3 Parkway Drive | Louisville, Kentucky 40219");
		myBuild.setTotalSquareFeet(30671);
		myBuild.setOccupancyGroup("Business");
		myBuild.setSubgroup("B");
		
		System.out.println(myBuild.getProjectName() + ", "  + myBuild.getCompleteAddress() + ", " + 
				myBuild.getTotalSquareFeet() + ", " + myBuild.getOccupancyGroup() + ", " + myBuild.getSubgroup());
		System.out.println(myB.toString());
		myBuild.draw();
		System.out.println(myB.displayData());
		
		
		Residential myRes = new Residential("Gronk House", "304 West Street | Louisville, Kentucky 40208", 
				2078, "Residential", "R1");
		Residential myR = new Residential();
		myR.setProjectName("University Apartments");
		myR.setCompleteAddress("3 Parkway Drive | Louisville, Kentucky 40205");
		myR.setTotalSquareFeet(1240);
		myR.setOccupancyGroup("Residential");
		myR.setSubgroup("R-2");
		myR.setNumBedrooms(4);
		myR.setNumBathrooms(2);
		myR.setLaundryRoom(false);
		
		myRes.setNumBedrooms(3);
		myRes.setNumBathrooms(2);
		myRes.setLaundryRoom(true);
		
		System.out.println(myR.getProjectName() + ", "  + myR.getCompleteAddress() + ", " + 
				myR.getTotalSquareFeet() + ", " + myR.getOccupancyGroup() + ", " + myR.getSubgroup()
				+ ", " + myR.getNumBedrooms() + ", " + myR.getNumBathrooms() + ", " + myR.isLaundryRoom());
		System.out.println("\n"+myRes.toString());
		myRes.draw();
		System.out.println(myRes.displayData());
		
		Business myBus = new Business();
		Business strip = new Business("North Strip", "402 Milwaukee Street | Louisville, Kentucky 40206", 
				30209, "Business", "B");
		myBus.setProjectName("South Plaza");
		myBus.setCompleteAddress("42 Norway Lane | Louisville, Kentucky 40215");
		myBus.setTotalSquareFeet(19240);
		myBus.setOccupancyGroup("Business");
		myBus.setSubgroup("B");
		myBus.setNumRentableUnits(45);
		
		strip.setNumRentableUnits(198);
		System.out.println("\n" + myBus.getProjectName() + ", "  + myBus.getCompleteAddress() + ", " + 
				myBus.getTotalSquareFeet() + ", " + myBus.getOccupancyGroup() + ", " + myBus.getSubgroup()
				+ ", " + myBus.getNumRentableUnits());
		System.out.println(strip.toString());
		strip.draw();
		System.out.println(strip.displayData());
		
		Mall myMall = new Mall();
		Mall WestPines = new Mall("West Pines", "31 Hanley Downs | Saint Louis, Missouri 63152", 
				50014, "Business", "B");
		
		myMall.setProjectName("North County");
		myMall.setCompleteAddress("24 Northern Road | Louisville, Kentucky 40219");
		myMall.setTotalSquareFeet(170240);
		myMall.setOccupancyGroup("Business");
		myMall.setSubgroup("B");
		myMall.setNumRentableUnits(450);
		myMall.setNumRentedUnits(329);
		myMall.setMedianUnitSize(600);
		myMall.setNumParkingSpaces(20465);
		
		WestPines.setNumRentableUnits(370);
		WestPines.setNumRentedUnits(298);
		WestPines.setMedianUnitSize(370);
		WestPines.setNumParkingSpaces(19465);
		System.out.println("\n" + myMall.getProjectName() + ", "  + myMall.getCompleteAddress() + ", " + 
				myMall.getTotalSquareFeet() + ", " + myMall.getOccupancyGroup() + ", " + myMall.getSubgroup()
				+ ", " + myMall.getNumRentableUnits() + ", " + myMall.getNumRentedUnits() + ", " + 
				myMall.getMedianUnitSize() + ", " + myMall.getNumParkingSpaces());
		System.out.println(WestPines.toString());
		WestPines.draw();
		System.out.println(WestPines.displayData());
		
		Apartment myApart = new Apartment();
		Apartment College = new Apartment("College Apartments", "143 Newburg Road | Louisville, Kentucky 40205", 
				12600, "Residential", "R-2");
		
		myApart.setProjectName("Railroad Apartments");
		myApart.setCompleteAddress("75 Railway Drive | Louisville, Kentucky 40209");
		myApart.setTotalSquareFeet(21240);
		myApart.setOccupancyGroup("Residential");
		myApart.setSubgroup("R-2");
		myApart.setNumBedrooms(4);
		myApart.setNumBathrooms(2);
		myApart.setLaundryRoom(true);
		myApart.setNumRentableUnits(180);
		myApart.setAvgUnitSize(610);
		myApart.setParkingAvailable(true);
		
		College.setNumBedrooms(2);
		College.setNumBathrooms(1);
		College.setLaundryRoom(true);
		College.setNumRentableUnits(220);
		College.setAvgUnitSize(430);
		College.setParkingAvailable(true);
		

		System.out.println("\n"+ myApart.getProjectName() + ", "  + myApart.getCompleteAddress() + ",\n " + 
				myApart.getTotalSquareFeet() + ", " + myApart.getOccupancyGroup() + ", " + myApart.getSubgroup()
				+ ",\n " + myApart.getNumBedrooms() + ", " + myApart.getNumBathrooms() + ", " + myApart.isLaundryRoom()
				+ ", " + myApart.getNumRentableUnits() + ", " + myApart.getAvgUnitSize() + ", " + 
				myApart.isParkingAvailable());
		System.out.println(College.toString());
		myApart.draw();
		System.out.println(myApart.displayData());
		
		SingleFamilyHome myHome = new SingleFamilyHome();
		SingleFamilyHome House = new SingleFamilyHome("Girl House", "489 South Street | Louisville, Kentucky 40221", 
				2000, "Residential", "R-1");
		
		myHome.setProjectName("Boy House");
		myHome.setCompleteAddress("5731 Trailway Drive | Louisville, Kentucky 40213");
		myHome.setTotalSquareFeet(1025);
		myHome.setOccupancyGroup("Residential");
		myHome.setSubgroup("R-1");
		myHome.setNumBedrooms(5);
		myHome.setNumBathrooms(2);
		myHome.setLaundryRoom(true);
		myHome.setGarage(false);
		
		House.setNumBedrooms(4);
		House.setNumBathrooms(2);
		House.setLaundryRoom(false);
		House.setGarage(true);
		
		System.out.println("\n"+ myHome.getProjectName() + ", "  + myHome.getCompleteAddress() + ",\n " + 
				myHome.getTotalSquareFeet() + ", " + myHome.getOccupancyGroup() + ", " + myHome.getSubgroup()
				+ ",\n " + myHome.getNumBedrooms() + ", " + myHome.getNumBathrooms() + ", " + myHome.isLaundryRoom()
				+ ", " + myHome.isGarage());
		System.out.println(House.toString());
		myHome.draw();
		System.out.println(myHome.displayData());
		
	}//end main

}//end class
