import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinusEx {

	public PlusMinusEx() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());

	        plusMinus(arr);

	        bufferedReader.close();
	    }
	 
	 public static void plusMinus(List<Integer> arr) {
		 // Write your code here
		 double sz = (double) arr.size();
		 double posRatio = arr.stream().filter(x -> x > 0).count() / sz;
		 System.out.printf("positive values average:: %.6f\n", posRatio);
		 double negRatio = arr.stream().filter(x -> x < 0).count() / sz;
		 System.out.printf("negative values average:: %.6f\n", negRatio);
		 double zerRatio = arr.stream().filter(x -> x == 0).count() / sz;
		 System.out.printf("zero values average:: %.6f\n", zerRatio);

	 }

}

