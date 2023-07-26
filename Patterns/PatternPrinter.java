

public class PatternPrinter {


    public static void main(String[] args) 
    {
        
        int n = 4;
        int num = (n * (n + 1)) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n) {
                    System.out.print(i);
                } else {
                    System.out.print("* " + i);
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print("* " + i);
                }
            }
            System.out.println();
        }
    
    }
    
}
