#include <stdio.h>

int main() {
	int a, b; 
	// scanf returns the number of items read 
	while (scanf("%d %d", &a, &b) == 2)
	// or you can check for EOF, i.e.
	// while (scanf("%dd %d", %a, %b) != EOF)
		printf("%d\n", a + b);
}

