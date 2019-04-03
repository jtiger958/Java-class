public class ObjectList<T> {
    protected int numElement = 0;
    protected T[] elements;

    public ObjectList(int maxElement) {
        this.elements = (T[]) new Object[maxElement];
    }

    protected int numElement() {
        return numElement;
    }

    protected T getElement(int i) {
        return elements[i];
    }
    protected void setElement(int num, Object object){
        elements[num] = (T) object;
        numElement++;
    }
}
