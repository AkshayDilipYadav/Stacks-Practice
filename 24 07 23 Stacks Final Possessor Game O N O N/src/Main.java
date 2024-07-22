import java.util.Scanner;
import java.util.Stack;
class FootballPasses{
    public static int findFinalPossessor(int A, int B, int[] C){
        Stack<Integer> stack = new Stack<>();
        stack.push(B);
        for(int pass : C){
            if(pass == 0){
                if(!stack.isEmpty()){stack.pop();}
            }
            else{stack.push(pass);}
        }
        return stack.isEmpty() ? -1: stack.peek();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of passes (A): ");
        int A = sc.nextInt();
        System.out.println("Enter the ID of the initial possessor: ");
        int B = sc.nextInt();
        int[] C = new int[A];
        System.out.println("Enter the passes: ");
        for(int i = 0 ; i< A; i++){
            C[i] = sc.nextInt();
        }
        int finalPossessor = findFinalPossessor(A, B, C);
        System.out.println("Result: "+ finalPossessor);
    }
}