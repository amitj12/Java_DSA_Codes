public class twodArr {
    static void display(int a[][]) {
        System.out.println("Elemets in array ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void search(int a[][], int ele) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == ele) {
                    System.out.println("found at row " + i + "coloum " + j);
                }
            }

        }

    }

    public static void transpose(int a[][]) {
        System.out.println("Transpose of array ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }

        }
        display(a);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        display(arr);
        transpose(arr);
        search(arr, 8);

    }
}
