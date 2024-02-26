import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSumEx {

	public MiniMaxSumEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
	
	public static void miniMaxSum(List<Integer> arr) {
		Long minSum = 0L, maxSum = 0L;
		if(arr.stream().distinct().count() == 1) {
			minSum = maxSum = Long.valueOf(arr.stream().findFirst().get() * 4);
		} else {
			 Integer min = arr.stream().min(Integer::compareTo).get();
			 Integer max = arr.stream().max(Integer::compareTo).get();
			 
			 minSum = arr.stream().filter(x -> x != max).mapToLong(Integer::longValue).sum();
			 maxSum = arr.stream().filter(x -> x != min).mapToLong(Integer::longValue).sum();
		}			
		System.out.println(minSum + " " + maxSum);
		
	}

}
