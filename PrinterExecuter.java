class PrinterExecuter{
	public static void main(String[] speak){
		boolean print = Printer.onOrOff();
		System.out.println("The Printer connection is : " +print);
		
		Printer.increaseSpeed();
		Printer.increaseSpeed();
		print = Printer.onOrOff();
		System.out.println("The Printer connection is : " +print);
		Printer.increaseSpeed();
		Printer.increaseSpeed();
		print = Printer.onOrOff();
		System.out.println("The Printer connection is : " +print);
		Printer.increaseSpeed();
		Printer.increaseSpeed();
		
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		
		
	}
} 