public class eq {
    public static void main(String[] args) {
        int n=4,star=3;
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j <=i; j++) {
               System.out.print(star+i);
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for (int j = 0; j <i; j++) {
               System.out.print(star+ i - 1);
            }
            System.out.println();
        }
    }
}
