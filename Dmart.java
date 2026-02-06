class Dmart{
	public static void main(String[] mart){
		String groceries[]= {"Raw rice", "Basmati rice", "Whole wheat flour", "Maida", "Rava", "Millet flours", "Toor dal", "Moong dal", "Chana dal", "Masoor dal", "Rajma", "Urad dal", "Sunflower oil", "Mustard oil", "Groundnut oil", "Ghee", "Turmeric powder", "Red chilli powder", "Cumin powder", "Coriander powder", "Salt", "Garam masala", "Sugar", "Tea/Coffee", "Pickles"};
		
		String fruitsAndVegetables[] = {"Apple", "Banana", "Orange", "Grapes", "Mango", "Papaya", "Pineapple", "Watermelon", "Pomegranate", "Guava", "Tomato", "Onion", "Potato", "Carrot", "Cabbage", "Cauliflower", "Brinjal", "Lady’s finger", "Green beans", "Capsicum", "Cucumber", "Bottle gourd", "Bitter gourd", "Spinach", "Coriander leaves"};
		
		String dairyAndFrozenFoods[] = {"Milk", "Curd", "Butter", "Ghee", "Cheese", "Paneer", "Fresh cream", "Buttermilk", "Flavoured milk", "Lassi", "Ice cream", "Frozen peas", "Frozen sweet corn", "Frozen mixed vegetables", "Frozen french fries", "Frozen paratha", "Frozen samosas", "Frozen chicken nuggets", "Frozen fish fillets", "Frozen pizza", "Frozen momos", "Frozen burger patties", "Frozen waffles", "Frozen kulfi", "Frozen dessert"};
		
		String snacks[] ={"Biscuits", "Cookies", "Potato chips", "Banana chips", "Namkeen mixtures", "Salted peanuts", "Popcorn", "Instant noodles", "Pasta", "Macaroni", "Breakfast cereals", "Oats", "Cornflakes", "Ready-to-eat meals", "Instant soup", "Cup noodles", "Chocolate bars", "Wafer chocolates", "Energy bars", "Trail mix", "Roasted chana", "Khakra", "Rusks", "Cakes", "Muffins"};
		
		String beverages[] = {"Coca-Cola", "Pepsi", "Sprite", "Fanta", "Mountain Dew", "Thums Up", "Limca", "Maaza", "Slice", "Appy Fizz", "Red Bull", "Monster Energy", "Real Fruit Juice", "Tropicana", "Minute Maid", "Paper Boat Aamras", "Bru Coffee", "Nescafe", "Tata Tea", "Red Label Tea", "Lipton Green Tea", "Bisleri Mineral Water", "Kinley Water", "Aquafina", "Gatorade"};
		
		String personalCareItems[] = {"Dove Soap", "Lux Soap", "Pears Soap", "Lifebuoy Soap", "Dettol Soap", "Patanjali Aloe Vera Gel", "Vaseline Body Lotion", "Nivea Body Lotion", "Lakme Face Cream", "Pond’s Cold Cream", "Fair & Lovely", "Garnier Men Face Wash", "Clean & Clear Face Wash", "Himalaya Neem Face Wash", "Clinic Plus Shampoo", "Head & Shoulders Shampoo", "Pantene Shampoo", "Sunsilk Shampoo", "Tresemme Shampoo", "Colgate Toothpaste", "Pepsodent Toothpaste", "Closeup Toothpaste", "Nivea Deodorant", "Fogg Perfume", "Engage Deodorant"};
		
		String healthCareItems[] = {"Horlicks", "Boost", "Complan", "Ensure", "Bournvita", "Protinex", "Pediasure", "Himalaya Ashvagandha Tablets", "Patanjali Giloy Ghanvati", "Dabur Chyawanprash", "Zandu Balm", "Vicks Vaporub", "Moov Pain Relief Cream", "Volini Spray", "Dettol Antiseptic Liquid", "Savlon Antiseptic", "Betadine Antiseptic Solution", "Liveasy Multivitamin Tablets", "HealthKart Multivitamin", "Carbamide Forte Omega 3 Capsules", "Revital H Capsules", "Fast&Up Vitamin C", "Dabur Honey", "Himalaya Liv.52"};
		
		String kidsItems[] = {"Pampers Baby Diapers", "Huggies Baby Diapers", "MamyPoko Pants", "Johnson’s Baby Powder", "Johnson’s Baby Oil", "Johnson’s Baby Shampoo", "Himalaya Baby Soap", "Sebamed Baby Wash", "Mee Mee Baby Lotion", "Mamaearth Baby Wash", "Nestle Cerelac", "Nestle Lactogen", "Nestle NAN Pro", "Dexolac Infant Formula", "Farex Baby Food", "Himalaya Baby Cream", "Chicco Baby Shampoo", "Philips Avent Feeding Bottle", "Pigeon Baby Feeding Bottle", "Baby Dove Rich Moisture Soap", "Pigeon Baby Wipes", "Mee Mee Baby Wipes", "Johnson’s Baby Wipes", "Fisher-Price Baby Toy", "LuvLap Baby Stroller"};
		
		String cleaningStuffs[] ={"Surf Excel Detergent", "Ariel Detergent", "Tide Detergent", "Rin Detergent", "Wheel Detergent", "Vim Dishwash Liquid", "Pril Dishwash Liquid", "Exo Dishwash Bar", "Lizol Floor Cleaner", "Harpic Toilet Cleaner", "Domex Toilet Cleaner", "Dettol Floor Cleaner", "Colin Glass Cleaner", "Mr Muscle Kitchen Cleaner", "Good Knight Fabric Roll-On", "Hit Insect Killer Spray", "All Out Mosquito Repellent", "Mortein Mosquito Coil", "Comfort Fabric Conditioner", "Ujala Fabric Whitener", "Vanish Stain Remover", "Scotch-Brite Scrub Pad", "Gala Floor Mop", "Eveready LED Torch", "Dettol Disinfectant Spray"};
		
		String kitchenUtensils[]={"Prestige Pressure Cooker", "Hawkins Pressure Cooker", "Pigeon Non-Stick Fry Pan", "Tefal Non-Stick Tawa", "Butterfly Gas Stove", "Prestige Induction Cooktop", "Milton Thermosteel Water Bottle", "Cello Plastic Container Set", "Tupperware Storage Container", "Borosil Glass Bowl", "Borosil Measuring Cup", "Pigeon Stainless Steel Spoon Set", "Vinod Stainless Steel Cookware", "Hawkins Stainless Steel Kadhai", "Prestige Mixer Grinder", "Bajaj Mixer Grinder", "Philips Electric Kettle", "Orpat Hand Blender", "Morphy Richards OTG Oven", "LG Microwave Oven", "Prestige Rice Cooker", "Milton Casserole Set", "Cello Lunch Box", "Signoraware Storage Box", "Prestige Knife Set"};
		
		String appliances[]={"LG Refrigerator", "Samsung Refrigerator", "Whirlpool Refrigerator", "Godrej Refrigerator", "Haier Refrigerator", "LG Washing Machine", "Samsung Washing Machine", "Whirlpool Washing Machine", "IFB Washing Machine", "Bosch Washing Machine", "LG Microwave Oven", "Samsung Microwave Oven", "IFB Microwave Oven", "Panasonic Microwave Oven", "LG Air Conditioner", "Voltas Air Conditioner", "Blue Star Air Conditioner", "Daikin Air Conditioner", "Hitachi Air Conditioner", "Bajaj Room Heater", "Usha Electric Fan", "Havells Ceiling Fan", "Philips Iron", "Prestige Induction Cooktop", "Kent RO Water Purifier"};
		
		String homeDecors[]={"Wakefit Memory Foam Mattress", "Sleepwell Mattress", "Bombay Dyeing Bed Sheet", "Portico Bed Sheet", "Spaces Cotton Bed Sheet", "D'Decor Curtain", "Story@Home Curtain", "Home Centre Cushion Cover", "UrbanMinter Cushion Cover", "Maspar Pillow", "Sleepyhead Pillow", "Ikea Table Lamp", "Philips LED Table Lamp", "Syska LED Bulb", "Wipro Garnet LED Bulb", "Art Street Wall Painting", "Exim Decor Wall Clock", "Ajanta Wall Clock", "Home Centre Floor Rug", "Ikea Area Rug", "Hosley Decorative Vase", "Chumbak Decorative Showpiece", "Home Sparkle Photo Frame", "eCraftIndia Wall Hanging", "Pure Home & Living Throw Blanket"};
		
		String footwears[]={"Bata Men Formal Shoes", "Bata Women Sandals", "Relaxo Flip Flops", "Sparx Sports Shoes", "Campus Running Shoes", "Puma Sneakers", "Nike Air Max", "Adidas Running Shoes", "Reebok Training Shoes", "Woodland Leather Boots", "Red Tape Casual Shoes", "Lee Cooper Sneakers", "Liberty School Shoes", "Action Sports Shoes", "Paragon Slippers", "VKC Pride Sandals", "Metro Women Heels", "Catwalk Women Flats", "Crocs Clogs", "Skechers Walking Shoes", "Fila Sports Shoes", "Power Football Studs", "ASICS Gel Running Shoes", "New Balance Trainers", "Hush Puppies Formal Shoes"};
		
		String clothes[]={"Levi’s Men Jeans", "Wrangler Men Jeans", "Lee Men Jeans", "Pepe Jeans Men Denim", "Allen Solly Men Shirt", "Van Heusen Formal Shirt", "Peter England Men Shirt", "Raymond Formal Shirt", "Louis Philippe Men Trousers", "Arrow Men Trousers", "Biba Women Kurti", "W Women Kurti", "Fabindia Cotton Kurta", "Manyavar Men Sherwani", "Siyaram Men Suit", "Zara Women Top", "H&M Women Dress", "Pantaloons Casual T-Shirt", "Roadster Men T-Shirt", "Puma Sports T-Shirt", "Adidas Track Pants", "Nike Sports Shorts", "Jockey Men Innerwear", "Amante Women Lingerie", "Monte Carlo Sweater"};
		
		String accessories[]={"Titan Analog Watch", "Fastrack Digital Watch", "Casio Sports Watch", "Sonata Wrist Watch", "Ray-Ban Sunglasses", "Fastrack Sunglasses", "Oakley Sunglasses", "Wildcraft Backpack", "American Tourister Trolley Bag", "Skybags Laptop Backpack", "Baggit Women Handbag", "Lavie Women Handbag", "Caprese Sling Bag", "Tommy Hilfiger Leather Belt", "Peter England Formal Belt", "Louis Philippe Wallet", "Allen Solly Wallet", "Fastrack Wallet", "Puma Sports Cap", "Adidas Sports Cap", "Nike Dri-FIT Cap", "Puma Gym Gloves", "Adidas Gym Gloves", "Boat Wired Earphones", "JBL Bluetooth Headphones"};
		
		String stationeries[]={"Classmate Notebook", "Navneet Long Book", "Camlin Exam Pad", "Apsara Pencil", "Nataraj Pencil", "Cello Ball Pen", "Reynolds Ball Pen", "Parker Fountain Pen", "Pilot Gel Pen", "Faber-Castell Color Pencils", "Camlin Sketch Pens", "Crayola Crayons", "Camel Poster Colors", "Fevicol Adhesive", "Pidilite Glue Stick", "Classmate Drawing Book", "Navneet Graph Book", "Camlin Geometry Box", "Apsara Eraser", "Nataraj Sharpener", "Kangaro Stapler", "Doms Whiteboard Marker", "Cello Correction Pen", "Flair Highlighter", "Kores Whiteboard Duster"};
		
		String toys[]={"Lego Classic Building Blocks", "Lego City Police Set", "Hot Wheels Die-Cast Car", "Barbie Fashion Doll", "Barbie Dreamhouse", "Nerf Elite Blaster", "Nerf Dart Gun", "Funskool Monopoly Board Game", "Funskool Scrabble Game", "Mattel Uno Card Game", "Hasbro Jenga", "Hasbro Connect 4", "Play-Doh Modeling Clay", "Fisher-Price Rock-a-Stack", "Fisher-Price Laugh & Learn Toy", "Little Tikes Ride-On Car", "Hamleys Soft Toy Teddy Bear", "Chicco Baby Rattle", "Frank Educational Puzzle", "Skillmatics Brain Games", "Ravensburger Jigsaw Puzzle", "Mitashi SkyKidz Remote Car", "Funskool Chess Board", "Funskool Ludo Board", "Hasbro Beyblade"};
		
		String gardenAndPetSupplies[]={"Ugaoo Garden Soil Mix", "Trust Basket Vermicompost", "Garden Tool Trowel", "Garden Hand Cultivator", "Kraft Seeds Vegetable Seeds", "Trust Basket Plant Pots", "Plastic Watering Can", "Garden Spray Bottle", "Ugaoo Neem Oil Concentrate", "Trust Basket Plant Fertilizer", "Pedigree Adult Dog Food", "Pedigree Puppy Food", "Drools Dog Food", "Whiskas Adult Cat Food", "Whiskas Kitten Food", "Purepet Dog Food", "Boltz Dog Treats", "JerHigh Dog Treats", "Trixie Dog Leash", "Pet Vogue Dog Collar", "Savic Pet Bowl", "Pets Empire Cat Litter", "Petaholic Pet Shampoo", "Petvit Tick & Flea Shampoo", "Petmate Pet Travel Carrier"};
		
		String hardwareTools[]={"Bosch Electric Drill", "Black+Decker Cordless Drill", "Makita Angle Grinder", "Stanley Tool Kit", "Taparia Screwdriver Set", "Taparia Combination Pliers", "Bosch Jigsaw Machine", "Hitachi Rotary Hammer", "DeWalt Circular Saw", "Taparia Adjustable Wrench", "Stanley Claw Hammer", "Taparia Measuring Tape", "Bosch Heat Gun", "Black+Decker Orbital Sander", "Stanley Utility Knife", "Taparia Allen Key Set", "Grohe Adjustable Spanner", "Asian Paints Wall Putty", "Dr Fixit Waterproofing Compound", "Fevikwik Instant Adhesive", "Bosch Impact Wrench", "Taparia Bench Vice", "Stanley Spirit Level", "Bosch Pressure Washer", "Stanley Hacksaw Frame"};
		
		String festiveAndGiftItemsfestiveAndGiftItems[]={"Archies Greeting Card", "Archies Soft Toy", "Fern & Petals Flower Bouquet", "Ferns N Petals Chocolate Box", "Cadbury Celebrations Gift Pack", "Ferrero Rocher Chocolate Box", "Haldiram’s Dry Fruit Gift Pack", "Bikano Sweets Gift Box", "Rakhi Gift Set", "Designer Rakhi", "Decorative Puja Thali", "Brass Diya Set", "LED String Lights", "Decorative Fairy Lights", "Scented Candles Gift Set", "Aromatic Incense Sticks", "God Idol Showpiece", "Ganesh Idol Statue", "Wall Hanging Toran", "Festive Door Decoration", "Personalized Photo Frame", "Customized Coffee Mug", "Greeting Card Combo Set", "Gift Wrap Paper Set", "Decorative Gift Basket"};
		
		System.out.println("List of groceries:");
		for(String grocery:groceries){
			System.out.println(grocery);
		}
		System.out.println("***************************************************");
		System.out.println("List of fruitsAndVegetables:");
		for(String fruitAndVegetable:fruitsAndVegetables){
			System.out.println(fruitAndVegetable);
		}
		System.out.println("***************************************************");
		System.out.println("List of dairyAndFrozenFoods:");
		for(String dairyAndFrozenFood:dairyAndFrozenFoods){
			System.out.println(dairyAndFrozenFood);
		}
		System.out.println("***************************************************");
		System.out.println("List of snacks:");
		for(String snack:snacks){
			System.out.println(snack);
		}
		System.out.println("***************************************************");
		System.out.println("List of beverages:");
		for(String beverage:beverages){
			System.out.println(beverage);
		}
		System.out.println("***************************************************");
		System.out.println("List of personalCareItems:");
		for(String personalCareItem:personalCareItems){
			System.out.println(personalCareItem);
		}
		System.out.println("***************************************************");
		System.out.println("List of healthCareItems:");
		for(String healthCareItem:healthCareItems){
			System.out.println(healthCareItem);
		}
		System.out.println("***************************************************");
		System.out.println("List of kidsItems:");
		for(String kidsItem:kidsItems){
			System.out.println(kidsItem);
		}
		System.out.println("***************************************************");
		System.out.println("List of cleaningStuffs:");
		for(String cleaningStuff:cleaningStuffs){
			System.out.println(cleaningStuff);
		}
		System.out.println("***************************************************");
		System.out.println("List of kitchenUtensils:");
		for(String kitchenUtensil:kitchenUtensils){
			System.out.println(kitchenUtensil);
		}
		System.out.println("***************************************************");
		System.out.println("List of appliances:");
		for(String appliance:appliances){
			System.out.println(appliance);
		}
		System.out.println("***************************************************");
		System.out.println("List of homeDecors:");
		for(String homeDecor:homeDecors){
			System.out.println(homeDecor);
		}
		System.out.println("***************************************************");
		System.out.println("List of footwears:");
		for(String footwear:footwears){
			System.out.println(footwear);
		}
		System.out.println("***************************************************");
		System.out.println("List of clothes:");
		for(String clothe:clothes){
			System.out.println(clothes);
		}
		System.out.println("***************************************************");
		System.out.println("List of accessories:");
		for(String accessory:accessories){
			System.out.println(accessory);
		}
		System.out.println("***************************************************");
		System.out.println("List of stationeries:");
		for(String stationery:stationeries){
			System.out.println(stationery);
		}
		System.out.println("***************************************************");
		System.out.println("List of toysgardenAndPetSupplies:");
		for(String toy:toys){
			System.out.println(toy);
		}
		System.out.println("***************************************************");
		System.out.println("List of gardenAndPetSupplies:");
		for(String gardenAndPetSupply:gardenAndPetSupplies){
			System.out.println(gardenAndPetSupplies);
		}
		System.out.println("***************************************************");
		System.out.println("List of hardwareTools:");
		for(String hardwareTool:hardwareTools){
			System.out.println(hardwareTool);
		}
		System.out.println("***************************************************");
		System.out.println("List of festiveAndGiftItems:");
		for(String festiveAndGiftItem:festiveAndGiftItems){
			System.out.println(festiveAndGiftItem);
		}
		System.out.println("***************************************************");
	}
}