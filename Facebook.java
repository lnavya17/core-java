class Facebook{
	static void newMember(String firstName, String lastName, String dob, String gender, long mobileNo, String password){
		System.out.println("First Name of user : " + firstName);
		System.out.println("Last Name of user : " + lastName);
		System.out.println("Date of Birth : " + dob);
		System.out.println("Gender : " + gender);
		System.out.println("Mobile Number : " + mobileNo);
		System.out.println("New Password : " + password);
	}
	public static void main(String[] face){
		newMember("Navya","L","17-10-2004","Female",8431228913L,"N@vy@123");
	}
}
