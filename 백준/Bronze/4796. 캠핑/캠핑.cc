#include <stdio.h>

int main(void)
{
	int i;
	int L, P, V;
	for (i = 1; ; i++) {
		int A, B, K=0 ;
	    scanf("%d %d %d", &L, &P, &V);
		if (L == 0 && V == 0 && P == 0)
		{
			break;
		}
		A =V / P ;
		B = V % P;
		if (B > L)
			K = (A * L) + L;
		else
			K = (A * L) + B;
		printf("Case %d: %d\n",i,K);

	}

	
	return 0;
}