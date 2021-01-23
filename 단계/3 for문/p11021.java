import java.io.*;
import java.util.StringTokenizer;

public class p11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bf.readLine());
		for (int i = 1; i <= n; i++) {

			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);

			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());

			bw.write("Case #" + i + ": " + (n1 + n2) + "\n");

		}
		bw.flush();
		bw.close();
	}

}
