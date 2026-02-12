class ElectricIronExecuter{
	public static void main(String[] electric){
		boolean elect = ElectricIron.onOrOff();
		System.out.println("The ElectricIron connection is : " +elect);
		
		ElectricIron.increaseSpeed();
		ElectricIron.increaseSpeed();
		ElectricIron.increaseSpeed();
		elect = ElectricIron.onOrOff();
		System.out.println("The ElectricIron connection is : " +elect);
		ElectricIron.increaseSpeed();
		ElectricIron.increaseSpeed();
		elect = ElectricIron.onOrOff();
		System.out.println("The ElectricIron connection is : " +elect);
		ElectricIron.increaseSpeed();
		ElectricIron.increaseSpeed();
		ElectricIron.increaseSpeed();
		
		ElectricIron.decreaseSpeed();
		elect = ElectricIron.onOrOff();
		System.out.println("The ElectricIron connection is : " +elect);
		ElectricIron.decreaseSpeed();
		ElectricIron.decreaseSpeed();
		elect = ElectricIron.onOrOff();
		System.out.println("The ElectricIron connection is : " +elect);
		ElectricIron.decreaseSpeed();
		ElectricIron.decreaseSpeed();
		ElectricIron.decreaseSpeed();
		ElectricIron.decreaseSpeed();
		ElectricIron.decreaseSpeed();
		ElectricIron.decreaseSpeed();
		
	}
} 