public class ParaStack<T> {
    Object[] element = new Object[100];
    private int top = -1;

    boolean isEmpty(){
        return top == -1;
    }

    void push(T element){
        this.element[++top] = element;
    }

    Object pop() {
        return this.element[top--];
    }
}
