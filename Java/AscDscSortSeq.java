import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Given an integer array, sort elements till index 'index' in ascending order
 * sort elements from index+1 till array.length in descending order
 */
public class AscDscSortSeq {

	public AscDscSortSeq() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];
		for(int i=0;i<size;i++) {
			input[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index for sorting ascending and then descending: ");
		int index = sc.nextInt();
		
		int[] lst1 = Arrays.stream(input).limit(index).sorted().toArray();
		int[] lst2 = Arrays.stream(input).skip(index).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		int[] finalOutput = IntStream.concat(Arrays.stream(lst1), Arrays.stream(lst2)).toArray();
		Arrays.stream(finalOutput).forEach(System.out::println);
	}

}
