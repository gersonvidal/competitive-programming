import java.util.*;
public class UniqueIntegers2 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) { arr[i] = new Scanner(System.in).nextInt(); }
		Set<Integer> s = new TreeSet<>(Arrays.asList(arr));
		System.out.print(s);
	}
}
