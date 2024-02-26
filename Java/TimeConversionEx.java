import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversionEx {

	public static void timeConvert(String input) {
		// TODO Auto-generated constructor stub
		String regex = "(0[1-9]|1[0-2]):([0-5][0-9]):([0-5][0-9])(AM|PM)";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		StringBuffer sb = new StringBuffer();
		if(match.find()) {
			String format = input.substring(input.length()-2);
			String actualDate = input.substring(0, input.length()-2);
			int[] dateTokens = Arrays.stream(actualDate.split(":")).mapToInt(Integer::parseInt).toArray();
			if(format.equals("AM")) {
				if(dateTokens[0] < 12) {
					if(dateTokens[0] < 10)
						sb.append("0"+dateTokens[0]);
					else
						sb.append(dateTokens[0]);
				} else	if(dateTokens[0] == 12) {
					sb.append("00");
				} 
			} else {
				if(dateTokens[0] < 12) {
					sb.append(String.valueOf(dateTokens[0]+12));
				} else if(dateTokens[0] == 12) {
					sb.append(dateTokens[0]);
				}				
			}
			sb.append(":");
			if(dateTokens[1]<=9)
				sb.append("0"+dateTokens[1]);
			else
				sb.append(dateTokens[1]);
			sb.append(":");
			if(dateTokens[2]<=9)
				sb.append("0"+dateTokens[2]);
			else
				sb.append(dateTokens[2]);
			System.out.println("Final time: "+sb.toString());
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);	        
         String s = sc.nextLine();
         timeConvert(s);
         sc.close();
	}

}
