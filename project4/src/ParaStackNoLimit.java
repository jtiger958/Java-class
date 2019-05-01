class ParaStackNoLimit<T> extends ParaStack<T> {
    @Override
    void push(T element){
        if(isFull()){
            T[] newArray = (T[])new Object[super.element.length*2];
            System.arraycopy(super.element, 0, newArray, 0, super.element.length);
            super.element = newArray;
        }
        super.push(element);
    }
}
