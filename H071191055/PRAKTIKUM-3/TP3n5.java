import java.util.Scanner;
class TP3n5{
    public static void main(String[] args) {
        Scanner oScanner = new Scanner(System.in);
        int menit = 0, detik = 0, jam = 0;
        while(oScanner.hasNextFloat()){
            float derajat = oScanner.nextFloat();
            if(derajat >= 0 && derajat < 360){
                float x = derajat*240;
                int a = (int)x;
                jam = (a/3600) + 6;
                if(jam > 23){
                    jam = jam - 24;
                }else{
                    jam = jam + 0;
                }menit = (a%3600)/60;
                detik = (a%3600)%60;
                System.out.println("");
                if(a >= 0 && a < 14400){
                    System.out.println("Selamat Pagi");
                }else if(a >= 14400 && a < 32400){
                    System.out.println("Selamat Siang");
                }else if(a >= 32400 && a < 45000){
                    System.out.println("Selamat Sore");
                }else if(a >= 45000 && a < 79200){
                    System.out.println("Selamat Malam");
                }else{
                    System.out.println("Selamat Pagi");
                }
            }else{
                System.out.println("Tidak Valid");
            }System.out.printf("%02d : %02d : %02d \n", jam, menit, detik);
        }        
    }
}