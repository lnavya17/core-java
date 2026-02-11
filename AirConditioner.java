class AirConditioner{
	static boolean isTurned;
	
	static boolean onOrOff(){
		
		if(isTurned==false){
		
			isTurned=true;
			System.out.println("The AirConditioner is turned on...");
		
		}else if(isTurned==true){
		
			isTurned=false;
			System.out.println("The AirConditioner is turned off...");
		
		}
		
		return isTurned;
	}
}