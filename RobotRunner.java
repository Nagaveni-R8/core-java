class RobotRunner{

    public static void main(String[] rapbot){
	
	    //ClassName ref = new Constructor;
		
	    Robot robot = new Robot("Shark Ninja", "100 Tb", 1.0, "10000ma", 50, true);
		
		/*robot.companyName = "Shark Ninja";
		robot.memorySize = "100 Tb";
		robot.version = 1.0;
		robot.batteryConsumption = "10000ma";
		robot.noOfSensors = 50;
		robot.isCameraAdded	= true;*/
		
		/*System.out.println(robot.companyName);
		System.out.println(robot.memorySize);
		System.out.println(robot.version);
		System.out.println(robot.batteryConsumption);
		System.out.println(robot.noOfSensors);
		System.out.println(robot.isCameraAdded);*/

	    robot.displayDetails();
	
	}



}