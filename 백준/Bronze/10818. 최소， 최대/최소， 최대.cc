#include <stdio.h>

int main(void)
{
	int a;
    int b,i;
	int c[1000001];
	 
	scanf("%d\n", &a);
	for (b= 0; b < a; b++)
	{
		scanf("%d", &c[b]);
	}
    int map = c[0];
	int min = c[0];  
	for (i = 0; i < a; i++)
	{
		
		if (map < (c[i]))
		{
			map = c[i];
		}
		if (min > (c[i]))
		{
			min = c[i];
			
		}
	}
	printf("%d %d", min,map);
	
	
	return 0;
}