package project05;

public class PhoneMasker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone1 = "13800138000";
		String phone2 = "13900139870";
		String obfuscated1 = phone1.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1***$2");
		System.out.println(obfuscated1);
		String obfuscated2 = phone2.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1***$2");
		System.out.println(obfuscated2);
	}

}
