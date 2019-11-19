import java.util.Scanner;

class TP5n1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    sc.close();
    fpb(a, b);
    System.out.print("FPB dari " + a + " dan " + b + " = " + fpb(a, b));
  }

  static int fpb(int a, int b) {
    int max = 0;
    if (a > b) {
      max = a;
    } else if (a < b) {
      max = b;
    } else if (a == b) {
      max = a;
    }
    int t = 1;
    // int count = 0;
    for (int i = 2; i <= max;) {
      // System.out.println("CEK");
      // count++;
      if (a % i == 0 && b % i == 0) {
        a = a / i;
        b = b / i;
        t *= i;
      } else if (a % i != 0 && b % i == 0) {
        a = a;
        b = b / i;
      } else if (a % i == 0 && b % i != 0) {
        a = a / i;
        b = b;
      } else if (a % i != 0 && b % i != 0) {
        a = a;
        b = b;
        i++;
      }
    }
    // System.out.println(count);
    return t;
  }
}
