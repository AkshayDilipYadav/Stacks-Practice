import java.util.Stack;
import java.util.Scanner;

class BalancedParentheses{
    public static int isBalanced(String A){
        Stack<Character> stack = new Stack<>();
        for(char ch : A.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }
            else if(ch == '}' || ch == ')' || ch == ']'){
                if(stack.isEmpty()){return 0;}
                char top = stack.pop();
                if(!isMatchingPair(top, ch)){return 0;}
            }
        }
        return stack.isEmpty() ? 1:0;
    }

    private static boolean isMatchingPair(char opening, char closing){
        return (opening == '{' && closing == '}')||(opening == '(' && closing == ')')||(opening == '[' && closing == ']');
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Parenthesis sequence: ");
        String input = sc.nextLine();
        int result = isBalanced(input);
        if(result == 1){System.out.println("Balanced");}
        else{System.out.println("Unbalanced");}
    }

}