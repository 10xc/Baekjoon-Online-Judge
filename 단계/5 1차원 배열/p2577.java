import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class p2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int abc = a * b * c;
		int length = (int) (Math.log10(abc) + 1);
		int[] arr = new int[10];

		int[] result = Stream.of(String.valueOf(abc).split("")).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < 10; j++) {// 0~9
				int tmp = j;
				if (IntStream.of(result[i]).anyMatch(x -> x == tmp)) {
					arr[tmp]++;
				}
			}
		}

		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}
}
