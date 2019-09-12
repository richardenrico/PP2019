import java.util.Scanner;
class Bb1n4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int detik = iScanner.nextInt();
        int jam = detik / 3600;
        detik = detik % 3600;
        int menit = detik / 60;
        detik = detik % 60;
        int detik1 = detik/ 1;
        System.out.printf("%02d : %02d : %02d", jam, menit, detik1);
    }
}