import java.util.Scanner;

class Tp4n1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int arr[] = new int[input];
    //int multi = input - 1;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    /*
     * for (int i = 0, x = 0; i < multi; i++) { x = 0; x = i + 1; for (int j = 0; j
     * < input - 1; j++) { if(arr[i] % arr[x] != 0 && arr[x] % arr[i] != 0){
     * System.out.print(arr[i] + " " + arr[x]); System.out.println(); } x++; }
     * input--; }
     */
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (i != j) {
          relativPrime(arr[i], arr[j]);
        }
      }
    }
    sc.close();
  }

  static void relativPrime(int a, int b) {
    int min = a;
    if (b < min) {
      min = b;
    }
    boolean cek = true;
    for (int i = 2; i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        cek = false;
        break;
      }
    }

    if (cek) {
      System.out.println(a + " " + b);
    }
  }
}