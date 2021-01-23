import java.io.*;
import java.util.StringTokenizer;

public class p15552 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= num; i++) {

			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);

			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());


			bw.write((n1 + n2) + "\n");

		}
		bw.flush();
		bw.close();
	}
}
