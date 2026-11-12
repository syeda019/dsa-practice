package linklist;
// circular linklist
// insert at middle
public class circularInsertMiddle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;

        }
        newNode.next = head;
        head = newNode;
        temp.next=head;
    }
    public void insertMiddle(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node slow = head;
        Node fast = head;
        // find middle node
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        // insert after middle
        newNode.next = slow.next;
        slow.next = newNode;
    }
    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp != head);
        System.out.println("head");

    }
    public static void main(String[] args){
        circularInsertMiddle list = new circularInsertMiddle();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.display();
        list.insertMiddle(25);
        list.display();

    }
    
}
