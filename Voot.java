class Voot{
	public static void main(String[] net){
		String kannadaMovies[]={"KGF: Chapter 1", "KGF: Chapter 2", "Kantara", "Avane Srimannarayana", "Sapta Sagaradaache Ello – Side A", "Sapta Sagaradaache Ello – Side B", "RangiTaranga", "Tagaru", "Ulidavaru Kandanthe", "Dia", "Love Mocktail", "Love Mocktail 2", "French Biryani", "Birbal Trilogy Case 1", "Mayabazar 2016", "Popcorn Monkey Tiger", "Humble Politician Nograj", "Hero", "Yuvarathnaa", "Robert"};
		
		String tamilMovies[]={"Jai Bhim", "Master", "Doctor", "Beast", "Valimai", "Thunivu", "Soorarai Pottru", "Jagame Thandhiram", "Asuran", "Kaithi", "Vikram", "Mersal", "Bigil", "Kabali", "Petta", "Raatchasan", "Maanaadu", "Sarpatta Parambarai", "96", "Ponmagal Vandhal"};
		
		String telguMovies[]={"RRR", "Pushpa: The Rise", "Sita Ramam", "Jersey", "Rangasthalam", "Maharshi", "Ala Vaikunta Puramulo", "Janatha Garage", "Bheemla Nayak", "Arjun Reddy", "Eega", "Baahubali: The Beginning", "Baahubali 2: The Conclusion", "Dear Comrade", "Vakeel Saab", "Happy Days", "Leader", "Manam", "Uyyala Jampala", "Mallesham"};
		
		String hindiMovies[]={"Chhichhore", "Shershaah", "Sardar Udham", "Gully Boy", "Article 15", "Andhadhun", "Badhaai Ho", "Kabir Singh", "Raazi", "Newton", "October", "Pad Man", "Bareilly Ki Barfi", "Mission Mangal", "Laxmii", "Judwaa 2", "Lootcase", "Badhai Do", "Bhool Bhulaiyaa 2", "Bell Bottom"};
		
		String englishMovies[]={"Extraction", "The Gray Man", "Red Notice", "Bird Box", "The Irishman", "Don’t Look Up", "Enola Holmes", "Enola Holmes 2", "6 Underground", "Army of the Dead", "Glass Onion: A Knives Out Mystery", "The Adam Project", "Triple Frontier", "All Quiet on the Western Front", "Leave the World Behind", "The Power of the Dog", "Marriage Story", "Roma", "The Killer", "The Old Guard"};
		
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