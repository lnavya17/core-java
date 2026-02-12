class WashingMachineExecuter{
	public static void main(String[] wash){
		boolean machine = WashingMachine.onOrOff();
		System.out.println("The WashingMachine connection is : " +machine);
		
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		machine = WashingMachine.onOrOff();
		System.out.println("The WashingMachine connection is : " +machine);
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		machine = WashingMachine.onOrOff();
		System.out.println("The WashingMachine connection is : " +machine);
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		machine = WashingMachine.onOrOff();
		System.out.println("The WashingMachine connection is : " +machine);
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		machine = WashingMachine.onOrOff();
		System.out.println("The WashingMachine connection is : " +machine);
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		
	}
} 