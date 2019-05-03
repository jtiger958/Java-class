class ParaStack<T> {
    protected T[] element = (T[])new Object[10];
    protected int top = -1;

    boolean isEmpty(){
        return top == -1;
    }

    void push(T element) throws StackFullException {
        if(this.element.length <= top + 1){
            throw new StackFullException("ParaStack");
        }
        this.element[++top] = element;
    }

    T pop() {
        if (this.isEmpty()){
            System.out.println("[!] stack is empty");
            return null;
        }
        T data = this.element[top];
        this.element[top--] = null;
        return data;
    }
}
