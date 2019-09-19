import java.util.Scanner;
class TL2n2b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam1 = sc.nextInt();
        int menit1 = sc.nextInt();
        int jam2 = sc.nextInt();
        int menit2 = sc.nextInt();
        int durasiJam = 0;
        int durasiMenit = 0;
        if ( jam1 > jam2) {
            if (menit1 > menit2) {
                durasiJam = 23 - (jam1 - jam2);
                durasiMenit = 60 - (menit1 - menit2); 
            }
            else if (menit2 > menit1){
                durasiJam = 24 - (jam1 - jam2);
                durasiMenit = menit2-menit1;
            }
            else {
                durasiJam = 24 - (jam1 - jam2);
                durasiMenit = menit1-menit2;
            }
        }
        else if (jam1 < jam2) {
            if (menit1 > menit2) {
                durasiJam = jam2 - (jam1+1);
                durasiMenit = 60 - (menit1 - menit2);
            }
            else if (menit2 > menit1){
                durasiJam = jam2 - jam1;
                durasiMenit = menit2-menit1;
            }
            else {
                durasiJam = jam2 - jam1;
                durasiMenit = menit1-menit2;
            }
        }
        else if (jam1 == jam2){
            if(menit1 > menit2){
                durasiJam = 23;
                durasiMenit = 60 - (menit1 - menit2);
            }
            else if (menit2 > menit1){
                durasiJam = 24;
                durasiMenit = menit2-menit1;
            }
            else {
                durasiJam = 24;
                durasiMenit = menit1-menit2;
            }
        }
        System.out.printf("%02d:%02d\n" , durasiJam,durasiMenit);


    }
}