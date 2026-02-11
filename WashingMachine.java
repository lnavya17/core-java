class WashingMachine{
	static boolean isTurned;
	
	static boolean onOrOff(){
		
		if(isTurned==false){
		
			isTurned=true;
			System.out.println("The WashingMachine is turned on...");
		
		}else if(isTurned==true){
		
			isTurned=false;
			System.out.println("The WashingMachine is turned off...");
		
		}
		
		return isTurned;
	}
}