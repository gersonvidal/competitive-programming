import java.util.*;
import java.time.*;
public class DayOfWeek { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), y = sc.nextInt();
		String m = sc.next();
		System.out.printf("%tA", LocalDate.of(y, Month.valueOf(m.toUpperCase()), d));
	}
}
