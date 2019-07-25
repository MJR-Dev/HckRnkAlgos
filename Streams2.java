import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /* 
     * Complete the 'diagonalDifference' function below.
     *
     * The function taken nxn matrix
     * calculates the correspoding sums of each diagonal elements [left-right and right to left]
     * calculates the difference between the sums and 
     * is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
	int firstDiag = 0, secondDiag = 0, result = 0;
    	for(int i=0;i<arr.size();i++){
		List<Integer> arrInLst = arr.get(i);
		for(int j=0;j<arrInLst.size();j++){
			if(i==j){
				firstDiag = firstDiag + arrInLst.get(j);
			}
        	}
	}
	int j = arr.size()-1;
	for(int i=0;i<arr.size();i++){
		List<Integer> arrInLst = arr.get(i);
		secondDiag = secondDiag + arrInLst.get(j);
		j--;
		if(j<0){
			break;
		}
	}
	result = Math.abs(firstDiag - secondDiag);
	return result;
    }

}

public class Streams2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
