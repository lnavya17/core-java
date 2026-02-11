class PowerBank{
	static boolean isswitched;
	
	static boolean onOrOff(){
		
		if(isswitched==false){
		
			isswitched=true;
			System.out.println("The PowerBank is turned on...");
		
		}else if(isswitched==true){
		
			isswitched=false;
			System.out.println("The PowerBank is turned off...");
		
		}
		
		return isswitched;
	}
}