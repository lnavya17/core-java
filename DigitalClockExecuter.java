class DigitalClockExecuter{
	public static void main(String[] digi){
		boolean clock = DigitalClock.onOrOff();
		System.out.println("The DigitalClock connection is : " +clock);
		
		DigitalClock.increaseSpeed();
		clock = DigitalClock.onOrOff();
		System.out.println("The DigitalClock connection is : " +clock);
		DigitalClock.increaseSpeed();
		DigitalClock.increaseSpeed();
		DigitalClock.increaseSpeed();
		DigitalClock.increaseSpeed();
		DigitalClock.increaseSpeed();
		DigitalClock.increaseSpeed();
		clock = DigitalClock.onOrOff();
		System.out.println("The DigitalClock connection is : " +clock);
		DigitalClock.increaseSpeed();
		
		DigitalClock.decreaseSpeed();
		DigitalClock.decreaseSpeed();
		DigitalClock.decreaseSpeed();
		DigitalClock.decreaseSpeed();
		clock = DigitalClock.onOrOff();
		System.out.println("The DigitalClock connection is : " +clock);
		DigitalClock.decreaseSpeed();
		DigitalClock.decreaseSpeed();
		DigitalClock.decreaseSpeed();
		clock = DigitalClock.onOrOff();
		System.out.println("The DigitalClock connection is : " +clock);
		DigitalClock.decreaseSpeed();
		DigitalClock.decreaseSpeed();
		
		
		
	}
} 