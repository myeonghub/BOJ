
#include <stdio.h>

int main(void)
{
	int a, b ;
	int i ;
	int k[10000];
	for (i = 0; i <100 ; i++)
	{
		scanf("%d %d",&a,&b);
		k[i] = a + b;
		if (a + b == 0)
		{
			break;
		}
		
			printf("%d\n", k[i]);
		
		
	}
	return 0;
}
