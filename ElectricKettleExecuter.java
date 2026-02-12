class ElectricKettleExecuter{
	public static void main(String[] elect){
		boolean kettle = ElectricKettle.onOrOff();
		System.out.println("The ElectricKettle connection is : " +kettle);
		
		ElectricKettle.increaseSpeed();
		ElectricKettle.increaseSpeed();
		ElectricKettle.increaseSpeed();
		kettle = ElectricKettle.onOrOff();
		System.out.println("The ElectricKettle connection is : " +kettle);
		ElectricKettle.increaseSpeed();
		kettle = ElectricKettle.onOrOff();
		System.out.println("The ElectricKettle connection is : " +kettle);
		ElectricKettle.increaseSpeed();
		ElectricKettle.increaseSpeed();
		ElectricKettle.increaseSpeed();
		ElectricKettle.increaseSpeed();
		ElectricKettle.increaseSpeed();
		
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		kettle = ElectricKettle.onOrOff();
		System.out.println("The ElectricKettle connection is : " +kettle);
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		kettle = ElectricKettle.onOrOff();
		System.out.println("The ElectricKettle connection is : " +kettle);
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		ElectricKettle.decreaseSpeed();
		
		
	}
} 