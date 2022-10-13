#include <stdio.h>

int main(void)
{
	int a, b;
	int e = 0;
	int i;
	scanf("%d", &a);
	scanf("%d", &b);
	for (i = 0; i < b; i++)
	{
		int c, d;
		scanf("%d %d", &c, &d);
		e = (c * d) + e;
	}
	if (a==e)
	{
		printf("Yes");
	}
	else
	{
		printf("No");
	}
	return 0;
}
