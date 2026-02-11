class DigitalClock{
	static boolean isTurned;
	
	static boolean onOrOff(){
		
		if(isTurned==false){
		
			isTurned=true;
			System.out.println("The DigitalClock is turned on...");
		
		}else if(isTurned==true){
		
			isTurned=false;
			System.out.println("The DigitalClock is turned off...");
		
		}
		
		return isTurned;
	}
}