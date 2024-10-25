import java.util.Scanner;

public class Sums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc, a, b; 
		tc = sc.nextInt(); // number of test cases 
	 	while (tc-- > 0) { // shortcut to repeat until 0
			a = sc.nextInt();
			b = sc.nextInt(); // compute answer 
			System.out.println(a + b); // on the fly  
		}

	}
	
}


