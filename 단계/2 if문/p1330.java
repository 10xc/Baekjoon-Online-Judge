import java.util.Scanner;

public class p1330 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1>n2)
			System.out.println(">");
		if(n1<n2)
			System.out.println("<");
		if(n1==n2)
			System.out.println("==");
	}

}
