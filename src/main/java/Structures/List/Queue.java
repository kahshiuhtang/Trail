package Structures.List;

public class Queue<T>{
    DoublyLinkedList<T> queue;
    public Queue(){
        queue = new DoublyLinkedList<T>();
    }
    public void push(DoublyLinkedNode<T> node) {
        queue.add(node);
    }
    public void push(T val){
        queue.add(new DoublyLinkedNode<T>(val));
    }
    public T peek(){
        return queue.get(0).getValue();
    }
    public T pop(){
        T val = queue.get(0).getValue();
        queue.remove(0);
        return val;
    }

}
