import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSumSoln {

    /* The miniMaxSum function takes array of long values,
     * calculates the sums of any (n-1) [ n denotes size of array ] 
     * array elements combined. Prints the minimum and maximum of the sums.
    */
    static void miniMaxSum(long[] arr) {
	ArrayList<Long> sumList = new ArrayList<Long>();
	int indexToExclude = 0;
	long sum = 0;
	do{
		for(int i=0;i<arr.length;i++){
			if(i!=indexToExclude){
				sum = sum+arr[i];
			}		
		}
		sumList.add(sum);
		indexToExclude++;
		sum = 0;
	}while(indexToExclude < arr.length);
	Collections.sort(sumList);
	System.out.println(sumList.get(0)+" "+sumList.get(sumList.size()-1));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
