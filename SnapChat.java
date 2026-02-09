class SnapChat{
	static void saveNewUser(String name, String email, String dob, String password){
		System.out.println("Name of user: " + name);
		System.out.println("E-mail ID of user : " + email);
		System.out.println("Date of Birth : " + dob);
		System.out.println("New Password : " + password);
	}
	public static void main(String[] chat){
		saveNewUser("Navya.L","lnavya30@gmail.com","17-10-2004","N@vY@123");
	}
}