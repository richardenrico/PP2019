import java.util.Scanner;
class TP3n1{
    public static void main(String[] args) {
        Scanner aScan = new Scanner(System.in);
        int x = aScan.nextInt();
        int y = aScan.nextInt();
        if(x < y){
            for(int awal = x; awal <= y; awal++){
                if(awal % 2 == 0 && awal < 0){
                    System.out.println(awal + " Genap Negatif");
                }else if(awal % 2 == 0 && awal > 0){
                    System.out.println(awal + " Genap Positif");
                }else if(awal % 2 == -1 && awal < 0){
                    System.out.println(awal + " Ganjil Negatif");
                }else if(awal % 2 == 1 && awal > 0){
                    System.out.println(awal + " Ganjil Positif");
                }else if(awal == 0){
                    System.out.println(awal + " Nol");
                }
            }
        }else if(x > y){
            for(int awal = y; awal <= x; awal++){
                if(awal % 2 != 0 && awal < 0){
                    System.out.println(awal + " Ganjil Negatif");
                }
                else if(awal % 2 == 0 && awal < 0){
                    System.out.println(awal + " Genap Negatif");
                }
                if(awal % 2 == 0 && awal > 0){
                    System.out.println(awal + " Genap Positif");
                }
                else if(awal % 2 == 1 && awal > 0){
                    System.out.println(awal + " Ganjil Positif");
                }
                if(awal == 0){
                    System.out.println(awal + " Nol");
                }
            }
        }
    }
}