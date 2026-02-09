class Instagram{
	static void newUser(long mobileNo, String password,String dob,String name, String username){
		System.out.println("Mobile Number : " + mobileNo);
		System.out.println("New Password : " + password);
		System.out.println("Date of Birth : " + dob);
		System.out.println("Full Name of user : " + name);
		System.out.println("Username : " + username);
	}
	public static void main(String[] gram){
		newUser(8431228913L,"N@vY@123","17-10-2004","Navya.L","navya");
	}
}
