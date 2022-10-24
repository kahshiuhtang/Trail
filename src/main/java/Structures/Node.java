package Structures;

public class Node<T> {
    T value;
    public Node(T val){
        this.value = val;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T val){
        this.value = val;
    }
}
