package project05;

public class EmailValidator {
	private static final String SIMPLE_EMAIL_REGEX = 
			"^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

	public static boolean isValidEmail(String email)
	{
		if (email == null)
			return false;
		return email.matches(SIMPLE_EMAIL_REGEX);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidEmail("user.name+tag@example.co.fu"));
		
		System.out.println(isValidEmail("user+tag@example.co.fu"));
		
		System.out.println(isValidEmail("user@example.co.fu"));
		
		System.out.println(isValidEmail("userg@example"));
		
		System.out.println(isValidEmail("user.name+tag@.JHG"));
	}

}
