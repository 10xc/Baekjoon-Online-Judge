import java.util.Scanner;

public class p2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(n1 * (n2 % 10));
		System.out.println(n1 * ((n2 % 100) / 10));
		System.out.println(n1 * ((n2 % 1000) / 100));
		System.out.println(n1 * n2);
	}

}
