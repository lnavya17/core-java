class Zee5{
	public static void main(String[] net){
		String kannadaMovies[]={"Dia", "Love Mocktail", "Love Mocktail 2", "French Biryani", "Humble Politician Nograj", "Humble Politician Nograj 2", "Mayabazar 2016", "Gantumoote", "Kshamisi Nimma Khaatheyalli Hanavilla", "Operation Alamelamma", "Law", "Ranganayaki Vol 1", "Birbal Trilogy Case 1", "Shivaji Surathkal", "Shivaji Surathkal 2", "Mundina Nildana", "Katheyondu Shuruvagide", "Vaasu Naan Pakka Commercial", "I Love You", "Dollu"};
		
		String tamilMovies[]={"Ka Pae Ranasingam", "Thirumanam", "Oru Pakka Kathai", "Silukkuvarupatti Singam", "Kanaa", "Gorilla", "Kalathil Santhippom", "Ponmagal Vandhal", "Cocktail", "Oru Kuppai Kathai", "Kaali", "Pattas", "Jarugandi", "Kanchana 3", "Naachiyaar", "Meendum Oru Mariyathai", "Nenjil Thunivirundhal", "Vella Raja", "Aadai", "Magamuni"};
		
		String telguMovies[]={"Venky Mama", "Jersey", "Majili", "Nani’s Gang Leader", "Chak De", "Aswathama", "Krack", "Solo Brathuke So Better", "Uppena", "Bichagadu", "Gamyam", "Prasthanam", "Sye", "Leader", "Maharshi", "Rangasthalam", "Geetha Govindam", "Dear Comrade", "Arjun Reddy", "Khaidi No. 150"};
		
		String hindiMovies[]={"Tanu Weds Manu", "Tanu Weds Manu Returns", "Raanjhanaa", "Bareilly Ki Barfi", "Shaadi Mein Zaroor Aana", "Article 15", "Mulk", "Dream Girl", "Judgementall Hai Kya", "Kedarnath", "Veere Di Wedding", "Manmarziyaan", "Simran", "Batla House", "Hotel Mumbai", "The Kashmir Files", "URI: The Surgical Strike", "Bell Bottom", "Radhe: Your Most Wanted Bhai", "Suraj Pe Mangal Bhari"};
		
		String englishMovies[]={"The Dark Knight", "Inception", "Interstellar", "Tenet", "The Batman", "Joker", "The Matrix", "The Matrix Reloaded", "The Matrix Revolutions", "John Wick", "John Wick: Chapter 2", "John Wick: Chapter 3 – Parabellum", "Avengers: Endgame", "Avengers: Infinity War", "Thor: Ragnarok", "Guardians of the Galaxy", "Guardians of the Galaxy Vol. 2", "Black Panther", "Doctor Strange", "Spider-Man: Homecoming"};
		
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