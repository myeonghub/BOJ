#include <stdio.h>


int main(void)
{
	int a, b, c;
	scanf("%d %d\n", &a, &b);
	scanf("%d", &c);
	if ((c + b) < 60)
	{
		b = c + b;
	}
	
	else 
	{
		a = a + ((b + c) / 60);
		if (a > 23)
		{
			a = a-24;
			b = (c + b) - (((c + b) / 60) * 60);
		}
		else {
			b = (c + b) - (((c + b) / 60) * 60);
		}
		
		
	}
	printf("%d %d\n", a, b);
	return 0;
}