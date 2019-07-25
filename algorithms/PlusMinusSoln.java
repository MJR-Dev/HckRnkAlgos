import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinusSoln {

    /*
     * The function plusMinus takes an array containing 
     * positive, negative and zero values integers.
     * Counts the number of positives,negatives, zeroes 
     * takes average of the counts and formats to 6 decimal places
    */
    static void plusMinus(int[] arr) {
	int plusCnt = 0, minusCnt = 0, zeroCnt = 0;		
	int size = arr.length;
	for(int i: arr){
		if(i>0) plusCnt++;
		if(i<0) minusCnt++;
		if(i==0) zeroCnt++;
	}	
	System.out.format("%.6f",(double)plusCnt/(double)size);
	System.out.println();
	System.out.format("%.6f",(double)minusCnt/(double)size);
	System.out.println();
	System.out.format("%.6f",(double)zeroCnt/(double)size);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
