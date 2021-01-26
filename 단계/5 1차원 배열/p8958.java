import java.util.Scanner;

public class p8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			int sum = 0;
			String score = sc.next();

			for (int j = 0; j < score.length(); j++) {
				if (score.charAt(j) == 'O') {
					sum += cnt;
					cnt++;
				}
				else if (score.charAt(j) == 'X')
					cnt = 1; 
			}
			System.out.println(sum);
		}
	}

}
