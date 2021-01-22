import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<S> {
    private LinkedList<S> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    public void push(S element) {
        stack.addFirst(element);
    }
    public S pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}