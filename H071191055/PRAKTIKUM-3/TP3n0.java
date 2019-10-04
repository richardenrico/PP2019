import java.util.Scanner;
class TP3n0{
    public static void main(String[] args) {
        Scanner jScanner = new Scanner(System.in);
        int n = jScanner.nextInt();
        for(int i = 2; i*i <= n; i++){
            if(n % 2 == 0){
                System.out.println(n + " bukan bilangan prima");
                return;
            }
        }
        System.out.println(n + " bilangan prima");
    }
}