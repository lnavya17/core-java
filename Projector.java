class Projector{
	static boolean isenabled;
	static int currentSpeed;
	static int maxSpeed=8;
	static int minSpeed;
	
	static boolean onOrOff(){
		
		if(isenabled==false){
		
			isenabled=true;
			System.out.println("The Projector is turned on...");
		
		}else if(isenabled==true){
		
			isenabled=false;
			System.out.println("The Projector is turned off...");
		
		}
		
		return isenabled;
	}
	static void increaseSpeed(){
		System.out.println("Increase Speed method is invoked");
		if(isenabled==true){
			if(currentSpeed<maxSpeed){
				currentSpeed+=1;
				System.out.println("The current Speed is "+currentSpeed);
			}else{
				System.out.println("The current speed reached its maximum speed.");
			}
		}else{
			System.out.println("Please first turn on the Projector.");
		}
	}
	
	static void decreaseSpeed(){
		System.out.println("decrease speed method is invoked");
		if(isenabled==true){
			if(currentSpeed>minSpeed){
				currentSpeed-=1;
				System.out.println("The current speed is "+currentSpeed);
			}else{
				System.out.println("The current Speed reached its minimum speed.");
			}
		}else{
			System.out.println("Please first turn on the Projector.");
		}
	}
}