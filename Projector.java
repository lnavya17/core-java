class Projector{
	static boolean isenabled;
	
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
}