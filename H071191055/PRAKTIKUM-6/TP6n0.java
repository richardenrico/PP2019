import java.util.Scanner;
class TP6n0{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama = sc.nextLine();
    int n = sc.nextInt();
    char x[] = nama.toCharArray();
    int c;
    char str;
    // char d = sc.next().charAt(0);
    for (int i = 0; i < x.length; i++) {
      c = (int)x[i] + n;
      if (c >= 65 && c <= 90) {
        c = c;
      }else if (c >= 97 && c <= 122) {
        c = c;
      }else if (c > 90 && c <= 93 || c > 122){
        c = c - 26;
      }if(c < 65 || c > 93 && c < 97){
        c = c + 26;
      }
      str = (char)c;
      System.out.print(str);
    }
    sc.close();
  }
}
