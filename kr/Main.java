import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String inputText = readTextFromFile("input1.txt");

        String knownWords = readTextFromFile("input2.txt");

        String decryptedText = decrypt(inputText, knownWords);

        writeTextToFile("output.txt", decryptedText);


    }

    public static String readTextFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
    public static void writeTextToFile(String fileName, String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String cases(String decrypted){
        decrypted="";
        return decrypted;
    }
    public static String decrypt(String inputText, String knownWords) {
        String dec = "";
        inputText = inputText.toLowerCase();
        knownWords = knownWords.toLowerCase();
        String[] knownWordArray = knownWords.split("\\s+");
        for(int shift = 1; shift <= 25; shift++){
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < inputText.length(); i++) {
                char c = inputText.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                }
                sb.append(c);
            }
            boolean foundAllWords = true;
            for (String word : knownWordArray) {
                if (!sb.toString().contains(word)) {
                    foundAllWords = false;
                    break;
                }
            }
            if (foundAllWords) {
                return sb.toString();
            }


        }
        return inputText;
    }


}
