class GenericStack {
    private Object[] element = new Object[10];
    private int top = -1;

    boolean isEmpty(){
        return top == -1;
    }

    void push(Object element) throws StackFullException {
        if (this.element.length <= top + 1){
            throw new StackFullException("GenericStack");
        }
        this.element[++top] = element;
    }

    Object pop() {
        if (this.isEmpty()){
            System.out.println("[!] stack is empty");
            return null;
        }
        Object data = this.element[top];
        this.element[top--] = null;
        return data;
    }
}
