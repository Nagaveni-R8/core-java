class House{

    int houseId;
	int noOfRooms;
	int noOfFloors;
	String houseName;
	int areaInSqrt;
	int noOfMembers;
    
	//Parameterized Constructor
	
    public House(int houseId, int noOfRooms, int noOfFloors, String houseName, int areaInSqrt, int noOfMembers){
		
		this.houseId = houseId;
		this.noOfRooms = noOfRooms;
		this.noOfFloors = noOfFloors;
		this.houseName = houseName;
		this.areaInSqrt = areaInSqrt;
		this.noOfMembers = noOfMembers;
	}
	
	public void readDetails(){
		
		System.out.println("The House Id is " + this.houseId);
		System.out.println("The Number of Rooms is " + this.noOfRooms);
		System.out.println("The Number of Floors is " + this.noOfFloors);
		System.out.println("The House name is " + this.houseName);
		System.out.println("The Area Square feet is " + this.areaInSqrt);
		System.out.println("The Number of Members is " + this.noOfMembers);
		
		
	}
}