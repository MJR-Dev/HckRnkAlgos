import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*For a given array A: [1....N], find the second largest int value, if present. 
 * Else return -1.
 *For example, if A:[2,1,2], '1' should be returned.
 *If A:[2,2,2], '-1' should be returned.
 *First line of input contains the size of array.
 *Second line of input contains the array.
 */
public class SecondLargestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		try {
			int arrySz = Integer.parseInt(br.readLine());
			int[] ary = new int[arrySz];
			String tmp ="";
			while((tmp=br.readLine())!= null && (!tmp.equals("exit"))) {
				if(tmp.trim().length() > 0) {
					String[] elements = tmp.split(",");
					for(int i=0;i<elements.length;i++) {
						ary[i] = Integer.parseInt(elements[i]);
					}
				}
			}
			System.out.println("Second Largest:"+getSecondLargest(ary));
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	static int getSecondLargest(int[] ary) {
		Set<Integer> set1 = new TreeSet<>();
		for(int j=0;j<ary.length;j++)
			set1.add(ary[j]);
		if(set1.size() == 1)
			return -1;
		else {
			Iterator<Integer> iter = set1.iterator();
			int cnt =0,scLrgst=0;			
			while(iter.hasNext()) {
				scLrgst = iter.next();
				if(cnt==(set1.size()-2))
					break;
				else
					cnt++;
			}
			return scLrgst;
		}
	}
}
