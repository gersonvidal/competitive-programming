import java.util.Scanner;
import java.lang.Math;

public class PrintPi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		if (a <= 15) { System.out.printf("%." + a + "f", Math.PI); } else { System.out.print("Error"); }
	}
}
