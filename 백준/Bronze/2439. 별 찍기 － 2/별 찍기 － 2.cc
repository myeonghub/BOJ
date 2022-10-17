#include <stdio.h>


int main(void)
{
	int b, c;
	int i;
	scanf("%d", &b);
	for (i = 0; i < b; i++)
	{
		
	    for (c = 0; c < b; c++)

		{
	        if(c<b-i-1)
               {printf(" ");}
            else{
			     printf("*");
                            }
		}
			printf("\n");
		
	}
	return 0;
}