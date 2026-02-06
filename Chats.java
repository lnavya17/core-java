class Chats{
	public static void main(String[] chat){
		String chatNames[]={"PaniPuri","DahiPuri","Sevpuri","BhelPuri","Gobi Manchurian","Paneer Manchurian","Mashroom Manchurian","Paneer Sandwich","Chees Sandwich","Egg Sandwich","Paneer Roll","Egg Roll","Steam Momos","Fried Momos", "PaneerMomos"}; 
		
		String paniPuri= chatNames[0];
		String dahipuri = chatNames[1];
		String sevPuri = chatNames[2];
		String bhelpuri = chatNames[3];
		String gobiManchurian = chatNames[4];
 		String paneerManchurian = chatNames[5];
		String mashroomManchurian = chatNames[6];
		String paneerSandwich = chatNames[7];
		String cheeseSandwich = chatNames[8];
		String eggSandwich = chatNames[9];
		
		
		System.out.println("The no of chats are " + chatNames.length);
		System.out.println("Chats list is as follows:");
		System.out.println(paniPuri+ " "+ dahipuri + " "+ sevPuri+ " "+ bhelpuri+" "+ gobiManchurian+ " "+ paneerManchurian+ " "+ mashroomManchurian+ " "+ paneerSandwich+" "+ cheeseSandwich+" "+ eggSandwich);
		for(String chatname : chatNames){
			System.out.println(chatname);
		}
	}
}