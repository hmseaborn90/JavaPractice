package challenges;
import java.util .*;
public class BalanceStack {


        public static void main(String[] argh) {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input = sc.next();
                boolean isBalanced = balance(input);
                System.out.println(isBalanced);

            }


        }

        public static boolean balance(String input) {

            Map<Character, Character> chars = new HashMap<>();
            chars.put('(', ')');
            chars.put('{', '}');
            chars.put('[', ']');

            Stack<Character> balanceStack = new Stack<>();

            for (char ch : input.toCharArray()) {

                if (chars.containsKey(ch)) {
                    balanceStack.push(ch);
                } else if (chars.containsValue(ch)) {

                    if (!balanceStack.isEmpty() && chars.get(balanceStack.peek()) == ch)
                        balanceStack.pop();

                } else {
                    return false;
                }

            }
            return balanceStack.isEmpty();
        }
    }



