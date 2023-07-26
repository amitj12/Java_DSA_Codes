public class Quick_sort {
    public static void quick_sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int pivot=partition(a,l,r);
            quick_sort(a, l, pivot-1);
            quick_sort(a, pivot+1, r);
          
        }
    }
   public static int partition(int a[],int left,int right)
   {
        int pivot=a[left];
        int i=left;
        int j=right;

        while (i<j) {
            while(i<=right && a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
       
        int temp=a[left];
        a[left]=a[j];
        a[j]=temp;
        

         return j+1;

   }
    
    public static void main(String[] args) {
        int a[]={9,4,7,6,3,1,5};

        quick_sort(a, 0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
