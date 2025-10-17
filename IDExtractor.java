package project05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "身份证号：110101199003077635，其他信息....";
		String regex = "[1-9]\\d{5}(19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])\\d{3}[\\dXx]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find())
		{
			System.out.println("Extracted ID:" + matcher.group());
		}
	}

}
