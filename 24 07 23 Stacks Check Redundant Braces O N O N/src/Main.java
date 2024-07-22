import java.util.Scanner;
import java.util.Stack;

class RedundantBraces{
    public static int checkRedundantBraces(String A){
        Stack<Character> stack = new Stack<>();
        for(char ch : A.toCharArray()){
            if(ch == ')'){
                char top = stack.pop();
                boolean hasOperator = false;
                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' || top == '/'){hasOperator = true;}
                    top = stack.pop();
                }
                if(!hasOperator){return 1;}
            }
            else{stack.push(ch);}
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression : ");
        String expression = sc.nextLine();
        int result = checkRedundantBraces(expression);
        if(result == 1){System.out.println("The expression has redundant braces.");}
        else{System.out.println("The expression does not have redundant braces.");}
    }

}