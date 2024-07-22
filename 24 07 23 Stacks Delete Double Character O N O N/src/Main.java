import java.util.Scanner;
import java.util.Stack;
class RemoveConsecutivePair{
    public static String removePairs(String A){
        Stack<Character> stack = new Stack<>();

        for(char ch : A.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){stack.pop();}
            else{stack.push(ch);}
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        String result = removePairs(input);
        System.out.println("Transformed String: " + result);
    }

}