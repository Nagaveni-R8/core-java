class Robot{

                String companyName;
                String memorySize;
				double version;
				String batteryConsumption;
				int noOfSensors;
				boolean isCameeraAdded;
			
	    public Robot(String companyName, String memorySize, double version, String batteryConsumption, int noOfSensors, boolean isCameeraAdded){
		
			this.companyName = companyName;
			this.memorySize = memorySize;
			this.version = version;
			this.batteryConsumption = batteryConsumption;
			this.noOfSensors = noOfSensors;
			this.isCameeraAdded = isCameeraAdded;
		}
        public void server(){
		
		    System.out.println("Serve Food");
		
		}
		
		public void displayDetails(){
			
			System.out.println("The Company Name is " + this.companyName);
			System.out.println("The Memory Size is " + this.memorySize);
			System.out.println("The Version is " + this.version);
			System.out.println("The Battery Consumption is " + this.batteryConsumption);
			System.out.println("The Number of Sensos is " + this.noOfSensors);
			
		}
}