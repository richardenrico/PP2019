// soal 2
import java.util.Scanner;
class TL4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahUang = sc.nextInt();
        int seratus = jumlahUang/100000;
        System.out.println("Jumlah Uang Rp 100.000 = "+seratus);
        jumlahUang = jumlahUang % 100000;
        int limpu = jumlahUang/50000;
        System.out.println("Jumlah Uang Rp 50.000 = "+limpu);
        jumlahUang = jumlahUang % 50000;
        int dupu = jumlahUang/20000;
        System.out.println("Jumlah Uang Rp 20.000 = "+dupu);
        jumlahUang = jumlahUang%20000;
        int sepu = jumlahUang/10000;
        System.out.println("Jumlah Uang Rp 10.000 = "+ sepu);
        jumlahUang = jumlahUang%10000;
        int goceng = jumlahUang/5000;
        System.out.println("Jumlah Uang Rp 5.000 = "+goceng);
        jumlahUang = jumlahUang%5000;
        int parkir = jumlahUang/2000;
        System.out.println("Jumlah Uang Rp 2.000 = "+parkir);
        jumlahUang = jumlahUang%2000;
        int serbu = jumlahUang/1000;
        System.out.println("Jumlah Uang Rp 1.000 = "+serbu);
    }
} 