import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/*Problem Description:
 * A table consists of 12 columns each denoting a month from jan to dec.
 * Table is filled with cumulative sum of salary starting from first row continuously 
 * for infinite time. If S is 100, then row1 is [100....1200],row2 [1300....2400] and so on.
 * You need to answer Q qns each having S,X. X is one of the values from the table.class
 * print the column number to which X belongs to. The first line of input represents Q.
 * The following lines contains S  X for each of Q qns.
 * ex:
 *	2
 *	100 2500
 *	100 200
 * o/p: 
 * 1
 * 2 
 */
public class ArrayQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfCases = 0;
		try{
			numOfCases = Integer.parseInt(br.readLine());
		
		String[] ip = new String[numOfCases];
		
		for(int i=0;i<numOfCases;i++) {
			String tmp = br.readLine();
			if(tmp != null && tmp.trim().length() > 0) {
				ip[i] = tmp;
			}
		}
		createTable(ip);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void createTable(String[] ip) {
		int[] op = new int[ip.length];
		for(int j=0;j<ip.length;j++) {			
			boolean flag = true;
			String[] sx = ip[j].split(" ");
			int s = Integer.parseInt(sx[0]);
			int x = Integer.parseInt(sx[1]);			
			
			int tmpS = s;
			
			while(flag) {
				HashMap<Integer,Integer> map1 = new HashMap<>();
				for(int k=1;k<13;k++) {
					tmpS = (s+(100*(k-1)));
					map1.put(k, tmpS);
					
					if(x == tmpS) {
						flag = false;
						op[j] = k;
					}
				}
				s=tmpS+100;
			}
			
		}
		for(int m =0;m<op.length;m++) {
			System.out.println(op[m]);
		}
		
	}
}
