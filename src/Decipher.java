import java.io.*;
public class Decipher {
    /* Generar numero de desplazamiento aleatorio:
      Random random = new Random();
      int shifting = random.nextInt(0, 31); */
    int shifting = 9;
    final String abcSymbols = "ABCDEFGHIJKLMNOPQRSTVWXYZ.,”:-!? ";
    String textToDecipher = "";

    public Decipher(String textToDecipher) {
        this.textToDecipher = textToDecipher;
    }

    public String decipher() {
        String textDeciphered = "";
        File fd = new File("fileToDecipher.txt");
        File fc = new File("fileDeciphered.txt");
        try (FileWriter fw = new FileWriter(fd);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textToDecipher);

        } catch (IOException e) {
            e.getStackTrace();
        }

        try (FileReader fr = new FileReader(fd);
             BufferedReader br = new BufferedReader(fr)) {
            String textToBeDeciphered = br.readLine();
            for (int i = 0; i < textToBeDeciphered.length(); i++) {
                int indexInAbcSymbols = abcSymbols.indexOf(textToBeDeciphered.charAt(i));
                if (indexInAbcSymbols != -1) {
                    int newIndex = (indexInAbcSymbols - shifting) % abcSymbols.length();
                    if (newIndex < 0) {
                        newIndex += abcSymbols.length();
                    }
                    textDeciphered += abcSymbols.charAt(newIndex);
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        try (FileWriter fw = new FileWriter(fc);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textDeciphered);

        } catch (IOException e) {
            e.getStackTrace();
        }

        return textDeciphered;
    }

}



