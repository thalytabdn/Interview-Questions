/**
 * Given a string containing just the characters "(", ")", "{", "}", "[" and "]", determine if the input
 * string is valid
 * 
 * An input string is valid if:
 *  1. Open brackets must be closed by the same type of brackets
 *  2. Open brackts must be closed in the correct order
 * 
 * Exemple 1:
 *  Input: "()"
 *  Output: true
 * 
 * Exemple 2: "[)"
 * Output: false
 * 
 * Exemple 2: "{([])}"
 * Output: true
 * 
 */
import java.util.Stack;

public class ValidParentheses {
    
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray()){
            if (
                Character.toString(c).equals("(") || Character.toString(c).equals("{") || Character.toString(c).equals("[")){
                stack.push(c);
            }
            else if(Character.toString(c).equals(")") && !stack.isEmpty() && stack.peek().toString().equals("(")){
                stack.pop();
            }
            else if(Character.toString(c).equals("]") && !stack.isEmpty() && stack.peek().toString().equals("[")){
                stack.pop();
            }
            else if(Character.toString(c).equals("}") && !stack.isEmpty() && stack.peek().toString().equals("{")){
                stack.pop();
            }
            else{
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[(])]}"));
    }

    


}
