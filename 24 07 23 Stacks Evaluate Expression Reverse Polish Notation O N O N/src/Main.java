import java.util.Scanner;
import java.util.Stack;
class EvaluateRPN{
    public static int evalRPN(String[] A){
        Stack<Integer> stack = new Stack<>();
        for(String token : A){
            switch(token){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int N = sc.nextInt();
        sc.nextLine();
        String[] expression = new String[N];

        System.out.println("Enter the elements of RPN expression: ");
        for(int i = 0; i< N; i++){
            expression[i] = sc.nextLine();
        }
        int result = evalRPN(expression);
        System.out.println("The result of the expression is : " + result);
    }

}