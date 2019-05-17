package aiel.friendlist.DataUtil;

import java.util.ArrayList;

class ObjectList<T> {
    private int numElement = 0;
    private ArrayList<T> element = new ArrayList<>();

    ObjectList() {
    }

    int numElement() {
        return element.size();
    }

    T getElement(int i) {
        return element.get(i);
    }

    void setElement(T object){
        element.add(object);
    }

    void deleteElement(T object) {
        element.remove(object);
    }

    void modifyElement(T srcObject, T desObject){
        int index = element.indexOf(srcObject);
        element.remove(index);
        element.add(index, desObject);
    }
}