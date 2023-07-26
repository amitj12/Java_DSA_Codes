public class merege {
    public static void merege_sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            merege_sort(a, l, mid);
            merege_sort(a, mid+1, r);
            mergee(a,l,mid,r);
        }
    }
   
    public static void mergee(int a[],int left,int mid,int right)
    {
         int b[]=new int[a.length];

         int i=left;
         int j=mid+1;
         int k=left;

         while (i<=mid && j<=right) {
            if (a[i]>a[j]) {
                b[k]=a[j];
                j++;
            }
            else
            {
                b[k]=a[i];
                i++;
            }
            k++;
         }

         if(i<=mid)
         {
            while (i<=mid) {
                b[k]=a[i];
                i++;
                k++;
            }
         }
         else
         {
            while (j<=right) {
                b[k]=a[j];
                j++;
                k++;
            }
         }
         for (int k2 = left; k2 <=right; k2++) {
            a[k2]=b[k2];
         }

    }
    public static void main(String[] args) {
        int a[]={9,4,7,6,3,1,5};

        merege_sort(a, 0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
