package Structures.List;

public class LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private Node<T> cursor;
    private int length;
    public LinkedList(){
        length  = 0;
    }
    public void add(Node<T> node){
        if(head == null){
            head = node;
            tail = node;
            cursor = node;
        }else{
            tail.next = node;
            tail = node;
        }
        length++;
    }
    public void remove(int index){
        if(index-1 > length){
            throw new IllegalArgumentException();
        }
        if(index == 0){
            Node<T> temp = head.next;
            head = null;
            head = temp;
        }else{
            cursor = head;
            for(int i = 0; i < index-1; i++){
                cursor = cursor.next;
            }
            Node<T> temp = cursor.next.next;
            cursor.next = null;
            cursor.next = temp;
        }
        length--;
    }
}
