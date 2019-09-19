import java.util.Scanner;
class TP2n2{
    public static void main(String[] args) {
        Scanner gScanner = new Scanner(System.in);
        String nama1 = gScanner.next();
        String elemen1 = gScanner.next();
        String nama2 = gScanner.next();
        String elemen2 = gScanner.next();
        if(elemen1.equalsIgnoreCase("fire")){
            if(elemen2.equalsIgnoreCase("ice") || elemen2.equalsIgnoreCase("electric")){
                System.out.println(nama1);
            }if(elemen2.equalsIgnoreCase("fire")){
                System.out.println("draw");
            }if(elemen2.equalsIgnoreCase("ground") || elemen2.equalsIgnoreCase("water")){
                System.out.println(nama2);
            }
        }else if(elemen1.equalsIgnoreCase("ground")){
            if(elemen2.equalsIgnoreCase("ice") || elemen2.equalsIgnoreCase("water")){
                System.out.println(nama2);
            }if(elemen2.equalsIgnoreCase("electric") || elemen2.equalsIgnoreCase("fire")){
                System.out.println(nama1);
            }if(elemen2.equalsIgnoreCase("ground")){
                System.out.println("draw");
            }
        }else if(elemen1.equalsIgnoreCase("water")){
            if(elemen2.equalsIgnoreCase("fire") || elemen2.equalsIgnoreCase("ground")){
                System.out.println(nama1);
            }if(elemen2.equalsIgnoreCase("electric") || elemen2.equalsIgnoreCase("ice")){
                System.out.println(nama2);
            }if(elemen2.equalsIgnoreCase("water")){
                System.out.println("draw");
            }
        }else if(elemen1.equalsIgnoreCase("ice")){
            if(elemen2.equalsIgnoreCase("ground") || elemen2.equalsIgnoreCase("water")){
                System.out.println(nama1);
            }if(elemen2.equalsIgnoreCase("electric") || elemen2.equalsIgnoreCase("fire")){
                System.out.println(nama2);
            }if(elemen2.equalsIgnoreCase("ice")){
                System.out.println("draw");
            }
        }else if(elemen1.equalsIgnoreCase("electric")){
            if(elemen2.equalsIgnoreCase("water") || elemen2.equalsIgnoreCase("ice")){
                System.out.println(nama1);
            }if(elemen2.equalsIgnoreCase("ground") || elemen2.equalsIgnoreCase("fire")){
                System.out.println(nama2);
            }if(elemen2.equalsIgnoreCase("electric")){
                System.out.println("draw");
            }
        } 
    }
}