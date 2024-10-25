import java.util.Scanner;

public class Sums4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c = 1;

	while (sc.hasNextInt()) {
		a = sc.nextInt();

		if (!sc.hasNextInt()) {
			break;
		}

		b = sc.nextInt();

		System.out.println("Case " + (c++) + ": " + (a + b) + "\n");
	}
}
}
