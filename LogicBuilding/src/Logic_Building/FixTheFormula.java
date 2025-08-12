package Logic_Building;
import java.util.Scanner;
public class FixTheFormula {

    public static int fixTheFormula(String input1) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder operators = new StringBuilder();

        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.append(ch);
            }
        }

        int[] nums = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            nums[i] = numbers.charAt(i) - '0';
        }

        int result = nums[0];
        for (int i = 0; i < operators.length(); i++) {
            char op = operators.charAt(i);
            int nextNum = nums[i + 1];

            switch (op) {
                case '+': result = result + nextNum; break;
                case '-': result = result - nextNum; break;
                case '*': result = result * nextNum; break;
                case '/': result = result / nextNum; break; 
            }
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the string:");
            String input = sc.nextLine();
            System.out.println(fixTheFormula(input));
        }

        sc.close();
    }
}

