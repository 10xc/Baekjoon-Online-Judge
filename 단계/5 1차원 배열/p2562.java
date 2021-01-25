import java.util.Scanner;

public class p2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int num = 0;
		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			if (i == 0)
				max = arr[0];
			else {
				if (arr[i] > max) {
					max = arr[i];
					num = i;
				}
			}
		}
		System.out.println(max);
		System.out.println(num);
	}

}
