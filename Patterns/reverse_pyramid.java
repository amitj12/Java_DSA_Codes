class reverse_pyramid
{
public static void main(String[] args) {
  int N=4;
  for (int i = 1; i <= N; i++) {
    int product = 1;
    for (int j = 1; j <= i; j++) {
      product *= j;
    }
    System.out.print(product + " ");
  }
  System.out.println();
  for (int i = N; i >= 1; i--) {
    int product = 1;
    for (int j = 1; j <= i; j++) {
      product *= j;
    }
    System.out.print(product + " ");
  }
}
}
