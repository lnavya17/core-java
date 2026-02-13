class GamingLaptopExecuter {
    
	public static void main(String[] game){
		
		String brand= GamingLaptop.getBrand();
		double price=GamingLaptop.getPrice();
		String processor=GamingLaptop.getProcessor();
		int ram=GamingLaptop.getRam();
		int storage=GamingLaptop.getStorage();
		String gpu=GamingLaptop.getGpu();
		double screen=GamingLaptop.getScreen();
		int battery=GamingLaptop.getBattery();
		String os=GamingLaptop.getOs();
		int usbPorts=GamingLaptop.getUsbPorts();
		boolean rgb=GamingLaptop.getRgb();
		int warranty=GamingLaptop.getWarranty();
		String color=GamingLaptop.getColor();
		double weight=GamingLaptop.getWeight();
		boolean webcam=GamingLaptop.getWebcam();
		
		System.out.println("The brand name is:" + brand);
		System.out.println("The price is: "+ price);
		System.out.println("The Processor is:" +processor);
		System.out.println("The ram of product is : "+ ram);
		System.out.println("The storage capacity is: "+ storage);
		System.out.println("The gpu is : "+ gpu);
		System.out.println("The screen is : "+ screen);
		System.out.println("The battery is :"+ battery);
		System.out.println("The os is : "+ os);
		System.out.println("The usb Ports is :"+ usbPorts);
		System.out.println("The rgb is : "+ rgb);
		System.out.println("The warranty is: "+ warranty);
		System.out.println("The color of product is: "+ color);
		System.out.println("The weight is : "+ weight);
		System.out.println("The webcam is : "+ webcam);
	}
}