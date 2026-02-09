class Irctc{
	static void saveNew(String username, String password, String email, long mobileNo){
		System.out.println("Username : " + username);
		System.out.println("New Password : " + password);
		System.out.println("E-mail ID of user : " + email);
		System.out.println("Mobile Number : " + mobileNo);
	}
	public static void main(String[] train){
		saveNew("navya","N@vY@123","lnavya30@gmail.com",8431228913L);
	}
}