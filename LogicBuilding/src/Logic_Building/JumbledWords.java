package Logic_Building;
import java.util.Scanner;
public class JumbledWords {

    public static String jumbleWord(String word, int method) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < word.length(); i += 2) {
            odd.append(word.charAt(i));
        }

        if (method == 1) {
            for (int i = word.length() - 1; i >= 0; i--) {
                if (i % 2 == 1) { // even-position in normal terms
                    even.append(word.charAt(i));
                }
            }
        } else if (method == 2) {
            for (int i = 1; i < word.length(); i += 2) {
                even.append(word.charAt(i));
            }
        }

        return odd.append(even).toString();
    }

    public static String JumbledWords(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(jumbleWord(words[i], input2));
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        String sentence1 = s.nextLine();
        int method=s.nextInt();
        System.out.println(JumbledWords(sentence1, method)); 
        s.close();
    }
}

