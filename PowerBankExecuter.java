class PowerBankExecuter{
	public static void main(String[] bank){
		boolean power = PowerBank.onOrOff();
		System.out.println("The PowerBank connection is : " +power);
		
		PowerBank.increaseVolume();
		power = PowerBank.onOrOff();
		System.out.println("The PowerBank connection is : " +power);
		PowerBank.increaseVolume();
		PowerBank.increaseVolume();
		power = PowerBank.onOrOff();
		System.out.println("The PowerBank connection is : " +power);
		PowerBank.increaseVolume();
		PowerBank.increaseVolume();
		PowerBank.increaseVolume();
		PowerBank.increaseVolume();
		
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		power = PowerBank.onOrOff();
		System.out.println("The PowerBank connection is : " +power);
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		power = PowerBank.onOrOff();
		System.out.println("The PowerBank connection is : " +power);
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		PowerBank.decreaseVolume();
		
		
	}
} 