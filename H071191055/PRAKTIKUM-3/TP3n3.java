import java.util.Scanner;
class TP3n3{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int c = iScanner.nextInt();
        int a = 0, b = 1, hasil = 0;
        for(int i = 0; i <= c; i++){
            a = b;
            b = hasil;
            System.out.print(hasil + " ");
            hasil = a + b;
        }
    }
}