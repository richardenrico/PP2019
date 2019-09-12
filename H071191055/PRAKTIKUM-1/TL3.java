import java.util.Scanner;
class TL3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("apakah "+a+" dan "+b+" merupakan kelipatan ?"+(b%a == 0 || a%b == 0));
    }
}