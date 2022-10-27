#include <stdio.h>

int main(void)
{
	int a, b, c;
	int d[150];
	int i = 0;
	int j;
	scanf("%d\n", &a);
	for(j=0;j<a;j++)
    scanf("%d ", &d[j]);
	scanf("%d", &b);
	for (c = 0; c < a; c++)
	{
		if (d[c] == b)
		{
			i++;
		}
	}
	printf("%d\n", i);
	return 0;
}