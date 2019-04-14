class ObjectList<T> {
    private int numElement = 0;
    private T[] elements;

    ObjectList(int maxElement) {
        this.elements = (T[]) new Object[maxElement];
    }

    int numElement() {
        return numElement;
    }

    T getElement(int i) {
        return elements[i];
    }
    void setElement(int num, Object object){
        elements[num] = (T) object;
        numElement++;
    }
}
