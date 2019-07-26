import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang3.StringUtils;

public class StaircaseSoln {

    /* The staircase function prints '#' in form of staircase
     * based on the input [ number of rows 'n'], which is right 
     * aligned and padded with spaces upto [ n - rownumber ].
     */
    static void staircase(int n) {
	for(int i=1;i<=n;i++){
		StringBuilder sb = new StringBuilder();
		for(int k=1;k<=n-i;k++){
			sb.append(' ');
		}
		for(int j=1;j<=i;j++){
			sb.append('#');
		}
		System.out.println(sb.toString());
	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
