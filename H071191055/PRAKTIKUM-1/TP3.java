import java.util.Scanner;
class Bb1n5 {
    public static void main(String[] args) {
        Scanner uScanner = new Scanner(System.in);
        int h = uScanner.nextInt();
        int a = uScanner.nextInt();
        int b = uScanner.nextInt();
        double jarak1 = Math.tan(Math.toRadians(a))*h;
        double jarak2 = Math.tan(Math.toRadians(b))*h;
        double jarak = jarak1 - jarak2;
        System.out.printf("Panjang Kapal : %.1f m\n", jarak);
    }
}