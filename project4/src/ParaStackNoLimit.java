class ParaStackNoLimit<T> extends ParaStack<T> {
    @Override
    void push(T element){
        if(this.element.length <= top + 1){
            T[] newArray = (T[])new Object[super.element.length*2];
            System.arraycopy(this.element, 0, newArray, 0, this.element.length);
            this.element = newArray;
        }
        super.push(element);
    }
}
