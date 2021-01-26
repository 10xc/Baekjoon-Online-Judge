import java.util.Scanner;

public class p1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] orig = new double[n];
		double max = 0;
		double sum = 0;

		for (int i = 0; i < n; i++) {
			orig[i] = sc.nextInt();

			if (i == 0)
				max = orig[0];
			else {
				if (orig[i] > max) {
					max = orig[i];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			orig[i] = orig[i] / max * 100;
			sum +=orig[i];
		}

			System.out.println(sum/n);
		

	}
}
