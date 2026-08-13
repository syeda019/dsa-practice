package linklist;

public class nthNodetoEnd{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // find nth node to end 
    public void nthEnd(){
        Node slow = head;
        Node fast = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        // fast ko 2 steps aage karo
        for (int i = 0; i < 2; i++) {
            fast = fast.next;
        }
        // dono ko ek-ek step move karo
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("2nd node from end:" + slow.data);
    }

    public static void main(String[] args){
        nthNodetoEnd list = new nthNodetoEnd();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("before");
        list.display();
        
        list.nthEnd();


    }
}