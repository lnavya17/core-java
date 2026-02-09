class AadhaarPortal{
	static void newAccount(long aadharNo, int otp){
		System.out.println("Aadhaar Number of user: " + aadharNo);
		System.out.println("OTP recieved : " + otp);
	}
	
	public static void main(String[] aadhar){
		newAccount(685653386866L, 2863);
	}
}