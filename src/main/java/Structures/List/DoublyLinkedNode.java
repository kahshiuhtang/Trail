package Structures.List;

public class DoublyLinkedNode<T> {
    public T value;
    public DoublyLinkedNode<T> next;
    public DoublyLinkedNode<T> prev;
    public DoublyLinkedNode(T val){
        this.value = val;
        this.next = null;
    }
    public T getValue(){
        return value;
    }

    public DoublyLinkedNode<T> getNext() {return next;}
    public DoublyLinkedNode<T> getPrev() {return prev;}
    public void setValue(T val){
        this.value = val;
    }
}
