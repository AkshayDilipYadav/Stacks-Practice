import java.util.Scanner;
import java.util.Stack;
class LargestRectangleInHistogram{
    public static int largestRectangleArea(int[] A){
        int n = A.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                int height = A[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);

            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int height = A[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements : ");
        for(int i =0; i< n; i++){
            A[i] = sc.nextInt();
        }
        int result = largestRectangleArea(A);
        System.out.println("The area of the largest rectangle: " + result);
    }

}