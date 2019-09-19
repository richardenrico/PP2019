// Quadran
import java.util.Scanner;
class TL2n1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x<0 && y>0 && Math.abs(x) > y){
            System.out.println("Koordinat berada pada Quadran 1");
        }else if(x == 0 && y == 0){
            System.out.println("Berada pada titik pusat");
        }else if(x < 0 && y > 0 && Math.abs(x) < y ){
            System.out.println("Koordinat berada pada Quadran 2");
        }else if(x < 0 && y > 0 && Math.abs(x) == y){
            System.out.println("Berada pada Garis Quadran 1 dan 2");
        }else if(x > 0 && y > 0 && x > y){
            System.out.println("Koordinat berada pada Quadran 3");
        }else if(x > 0 && y > 0 && x < y){
            System.out.println("Koordinat berada pada Quadran 4");
        }else if(x > 0 && y > 0 && x == y){
            System.out.println("Berada pada Garis Kuadran 3 dan 4");
        }else if(x > 0 && y < 0 && Math.abs(y) < x){
            System.out.println("Koordinat berada pada Kuadran 5");
        }else if(x > 0 && y < 0 && Math.abs(y) > x){
            System.out.println("Koordinar berada pada Kuadran 6");
        }else if(x > 0 && y < 0 && Math.abs(y) == x ){
            System.out.println("Berada pada garis Kuadran 5 dan 6");
        }else if(x < 0 && y < 0 && Math.abs(x) < Math.abs(y)){
            System.out.println("Koordinat berada pada Kuadran 7");
        }else if(x < 0 && y < 0 && Math.abs(y) < Math.abs(x)){
            System.out.println("Koordinat berada pada Kuadran 8");
        }else if(x < 0 && y < 0 && y == x){
            System.out.println("Berada pada garis Kuadran 7 dan 8");
        }else if(x < 0 && y == 0 && Math.abs(x) > y){
            System.out.println("Berada pada garis -x");
        }else if(x > 0 && y == 0 && Math.abs(x) > y){
            System.out.println("Berada pada garis x");
        }else if(x == 0 && y < 0 && Math.abs(y) > x){
            System.out.println("Berada pada garis -y");
        }else if(x == 0 && y > 0 && Math.abs(y) > x){
            System.out.println("Berada pada garis y");
        }
    }
}