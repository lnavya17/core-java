class Netflix{
	public static void main(String[] net){
		String kannadaMovies[]={"KGF: Chapter 1", "K.G.F: Chapter 2", "Kantara", "Sapta Sagaradaache Ello – Side A", "Sapta Sagaradaache Ello – Side B", "Avane Srimannarayana", "Dia", "Love Mocktail", "Love Mocktail 2", "Popcorn Monkey Tiger", "Birbal Trilogy Case 1", "French Biryani", "Mayabazar 2016", "Gantumoote", "Humble Politician Nograj", "Tagaru", "Ulidavaru Kandanthe", "RangiTaranga", "Hero", "Act 1978"};
		
		String tamilMovies[]={"Jai Bhim", "Doctor", "Master", "Beast", "Thunivu", "Valimai", "Visaranai", "Asuran", "Soorarai Pottru", "Jagame Thandhiram", "Petta", "Kabali", "Kaala", "Mandela", "Paava Kadhaigal", "Karnan", "Nayattu (Tamil Dub)", "Mersal", "Sarkar", "96"};
		
		String telguMovies[]={"RRR", "Baahubali: The Beginning", "Baahubali 2: The Conclusion", "Jersey", "Rangasthalam", "Maharshi", "Ala Vaikunta Puramulo", "Eega", "Janatha Garage", "Arjun Reddy", "Sye", "Khaidi No. 150", "Dear Comrade", "Brahmotsavam", "Leader", "Ghajini", "Uyyala Jampala", "Mallesham", "Guru", "Vakeel Saab"};
		
		String hindiMovies[]={"Dangal", "Ludo", "Jaane Jaan", "Gunjan Saxena: The Kargil Girl", "Chor Nikal Ke Bhaga", "Kathal", "Monica, O My Darling", "Badla", "Bulbbul", "Pagglait", "Mimi", "Ajeeb Daastaans", "Thar", "Raat Akeli Hai", "Haseen Dillruba", "The White Tiger", "AK vs AK", "Yeh Ballet", "Chhalaang", "Sardar Ka Grandson"};
		
		String englishMovies[]={"Extraction", "Extraction 2", "The Irishman", "Bird Box", "Red Notice", "The Gray Man", "Don’t Look Up", "Glass Onion: A Knives Out Mystery", "The Adam Project", "6 Underground", "Army of the Dead", "Enola Holmes", "Enola Holmes 2", "Marriage Story", "Roma", "The Power of the Dog", "All Quiet on the Western Front", "Leave the World Behind", "The Killer", "Triple Frontier"};
		
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