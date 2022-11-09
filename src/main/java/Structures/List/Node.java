package Structures.List;

public class Node<T> {
    public T value;
    public Node<T> next;
    public Node(T val){
        this.value = val;
        this.next = null;
    }
    public T getValue(){
        return value;
    }

    public Node<T> getNext() {return next;}
    public void setValue(T val){
        this.value = val;
    }
}
