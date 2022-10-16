#include <stdio.h>

int main(void)
{
	int b, c;
	int i;
	scanf("%d", &b);
	for (i = 0; i < b; i++)
	{
		for (c = 0; c < i+1; c++)
		{
	
			printf("*");

		}
			printf("\n");
		
	}
	return 0;
}