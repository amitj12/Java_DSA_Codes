#include<stdio.h>

void ascDecFunc(int a[], int n,int k)
{
    int temp;
    for(int i=0;i < n-1;i++)
    {
        for(int j = 0;j < k-1; j++) 
        { if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        
        for(int j = k;j < n-1; j++)
        {
            if(a[j] < a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
	
	for(int i = 0; i < n; i++)
	    printf("%d ", a[i]);
}
 
int main()
{
    int arr[] = {7,43,12,4,1,3,78,6};
    int len = sizeof(arr) / sizeof(arr[0]);
    int k=4;
    ascDecFunc(arr, len,k);
 
    return 0;
}