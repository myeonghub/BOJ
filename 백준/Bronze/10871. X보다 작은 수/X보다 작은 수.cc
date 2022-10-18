#include <stdio.h>

int main(void)
{
	int a, b, c;
	int i ;
	scanf("%d %d", &a, &b);
	int k[10000];
	for (i = 0; i < a; i++)
	{
		scanf("%d ", &k[i]);
		if (k[i] < b)
		{
			printf("%d", k[i]);
			printf(" ");
		}
	}
	return 0;
}

