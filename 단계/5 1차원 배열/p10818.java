import java.util.Scanner;

public class p10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0, min = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			if (i == 0) {
				max = arr[i];
				min = arr[i];
			} else {
				if (arr[i] > max)
					max = arr[i];

				if (arr[i] < min)
					min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
