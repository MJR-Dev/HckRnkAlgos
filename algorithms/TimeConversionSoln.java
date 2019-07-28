import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversionSoln {

    /*
     * The timeConversion function converts AM/PM time format to 24-HR format.
     */
    static String timeConversion(String timeStr) {
        HashMap<Integer,Integer> am24Hr = Am24HrMap();
	HashMap<Integer,Integer> pm24Hr = Pm24HrMap();
	String finalFormat = " ";
	String s1 = timeStr.substring(0,timeStr.length()-2);
	String[] timeTokens = (timeStr.substring(0,timeStr.length()-2)).split(":");
	int hr = 0;
	if(timeStr.contains("AM")){
		hr = am24Hr.get(Integer.parseInt(timeTokens[0]));
		finalFormat = String.format("%02d",hr)+":"+timeTokens[1]+":"+timeTokens[2];	
	} else if(timeStr.contains("PM")){
		hr = pm24Hr.get(Integer.parseInt(timeTokens[0]));
		finalFormat = String.format("%02d",hr)+":"+timeTokens[1]+":"+timeTokens[2];
	}
	return finalFormat;
    }

    private static HashMap<Integer,Integer> Am24HrMap(){
	HashMap<Integer,Integer> am24Hr = new HashMap<Integer,Integer>();
	for(int i=1;i<13;i++){
		if(i!=12){
			am24Hr.put(i,i);
		} else{
			am24Hr.put(i,0);	
		}
	}
	return am24Hr;
    }

    private static HashMap<Integer,Integer> Pm24HrMap(){
	HashMap<Integer,Integer> pm24Hr = new HashMap<Integer,Integer>();
	int initialPmHr = 13;
	for(int i=1;i<13;i++){
		if(i!=12){
			pm24Hr.put(i,initialPmHr);
		} else{
			pm24Hr.put(i,12);	
		}
		initialPmHr++;
	}
	return pm24Hr;
    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
