import java.util.Scanner;
public class Sums2v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b; 
		// stop when both integers are 0
		while (((a = sc.nextInt()) != 0) && ((b = sc.nextInt()) != 0)) {
			System.out.println(a + b);
		}
	}}
