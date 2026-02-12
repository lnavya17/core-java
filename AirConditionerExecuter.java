class AirConditionerExecuter{
	public static void main(String[] air){
		boolean cond = AirConditioner.onOrOff();
		System.out.println("The AirConditioner connection is : " +cond);
		
		AirConditioner.increaseSpeed();
		cond = AirConditioner.onOrOff();
		System.out.println("The AirConditioner connection is : " +cond);
		AirConditioner.increaseSpeed();
		AirConditioner.increaseSpeed();
		cond = AirConditioner.onOrOff();
		System.out.println("The AirConditioner connection is : " +cond);
		AirConditioner.increaseSpeed();
		AirConditioner.increaseSpeed();
		AirConditioner.increaseSpeed();
		AirConditioner.increaseSpeed();
		
		AirConditioner.decreaseSpeed();
		AirConditioner.decreaseSpeed();
		cond = AirConditioner.onOrOff();
		System.out.println("The AirConditioner connection is : " +cond);
		AirConditioner.decreaseSpeed();
		cond = AirConditioner.onOrOff();
		System.out.println("The AirConditioner connection is : " +cond);
		AirConditioner.decreaseSpeed();
		AirConditioner.decreaseSpeed();
		AirConditioner.decreaseSpeed();
		AirConditioner.decreaseSpeed();
		AirConditioner.decreaseSpeed();
		
	}
} 