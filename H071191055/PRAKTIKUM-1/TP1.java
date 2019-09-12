import java.util.Scanner;
class Bb1n3{
    public static void main(String[] args) {
        Scanner oScanner = new Scanner(System.in);
        double waktu, kecepatan;
        waktu = oScanner.nextInt();
        kecepatan = oScanner.nextInt();
        double jumlah = kecepatan * waktu / 14;
        System.out.printf("Bensin Yang Digunakan : %.3f L\n", jumlah );
    }
} 