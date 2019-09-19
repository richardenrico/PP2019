import java.util.Scanner;
class TP2n1 {
    public static void main(String[] args) {
        Scanner qScanner = new Scanner(System.in);
        String input1, input2, input3;
        input1 = qScanner.nextLine();
        input2 = qScanner.nextLine();
        input3 = qScanner.nextLine();
        if (input1.equalsIgnoreCase("vertebrado")){
            if(input2.equalsIgnoreCase("ave")){
                if(input3.equalsIgnoreCase("carnivoro")){
                    System.out.println("agula");
                }if(input3.equalsIgnoreCase("onivoro")){
                    System.out.println("pomba");
                }
            }if(input2.equalsIgnoreCase("mamifero")){
                if(input3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }if(input3.equalsIgnoreCase("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if(input1.equalsIgnoreCase("invertebrado")){
            if(input2.equalsIgnoreCase("inseto")){
                if(input3.equalsIgnoreCase("hematogafo")){
                    System.out.println("pulga");
                }if(input3.equalsIgnoreCase("herbivoro")){
                    System.out.println("lagarta");
                }
            }if(input2.equalsIgnoreCase("anelideo")){
                if(input3.equalsIgnoreCase("hematogafo")){
                    System.out.println("sanguessuga");
                }if(input3.equalsIgnoreCase("herbivoro")){
                    System.out.println("minhoca");
                }
        }
    }
}
}