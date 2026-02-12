class PowerBank{
	static boolean isswitched;
	static int currentVolume;
	static int maxVolume=8;
	static int minVolume;
	
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
	static void increaseVolume(){
		System.out.println("Increase volume method is invoked");
		if(isswitched==true){
			if(currentVolume<maxVolume){
				currentVolume+=1;
				System.out.println("The current volume is "+currentVolume);
			}else{
				System.out.println("The current volume reached its maximum volume.");
			}
		}else{
			System.out.println("Please first turn on the PowerBank.");
		}
	}
	
	static void decreaseVolume(){
		System.out.println("decrease volume method is invoked");
		if(isswitched==true){
			if(currentVolume>minVolume){
				currentVolume-=1;
				System.out.println("The current volume is "+currentVolume);
			}else{
				System.out.println("The current volume reached its minimum volume.");
			}
		}else{
			System.out.println("Please first turn on the PowerBank.");
		}
	}
}