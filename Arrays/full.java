import java.util.*;
public class full
{
    static void display(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

     static void sum(int a[])
     {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];

        }
        System.out.println("\nsum of elements: "+sum);
     }
     static void max(int a[])
     {
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println("Maximum element: "+max);
     }
     static void min(int a[])
     {
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println("minimum element: "+min);
     }
     static void sortarr(int a[])
     {
        Arrays.sort(a);
        System.out.println("After Sorting elements: ");
        display(a);
     }
     static void insert(int a[],int ele,int pos)
     {
        System.out.println("\nafter insertion "+ele);
        if(a.length<pos)
        {
            return;
        }
        int b[]=new int[a.length+1];
        int i,temp=0;
        for (i = 0; i<pos ; i++) {
            b[i]=a[temp++];
        }
        b[i]=ele;
        
        for ( i=pos+1 ; i <= a.length; i++) {
            b[i]=a[temp++];
        }
        display(b);
     }
     static void deletee(int a[],int pos)
     {

        if(a.length<pos)
        {
            return;
        }
                System.out.println("\nafter deletion "+a[pos]);

        int i;
        for (i = pos; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[i]=0;
        display(a);
     }

     static void search(int a[],int ele)
     {
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==ele) {
                System.out.println("\nelement found at index: "+i);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("\nelement not found");
        }
     }

     static void update(int a[],int ele,int upele)
     {
        System.out.println("after updating element: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i]==ele) {
               a[i]=upele;
            }
        }
        display(a);
       
     }
     
    public static void main(String[] args) {
        int arr[]={7,5,6,4,3,9,2,1};
        System.out.println("Array Elements: ");
        display(arr);

        sum(arr);
        max(arr);
        min(arr);
        sortarr(arr);
        insert(arr,10,5);
        deletee(arr, 5);
        search(arr, 7);
        update(arr, 1, 10);
    }
}