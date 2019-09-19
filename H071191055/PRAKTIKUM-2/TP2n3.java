import java.util.InputMismatchException;
import java.util.Scanner;
class TP2n3{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        try {
        int a, b, c, d, e;
        a = iScanner.nextInt(); 
        b = iScanner.nextInt(); 
        c = iScanner.nextInt(); 
        d = iScanner.nextInt(); 
        e = iScanner.nextInt();
        int gen = (a % 2 == 0 ? 1 : 0) + (b % 2 == 0 ? 1 : 0) + (c % 2 == 0 ? 1 : 0) + (d % 2 == 0 ? 1 : 0) + (e % 2 == 0 ? 1 : 0);
        int gan = (a % 2 == 1 ? 1 : 0) + (b % 2 == 1 ? 1 : 0) + (c % 2 == 1 ? 1 : 0) + (d % 2 == 1 ? 1 : 0) + (e % 2 == 1 ? 1 : 0);
        int pos = (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) + (d > 0 ? 1 : 0) + (e > 0 ? 1 : 0);
        int neg = (a < 0 ? 1 : 0) + (b < 0 ? 1 : 0) + (c < 0 ? 1 : 0) + (d < 0 ? 1 : 0) + (e < 0 ? 1 : 0);
        System.out.println("Angka Genap : "+gen);
        System.out.println("Angka Ganjil : "+gan);
        System.out.println("Angka Positif : "+pos);
        System.out.println("Angka Negatif : "+neg);
        } catch (InputMismatchException ime){
            System.out.println("Input Tidak Valid");
        }
    }
}