public class selection {
    public static int [] Selectionsort(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            int small=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[small])
                {
                        small=j;
                }
            }
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={8,7,3,1,2};
       arr=Selectionsort(arr);
       for (int i : arr) {
        System.out.print(i+" ");
       }

    }   
}
