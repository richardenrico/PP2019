import java.util.Scanner;
class TP3n4{
    public static void main(String[] args) {
        Scanner hScanner = new Scanner(System.in);
        int uang1 = hScanner.nextInt();
        int uang2 = hScanner.nextInt();
        int uangsisa = uang2 - uang1;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0; 
        for(int i = 1; i <= 7; i++){
            if(uangsisa - 100000 >= 0){
                uangsisa-=100000;
                a++;
            }else if(uangsisa - 50000 >= 0){
                uangsisa-=50000;
                b++;
            }else if(uangsisa - 20000 >= 0){
                uangsisa-=20000;
                c++;
            }else if(uangsisa - 10000 >= 0){
                uangsisa-=10000;
                d++;
            }else if(uangsisa - 5000 >= 0){
                uangsisa-=5000;
                e++;
            }else if(uangsisa - 2000 >= 0){
                uangsisa-=2000;
                f++;
            }else if(uangsisa - 1000 >= 0){
                uangsisa-=1000;
                g++;
            }
        }System.out.println(a + " Rp 100.000");
        System.out.println(b + " Rp 50.000");
        System.out.println(c + " Rp 20.000");
        System.out.println(d + " Rp 10.000");
        System.out.println(e + " Rp 5.000");
        System.out.println(f + " Rp 2.000");
        System.out.println(g + " Rp 1.000");
    }
}