class Router{
	static boolean isenabled;
	
	static boolean onOrOff(){
		
		if(isenabled==false){
		
			isenabled=true;
			System.out.println("The Router is turned on...");
		
		}else if(isenabled==true){
		
			isenabled=false;
			System.out.println("The Router is turned off...");
		
		}
		
		return isenabled;
	}
}