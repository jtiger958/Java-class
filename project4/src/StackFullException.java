class StackFullException extends Exception {
    StackFullException(){
        super("Stack is full");
    }
    StackFullException(String type){
        super(type + " is full");
    }
}
