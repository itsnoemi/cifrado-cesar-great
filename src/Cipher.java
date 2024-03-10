import java.io.*;
import java.util.Random;

public class Cipher {
    /* Generar numero de desplazamiento aleatorio:
    Random random = new Random();
    int shifting = random.nextInt(0, 31); */
    int shifting = 9;
    final String abcSymbols = "ABCDEFGHIJKLMNOPQRSTVWXYZ.,”:-!? ";
    String textToCipher = "";

    public Cipher(String textToCipher) {
        this.textToCipher = textToCipher;
    }

    public String cipher() {
        String textCiphered = "";
        File fd = new File("fileToCipher.txt");
        File fc = new File("fileCiphered.txt");
        try (FileWriter fw = new FileWriter(fd);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textToCipher);

        } catch (IOException e) {
            e.getStackTrace();
        }

        try (FileReader fr = new FileReader(fd);
             BufferedReader br = new BufferedReader(fr)) {
            String textToBeCiphered = br.readLine();
            for (int i = 0; i < textToBeCiphered.length(); i++) {
                for (int j = 0; j < abcSymbols.length(); j++) {
                    if (textToBeCiphered.charAt(i) == abcSymbols.charAt(j)) {
                        if (j + shifting >= abcSymbols.length()) {
                            textCiphered += abcSymbols.charAt((j + shifting) % abcSymbols.length());
                        } else {
                            textCiphered += abcSymbols.charAt(j + shifting);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        try (FileWriter fw = new FileWriter(fc);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textCiphered);

        } catch (IOException e) {
            e.getStackTrace();
        }

        return textCiphered;
    }

    public void getCipheredFile(String textCiphered) {
        String cipheredText;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Ciphered-text.txt"))) {
            bw.write(textCiphered);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
