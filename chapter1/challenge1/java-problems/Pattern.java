import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int k = sc.nextInt();
			int ans = 0;

			while (k -- > 0) {
				int v = sc.nextInt();
				ans += v;
		}

		System.out.println(ans);
	}
	
}
}

