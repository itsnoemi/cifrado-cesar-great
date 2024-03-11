import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 0 para opcion de cifrado o 1 para decifrado: ");
        int option = Integer.parseInt(s.nextLine());

        if (option==0){
            CipherOption co = new CipherOption();
            co.ciphering();
        } else if(option==1){
            DecipherOption decipherOption = new DecipherOption();
            decipherOption.deciphering();
        } else {
            System.out.println("Opcion invalida");
        }
        s.close();
    }
}
