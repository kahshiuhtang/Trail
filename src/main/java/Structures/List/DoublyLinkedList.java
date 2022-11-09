package Structures.List;

public class DoublyLinkedList<T> implements List<DoublyLinkedNode<T>, DoublyLinkedNode<T>>{
    private DoublyLinkedNode<T> head;
    private DoublyLinkedNode<T> tail;
    private DoublyLinkedNode<T> cursor;

    private int length;
    public DoublyLinkedList(){
        length = 0;
    }
    public void add(DoublyLinkedNode<T> node){
        if(head == null){
            head = node;
            tail = node;
            cursor = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    @Override
    public DoublyLinkedNode<T> get(int index) {
        return head;
    }

    @Override
    public void remove(int index) {
        if(index > length){
            throw new IllegalArgumentException();
        }
        if(index == 0) {
            DoublyLinkedNode<T> temp = head.next;
            head.next = null;
            head = temp;
        }
        cursor = head;
        for(int i = 0; i < index; i++)
            cursor = cursor.next;
    }

}
