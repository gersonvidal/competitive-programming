import java.util.Scanner;
import java.util.Arrays;
public class UniqueIntegers {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		Arrays.sort(arr);
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (arr[i] != arr[i+1]) {
					c++;
				}
			} else if (i == n - 1) {
				if (arr[i] != arr[i-1]) {
					c++;
				}
			} else {
			if ((arr[i] != arr[i-1]) && (arr[i] != arr[i+1])) {
				c++;	
			}
		}
	}
		int[] nArr = new int[c];
		int nC = 0;
		for (int i = 0; i < n; i++) {
                        if (i == 0) {
				if (arr[i] != arr[i+1]) {
					nArr[nC] = arr[i];
					nC++;
				}
			} else if (i == n - 1) {
				if (arr[i] != arr[i-1]) {
					nArr[nC] = arr[i];
					nC++;
				}
			} else {
			if ((arr[i] != arr[i-1]) && (arr[i] != arr[i+1])) {
					nArr[nC] = arr[i];
					nC++;	
			}
		}
              }
		Arrays.sort(nArr);
		System.out.print(Arrays.toString(nArr));
        }

	}
