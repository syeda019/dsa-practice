package linklist;

public class DetectCycle {
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

    //find detect cycle
    public void cycle(){
        Node slow = head;
        Node fast = head;

        if(head == null){
            System.out.println("empty:");
            return;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                System.out.println("cycle detect");
                return;
            }
        }
        System.out.println("No cycle");
    }
    
    // find cycle
    public void createCycle() {

        if (head == null || head.next == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Last node ko second node se connect
        temp.next = head.next;
    }
    public static void main(String[] args){
        DetectCycle list = new DetectCycle();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();

         System.out.println("Checking before cycle:");
        list.cycle();

        // Cycle create karo
        list.createCycle();

        System.out.println("Checking after cycle:");
        list.cycle();
    }     
}
