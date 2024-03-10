public class Main {
    public static void main(String[] args) {
        String textFile;
        //Pedimos o generamos un texto
        System.out.println("Introduce un texto para cifrar o presiona ENTER para generar un texto aleatorio:");
        String userTextMethod = UserText.userText();
        String randomTextMethod = RandomText.randomText();
        if (!userTextMethod.isEmpty()) {
            textFile = userTextMethod.toUpperCase();
        } else {
            textFile = randomTextMethod.toUpperCase();
        }
        System.out.println();
        System.out.println("El texto a cifrar es:\n" + textFile);
        System.out.println();

        /*instancia de la clase Ciper en la que llamamos al metodo cipher() que escribe el string en un archivo,
        lo cifra y luego lo devuelve en pantalla y crendo otro archivo*/
        Cipher c = new Cipher(textFile);
        System.out.println("Texto cifrado:\n" + c.cipher());
    }
}
