import java.util.Scanner;

public class p2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M >= 45) {
			M = M - 45;
		} else {
			M = M + 15;
			H--;
			if(H<0)
				H+=24;
		}
							
		if (H >= 24) H = -24;
			System.out.println(H + " " + M);
	}
}
