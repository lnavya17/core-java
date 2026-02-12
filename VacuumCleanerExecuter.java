class VacuumCleanerExecuter{
	public static void main(String[] vacuum){
		boolean cleaner = VacuumCleaner.onOrOff();
		System.out.println("The VacuumCleaner connection is : " +cleaner);
		
		VacuumCleaner.increaseSpeed();
		VacuumCleaner.increaseSpeed();
		cleaner = VacuumCleaner.onOrOff();
		System.out.println("The VacuumCleaner connection is : " +cleaner);VacuumCleaner.increaseSpeed();
		VacuumCleaner.increaseSpeed();
		VacuumCleaner.increaseSpeed();
		cleaner = VacuumCleaner.onOrOff();
		System.out.println("The VacuumCleaner connection is : " +cleaner);VacuumCleaner.increaseSpeed();
		VacuumCleaner.increaseSpeed();
		
		VacuumCleaner.decreaseSpeed();
		cleaner = VacuumCleaner.onOrOff();
		System.out.println("The VacuumCleaner connection is : " +cleaner);VacuumCleaner.decreaseSpeed();
		VacuumCleaner.decreaseSpeed();
		VacuumCleaner.decreaseSpeed();
		cleaner = VacuumCleaner.onOrOff();
		System.out.println("The VacuumCleaner connection is : " +cleaner);VacuumCleaner.decreaseSpeed();
		VacuumCleaner.decreaseSpeed();
		VacuumCleaner.decreaseSpeed();
	}
} 