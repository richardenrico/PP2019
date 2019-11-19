import java.util.Scanner;
import java.util.Random;

class TP5n2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.close();
    String serialNumber = generateSerial(n, m);
    System.out.print(serialNumber);
  }

  public static String generateSerial(int n, int m) {
    String str = "";
    Random random = new Random();
    int acak;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        acak = random.nextInt(10);
        str += String.valueOf(acak);
      }
      str += i == n - 1 ? "\n" : "-";
    }
    return str;
  }
}