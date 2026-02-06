class Restaurant{
	public static void main(String[] rest){
		String name = "Udupi Restaurant";
		String owner = "Hanumanth";
		String address = "Majestic";
		String branches[] ={"Rajajinagar", "Jayanagar","Majestic"};
		String managers[] = {"Prasad","Rakesh","Mithun"};
		String starters[] = {"Gobi65", "GobiManchurian", "PaneerManchurian", "MushroomManchurian"};
		
		System.out.println("The Restaurant Information");
		System.out.println("*************************************");
		System.out.println("The name of the restaurant:"+ name);
		System.out.println("The name of restaurant owner:"+ owner);
		System.out.println("Address of restaurant: "+ address);
		System.out.println("Number of branches:"+branches.length);
		System.out.println("List of branches:");
		for(String branch: branches){
			System.out.println("	"+branch);
		}
		System.out.println("Number of managers:"+ managers.length);
		for(String manager: managers){
			System.out.println("	"+manager);
		}
		System.out.println("*************************************");
		System.out.println("			Menu			");
		System.out.println("*************************************");
		System.out.println("Starters:");
		for(String starter:starters){
			System.out.println("	"+starter);
		}
	}
}