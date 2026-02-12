class RouterExecuter{
	public static void main(String[] rout){
		boolean route = Router.onOrOff();
		System.out.println("The Router connection is : " +route);
		
		Router.increaseSpeed();
		route = Router.onOrOff();
		System.out.println("The Router connection is : " +route);
		Router.increaseSpeed();
		Router.increaseSpeed();
		Router.increaseSpeed();
		route = Router.onOrOff();
		System.out.println("The Router connection is : " +route);
		Router.increaseSpeed();
		Router.increaseSpeed();
		Router.increaseSpeed();
		Router.increaseSpeed(); 
		
		Router.decreaseSpeed();
		Router.decreaseSpeed();
		route = Router.onOrOff();
		System.out.println("The Router connection is : " +route);
		Router.decreaseSpeed();
		Router.decreaseSpeed();
		route = Router.onOrOff();
		System.out.println("The Router connection is : " +route);
		Router.decreaseSpeed();
		Router.decreaseSpeed();
		Router.decreaseSpeed();
		Router.decreaseSpeed();
		Router.decreaseSpeed();
		
	}
} 