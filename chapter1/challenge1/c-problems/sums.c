#include <stdio.h>

int main() {

int tc, a, b;
scanf("%d", &tc); // number of test cases
while (tc--) { // shortcut to repeat until 0 
	scanf("%d %d", &a, &b); // compute answer 
	printf("%d\n", a + b); // on the fly 
	}
	return 0;
}

