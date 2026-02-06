class AmazonPrime{
	public static void main(String[] net){
		String kannadaMovies[]={"KGF: Chapter 1", "KGF: Chapter 2", "Kantara", "Garuda Gamana Vrishabha Vahana", "Avane Srimannarayana", "Bell Bottom", "Dia", "Yuvarathnaa", "Robert", "Mayabazar 2016", "RangiTaranga", "Ulidavaru Kandanthe", "Tagaru", "Popcorn Monkey Tiger", "French Biryani", "Hero", "Law", "Ugramm", "Mufti", "Operation Alamelamma"};
		
		String tamilMovies[]={"Soorarai Pottru", "Jai Bhim", "Sardar", "Vikram", "Karnan", "Asuran", "Sarpatta Parambarai", "Raatchasan", "Thani Oruvan", "Kaithi", "Doctor", "Oh My Kadavule", "Vinnaithaandi Varuvaayaa", "OK Kanmani", "96", "Maanaadu", "Ponmagal Vandhal", "Hey Sinamika", "Iravukku Aayiram Kangal", "Mahaan"};
		
		String telguMovies[]={"RRR", "Pushpa: The Rise", "Sita Ramam", "Jersey", "Rangasthalam", "Janatha Garage", "Maharshi", "Dear Comrade", "Vakeel Saab", "Bheemla Nayak", "Ala Vaikunta Puramulo", "Eega", "Sye", "Leader", "Baahubali: The Beginning", "Baahubali 2: The Conclusion", "Ghajini", "Manam", "Uyyala Jampala", "Mallesham"};
		
		String hindiMovies[]={"Shershaah", "Sardar Udham", "Gully Boy", "Andhadhun", "Article 15", "Bajirao Mastani", "Dil Chahta Hai", "Lakshya", "Jai Bhim", "Soorarai Pottru", "Drishyam", "Drishyam 2", "Kabir Singh", "Chak De! India", "Goliyon Ki Raasleela Ram-Leela", "Raazi", "Bareilly Ki Barfi", "Newton", "October", "Pad Man"};
		
		String englishMovies[]={"The Tomorrow War", "Without Remorse", "Jack Ryan: Shadow Recruit", "Coming 2 America", "The Big Sick", "Manchester by the Sea", "Sound of Metal", "A Quiet Place", "Top Gun", "Interstellar", "The Wolf of Wall Street", "Mission: Impossible – Fallout", "Jurassic World", "The Accountant", "Knives Out", "The Bourne Ultimatum", "John Wick", "The Social Network", "The Dark Knight", "Forrest Gump"};
		
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