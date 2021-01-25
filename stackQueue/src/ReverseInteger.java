import java.util.Arrays;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        int[] arr = new int[5];
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack Original: " + stack);
        for (int i = 0; i< arr.length;i++){
            arr[i] = stack.pop();
        }
        System.out.println("Stack to Array: " + Arrays.toString(arr));
        Stack <String> wsStack = new Stack();
        String mWord = "Step on no pets";
        for(int i = 0; i< mWord.length();i++){
            wsStack.push(String.valueOf(mWord.charAt(i)));
        }
        System.out.printf(mWord + "\n");
        StringBuilder outPut = new StringBuilder();
        for(int j = 0; j<mWord.length();j++){
            outPut.append(wsStack.pop());
        }
        System.out.printf(outPut.toString());
    }
}
