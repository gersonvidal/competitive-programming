import java.util.Scanner;

public class Sums5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 1;

		while (sc.hasNextInt()) {
			a = sc.nextInt();
			if (!sc.hasNextInt()) {
				break;
			}

			b = sc.nextInt();

			if (c > 1) { 
				System.out.println();
			}

			System.out.println("Case " + (c++) + ": " + (a + b));
		}
	}

}
