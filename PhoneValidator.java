package project05;

public class PhoneValidator {

	public static String validatePhone(String phone)
	{
		String regex = "^1[3~9]\\d{9}$";
		return phone.matches(regex) ? "Valid phone" : "Invalid phone";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validatePhone("13800138002"));
		System.out.println(validatePhone("12345678901"));
		System.out.println(validatePhone("123456901"));
	}

}
