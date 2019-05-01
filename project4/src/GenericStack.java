public class GenericStack {
    private Object[] element = new Object[100];
    private int top = -1;

    boolean isEmpty(){
        return top == -1;
    }

    void push(Object element){
        this.element[++top] = element;
    }

    Object pop() {
        return this.element[top--];
    }
}