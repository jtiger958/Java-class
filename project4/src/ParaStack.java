class ParaStack<T> {
    protected T[] element = (T[])new Object[10];
    private int top = -1;

    boolean isFull(){
        return top == element.length-1;
    }
    boolean isEmpty(){
        return top == -1;
    }

    void push(T element){
        this.element[++top] = element;
    }

    T pop() {
        T data = this.element[top];
        this.element[top--] = null;
        return data;
    }
}
