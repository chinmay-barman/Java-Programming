public class ImplementationLinkedList {
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        // list.insertAtBegin(5);
        // list.insertAtBegin(6);
        // list.insertAtBegin(0);
        // list.insertAtEnd(1);
        list.insert(0, 56);
        list.insert(1, 78);
        list.insert(0, 87);
        list.display();
        System.out.println("Size of the linked List is: " + list.size());
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head=null;
    private int size=0;
    void insert(int index, int data){
        Node newNode = new Node(data);
        if(index>size || index<0){
            throw new IndexOutOfBoundsException(
                "Index out of bound!, Please enter index between 0 to "+size
            );
        }
        else if(index==0){
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        int count=0;
        Node temp = head;
        while(count<index-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(temp == null){
            head = newNode;
            size++;
            return;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    int size(){
        return size;
    }
    int get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException(
                "Index out of bound!"
            );
        }
        Node temp = head;
        int count=0;
        while(count<index){
            temp = temp.next;
            count++;
        }
        return temp.data;
    }
}