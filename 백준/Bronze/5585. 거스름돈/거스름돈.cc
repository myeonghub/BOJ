#include <stdio.h>

int main(void)
{
	int i, j, k;
	int sum = 0;
	scanf("%d", &i);
	j = 1000 - i;
	int n[] = { 500, 100 , 50, 10, 5, 1 };
	for (k = 0; k < 6; k++)
	{
		while (j / n[k] > 0)
		{
			j -= n[k];
			sum++;
			
		}
	}
	printf("%d\n", sum);
	
}