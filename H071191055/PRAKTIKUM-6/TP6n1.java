import java.util.Scanner;
class TP6n1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    sc.close();
    String replace = input.replaceAll("\\s+", "");
    String toupper = replace.toUpperCase();
    int split = toupper.length()/2;
    String g = "";
    for (int i = 0; i < split; i++) {
      g += toupper.charAt(i);
    }
    String j = g;
    char h[] = j.toCharArray();
    String c = "";
    for (int i = (h.length) - 2; i >= 0; i--) {
      c += h[i];
    }
    String palidron = j + c; 
    int hexa = input.length() * input.length();
    String hxdec = String.format("%x", hexa);
    char simbol = hxdec.charAt(0);
    System.out.printf("#%s%s%o%c", hxdec, palidron, input.length(), simbol >= 'A' && simbol <= 'z' ? '?' : '!');
  }
}