class DisneyHotstar{
	public static void main(String[] net){
		String kannadaMovies[]={"Paramathma", "Mr. and Mrs. Ramachari", "Googly", "Raja Huli", "Mungaru Male", "Raajakumara", "Yajamana", "Anna Bond", "Milana", "Chakravarthy", "Hebbuli", "Power", "Bhajarangi", "Bhajarangi 2", "Kotigobba 2", "Tagaru Palya", "Kirik Party", "Drama", "Yuvarathnaa", "James"};
		
		String tamilMovies[]={"Vikram", "Vikram Vedha", "Maanagaram", "Mahaan", "Kaithi", "Theeran Adhigaaram Ondru", "Thani Oruvan", "Ratsasan", "Vada Chennai", "Asuran", "Karnan", "Soorarai Pottru", "Jai Bhim", "Sarpatta Parambarai", "Maanaadu", "Sardar", "Doctor", "Bigil", "Mersal", "Master"};
		
		String telguMovies[]={"RRR", "Rangasthalam", "Janatha Garage", "Maharshi", "Bharat Ane Nenu", "Srimanthudu", "Ala Vaikunta Puramulo", "AVPL", "Sye", "Leader", "Happy Days", "Arya", "Arya 2", "Magadheera", "Eega", "Baahubali: The Beginning", "Baahubali 2: The Conclusion", "Khaidi No. 150", "Attarintiki Daredi", "Gabbar Singh"};
		
		String hindiMovies[]={"Tanhaji: The Unsung Warrior", "MS Dhoni: The Untold Story", "Bajrangi Bhaijaan", "Bhool Bhulaiyaa", "Super 30", "Chhichhore", "Kesari", "Badhaai Ho", "Hindi Medium", "Baby", "Prem Ratan Dhan Payo", "Housefull", "Housefull 2", "Baghi", "Baaghi 2", "Mission Mangal", "Total Dhamaal", "Judwaa 2", "Laxmii", "Lootcase"};
		
		String englishMovies[]={"Avengers: Endgame", "Avengers: Infinity War", "Iron Man", "Iron Man 2", "Iron Man 3", "Captain America: The First Avenger", "Captain America: The Winter Soldier", "Captain America: Civil War", "Thor", "Thor: The Dark World", "Thor: Ragnarok", "Black Panther", "Doctor Strange", "Guardians of the Galaxy", "Guardians of the Galaxy Vol. 2", "Spider-Man: Homecoming", "Spider-Man: Far From Home", "Ant-Man", "Ant-Man and the Wasp", "The Lion King"};
		
		System.out.println("Length of Kannada movies:"+kannadaMovies.length);
		System.out.println("List of kannada movies :");
		for(String kannadaMovie:kannadaMovies){
			System.out.println(kannadaMovie);
		}
		System.out.println("----------------------------------------------");
		System.out.println("Length of Tamil movies:"+tamilMovies.length);
		System.out.println("List of Tamil movies: ");
		for(String tamilMovie:tamilMovies){
			System.out.println(tamilMovie);
		}
		System.out.println("----------------------------------------------");
		System.out.println("Length of Telgu movies:"+telguMovies);
		System.out.println("List of Telgu movies: ");
		for(String telguMovie:telguMovies){
			System.out.println(telguMovie);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Length of Hindi movies:"+hindiMovies);
		System.out.println("List of Hindi movies: ");
		for(String hindiMovie:hindiMovies){
			System.out.println(hindiMovie);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Length of English movies:"+englishMovies);
		System.out.println("List of English movies: ");
		for(String englishMovie:englishMovies){
			System.out.println(englishMovie);
		}
	}
}