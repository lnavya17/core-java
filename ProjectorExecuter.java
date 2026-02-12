class ProjectorExecuter{
	public static void main(String[] proj){
		boolean projec = Projector.onOrOff();
		System.out.println("The Projector connection is : " +projec);
		
		Projector.increaseSpeed();
		Projector.increaseSpeed();
		projec = Projector.onOrOff();
		System.out.println("The Projector connection is : " +projec);
		Projector.increaseSpeed();
		Projector.increaseSpeed();
		projec = Projector.onOrOff();
		System.out.println("The Projector connection is : " +projec);
		Projector.increaseSpeed();
		Projector.increaseSpeed();
		Projector.increaseSpeed();
		Projector.increaseSpeed();
		
		Projector.decreaseSpeed();
		projec = Projector.onOrOff();
		System.out.println("The Projector connection is : " +projec);
		Projector.decreaseSpeed();
		Projector.decreaseSpeed();
		Projector.decreaseSpeed();
		projec = Projector.onOrOff();
		System.out.println("The Projector connection is : " +projec);
		Projector.decreaseSpeed();
		Projector.decreaseSpeed();
		Projector.decreaseSpeed();
		Projector.decreaseSpeed();
		
	}
} 