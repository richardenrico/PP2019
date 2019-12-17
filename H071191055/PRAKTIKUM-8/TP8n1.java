import java.io.*;
import java.util.*;

class TP8n1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            String hehe = sc.next();
            String haha = sc.next();
            in = new FileInputStream(hehe + ".txt");
            out = new FileOutputStream(haha + ".txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        } finally {
            try {
                if (in != null) {
                    System.out.println("berhasil");
                    in.close();
                }
                if (out != null) {

                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("gagal");

            }
        }
    }
}