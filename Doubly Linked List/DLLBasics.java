import structures.Node;
public class DLLBasics {
    public static void displayDLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayDLLFromHead(Node head){
        Node temp = head;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        displayDLL(temp);
    }
    public static void displayDLLReverse(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();

    }

    public static void main(String args[]){
        Node head = new Node(1);
        Node secNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        head.next = secNode;
        secNode.prev = head;
        secNode.next = thirdNode;
        thirdNode.prev = secNode;
        thirdNode.next = fourthNode;
        fourthNode.prev = thirdNode;
        displayDLL(secNode);
        displayDLLFromHead(thirdNode);
        displayDLLReverse(head);
    }
}