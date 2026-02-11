class ElectricIron{
	static boolean isenabled;
	
	static boolean onOrOff(){
		
		if(isenabled==false){
		
			isenabled=true;
			System.out.println("The ElectricIron is turned on...");
		
		}else if(isenabled==true){
		
			isenabled=false;
			System.out.println("The ElectricIron is turned off...");
		
		}
		
		return isenabled;
	}
}