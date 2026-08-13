package linklist;

public class middleNode{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
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
        if(head==null){
            System.out.print("empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void middle(){

        if(head == null){
            System.out.println("empty");
            return;
        }

        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node = " + slow.data);

    }
    public static void main(String[] args){
        middleNode list = new middleNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("before");
        list.display();
        System.out.println("Middle node");
        list.middle();
        list.display();

    }
}