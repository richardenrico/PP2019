import java.util.Scanner;
class TP3n2{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();
        int y = iScanner.nextInt();
        int nomor = 0;
        int barisan = y/x;
        for(int i = 1; i <= y; i++){
            if(i % 4 == 1){
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}