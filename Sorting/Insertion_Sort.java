public class Insertion_Sort {

    public static int [] Insertionsort(int a[])
    {
        for (int i = 1; i < a.length; i++) {
            int j=i-1;
            int current=a[i];
            while (j>=0 && current<a[j]) {
                a[j+1]=a[j];
                j--;
                
            }
         a[j+1]=current;

        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={8,7,3,1,2};
        arr=Insertionsort(arr);
        for (int i : arr) {
         System.out.print(i+" ");
        }
    }
}
