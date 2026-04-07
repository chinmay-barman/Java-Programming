class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
class DDL{
    private Node head;
    private Node tail;
    private int size;
    DDL(){
        this.size = 0;
        head = null;
        tail = null;
    }
    int size(){
        return size;
    }
    void insertAt(int index, int val) throws Exception{
        Node newNode = new Node(val);
        if(index<0 || index>size){
            throw new Exception("Invalid index");
        }
        else if(index == 0 && size == 0){
            head = newNode;
            tail = newNode;
        }
        else if(index == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else if(index == size){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        else{
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;
    }
    void insertAtHead(int val){
        Node newNode = new Node(val);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    void insertAtTail(int val){
        Node newNode = new Node(val);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    void deleteHead()throws Exception{
        if(size == 0){
            throw new Exception("List is empty");
        }
        else if(size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteTail() throws Exception{
        if(size == 0){
            throw new Exception("List is empty");
        }
        else if(size == 1){
            head = null;
            tail = null;
        }
        else{
            tail.prev.next = null;
            tail = tail.prev;
        }
        size--;
    }
    void deleteAt(int index) throws Exception{
        if(index<0 || index>=size){
            throw new Exception("Invalid index");
        }
        else if(index==0){
            deleteHead();
            return;
        }
        else if(index==size-1){
            deleteTail();
            return;
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
            size--;
        }
    }
}
public class DLLImplementation {
    public static void main(String args[]){
        DDL list = new DDL();
        list.insertAtHead(0);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(7);

        System.out.println("Size of the list: "+list.size());
        try{
            list.deleteAt(3);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Size of the list after deletion: "+list.size());
    }    
}
