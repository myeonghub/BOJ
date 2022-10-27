#include <stdio.h>

int main(void)
{
	int a;
	int i = 1;
	int j;
	int sum;
	scanf("%d", &a);
	int on, nn;
	on = a / 10;
	nn = a % 10;
	sum = on + nn;
	j = (sum % 10) + (nn * 10);



	if (a > 9)
	{
		on = a / 10;
		nn = a % 10;
		sum = on + nn;
		j = (sum % 10) + (nn * 10);
		while (j != a)
		{

			j = (((j / 10) + (j % 10)) % 10) + ((j % 10) * 10);
			i++;
		}
	}
	else {
		a = a * 10; on = a / 10;
		nn = a % 10;
		sum = on + nn;
		j = (sum % 10) + (nn * 10);

		while (j != a)
		{
			j = (((j / 10) + (j % 10)) % 10) + ((j % 10) * 10);
			i++;
		}
	}


	printf("%d", i);
	return 0;
}