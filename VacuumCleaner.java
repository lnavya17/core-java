class VacuumCleaner{
	static boolean isTurned;
	static int currentSpeed;
	static int maxSpeed=8;
	static int minSpeed;
	
	static boolean onOrOff(){
		
		if(isTurned==false){
		
			isTurned=true;
			System.out.println("The VacuumCleaner is turned on...");
		
		}else if(isTurned==true){
		
			isTurned=false;
			System.out.println("The VacuumCleaner is turned off...");
		
		}
		
		return isTurned;
	}
	static void increaseSpeed(){
		System.out.println("Increase Speed method is invoked");
		if(isTurned==true){
			if(currentSpeed<maxSpeed){
				currentSpeed+=1;
				System.out.println("The current Speed is "+currentSpeed);
			}else{
				System.out.println("The current speed reached its maximum speed.");
			}
		}else{
			System.out.println("Please first turn on the VacuumCleaner.");
		}
	}
	
	static void decreaseSpeed(){
		System.out.println("decrease speed method is invoked");
		if(isTurned==true){
			if(currentSpeed>minSpeed){
				currentSpeed-=1;
				System.out.println("The current speed is "+currentSpeed);
			}else{
				System.out.println("The current Speed reached its minimum speed.");
			}
		}else{
			System.out.println("Please first turn on the VacuumCleaner.");
		}
	}
}