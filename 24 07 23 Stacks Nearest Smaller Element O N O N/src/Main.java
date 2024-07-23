import java.util.Scanner;
import java.util.Stack;

class NearestSmallerElement{
    public static int[] findNearestSmallerElements(int[] A){
        int n = A.length;
        int[] G = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && stack.peek() >= A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                G[i] = -1;
            }
            else{
                G[i] = stack.peek();
            }
            stack.push(A[i]);
        }
        return G;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int[] result = findNearestSmallerElements(A);
        System.out.println("The nearest smaller elements are: ");
        for(int elem : result){
            System.out.print(elem + " ");
        }
    }
}
