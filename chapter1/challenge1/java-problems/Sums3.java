import java.util.Scanner;

public class Sums3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt(); 
			if (!sc.hasNextInt()) {
				break;
			}
			
			int b = sc.nextInt();

			System.out.println(a + b);
		}
	}
}
