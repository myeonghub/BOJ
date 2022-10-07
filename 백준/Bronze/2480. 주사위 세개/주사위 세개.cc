
#include <stdio.h>


int main(void)
{
	int a, b, c;
	int d=0;
	scanf("%d %d %d", &a, &b, &c);
	if (a == b && b == c)
	{
		d = 10000 + (a * 1000);
	}
	else if (a == b || b == c || a == c)
	{
		if (a == b || a == c)
		{
			d = 1000 + (a * 100);
		}
		else
		{
			d = 1000 + (b * 100);
		}
	}
    else 
    {  if (a >b && b>c || a>c && c>b)
		{
			d = a * 100;
		}
		else if(b>c && c>a || b>a&& a>c)
		{
			d = b * 100;
		}
		else 
		{
			d = c * 100;
		}
	}
	printf("%d\n", d);
	return 0;
}