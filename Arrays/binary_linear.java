public class binary_linear {

    static void binarys(int a[],int ele)
    {
        int start=0,end=a.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (a[mid]==ele) {
                System.out.println("element found at pos: "+mid);
                break;
            }
            else if(a[mid]<ele)
            {
                start=mid+1;
            }
            else
            {
                end=end-1;
            }
        }
    }
    static void linears(int a[],int ele)
    {
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==ele)
            {
                System.out.println("element found at index: "+i);
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("element not found");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("Linear search: ");
        linears(arr, 6);
        System.out.println("binary search: ");
        linears(arr, 6);



    }
}
