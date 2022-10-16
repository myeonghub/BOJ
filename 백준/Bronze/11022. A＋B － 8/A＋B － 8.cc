#include <stdio.h>

int main(void)
{
	int b;
	int i;
	scanf("%d", &b);
	for (i = 0; i < b; i++)
	{
		int t, y;
		scanf("%d %d\n",&t,&y);
		printf("Case #%d: %d + %d = %d\n", i+1, t,y,t+y);
	}
	return 0;
}