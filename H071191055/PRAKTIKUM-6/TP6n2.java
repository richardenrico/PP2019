import java.util.Scanner;
class TP6n2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char [] ch = line.toCharArray();
    String word = "";
    for (int i = 0; i < ch.length; i++) {
      if (i % 2 != 0) {
        int in = (int)ch[i];
        word += in;
      }
      else{
        word += ch[i];
      }
    }
    char [] wtc = word.toCharArray();
    int sumwor = (int)Math.ceil(wtc.length / 16.0);
    int sumspa = 0;
    for (int i = 0; i < sumwor * 16; i++) {
      if (i < wtc.length) {
        System.out.print(wtc[i]);
      }
      else {
        System.out.print("?");
      }
      if ((i+1) % sumwor == 0) {
        if (sumspa >= 3) {
          System.out.println();
          sumspa = 0;
        }
        else {
          System.out.print(" ");
          sumspa++;
        }
      }
    }
    sc.close();
  }
}