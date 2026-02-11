class VacuumCleanerExecuter{
	public static void main(String[] vacuum){
		boolean cleaner = VacuumCleaner.onOrOff();
		System.out.println("The VacuumCleaner connection is : " +cleaner);
	}
} 