class Naukri{
	static void saveNewAccount(String name, String email, String password, long mobileNo, String workStatus,String currentCity,boolean impUpdate){
		System.out.println("Name of user: " + name);
		System.out.println("E-mail ID of user : " + email);
		System.out.println("New Password : " + password);
		System.out.println("Mobile Number : " + mobileNo);
		System.out.println("Current City of user : " + currentCity);
		System.out.println("Send Important updates : " + impUpdate);
	}
	public static void main(String[] naukri){
		saveNewAccount("Navya.L","lnavya30@gmail.com","N@vY@123",8431228913L,"Fresher","Chikkamagaluru",true);
	}
}