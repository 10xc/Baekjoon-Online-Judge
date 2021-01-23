import java.util.Scanner;

public class p1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		if(N==0) cnt=1;
		int n1, n2 = 0, n3 = 0;

		while ((n2*10)+(n3%10)!=N) {
			if (cnt == 0) {
				n1 = N / 10; 
				n2 = N % 10; 
			} else {
				n1 = n2;
				n2 = n3 % 10;
			}
			n3 = n1 + n2;
			cnt++;
		}
		System.out.println(cnt);
	}
}
