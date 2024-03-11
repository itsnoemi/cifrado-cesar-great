public class DecipherOption {
    String textFile;
    public DecipherOption(){

    }
    public void deciphering() {
        System.out.println("Introduce un texto para decifrar:");
        String userTextMethod = UserTextToDecipher.userTextToDecipher();
        if (!userTextMethod.isEmpty()) {
            textFile = userTextMethod.toUpperCase();
        } else {
            System.out.println("No se admite texto vacio.");
        }
        System.out.println();
        System.out.println("El texto a decifrar es:\n" + textFile);
        System.out.println();

    /*instancia de la clase Ciper en la que llamamos al metodo cipher() que escribe el string en un archivo,
    lo cifra y luego lo devuelve en pantalla y crendo otro archivo*/
        Decipher d = new Decipher(textFile);
        System.out.println("Texto decifrado:\n" + d.decipher());
    }
}
