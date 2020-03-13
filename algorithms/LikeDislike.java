import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Given 2 arrays with equal length, find the 
 * number of positions such that the values
 * in both the arrays for those positions are same.
 */
public class LikeDislike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ip1="";
		String ip2="";
		int cnt=0;
		try {
			ip1 = br.readLine();
			ip2 = br.readLine();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}			
		if(ip1.length() == ip2.length()) {
			for(int i=0;i<ip1.length();i++) {
				if(ip1.charAt(i) == ip2.charAt(i)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
