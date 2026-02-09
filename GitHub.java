class GitHub{
	static void userAccount(String email, String password, String username, String country, boolean preference){
		System.out.println("E-mail ID of user : " + email);
		System.out.println("New Password : " + password);
		System.out.println("Username : " + username);
		System.out.println("Country or Region : " + country);
		System.out.println("Email Preference: " + preference);
	}
	public static void main(String[] git){
		userAccount("lnavya30@gmail.com","N@vY@123","navya","India",true);
 	}
}
