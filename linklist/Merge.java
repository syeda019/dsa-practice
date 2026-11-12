package linklist;

public class Merge {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public boolean isEmpty(){
        return head == null;
    }
    
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
        // Merge second Linked List into first Linked List
    public void merge(Merge list2) {

        // Agar first list empty hai
        if (head == null) {
            head = list2.head;
            return;
        }

        // First list ke last node tak jana
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        // First list ke last node ko second list ke head se connect karna
        current.next = list2.head;
    }


    public void display(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args){
        Merge list1 = new Merge();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("first list");
        list1.display();

        Merge list2 = new Merge();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        System.out.println("second list");
        list2.display();

        list1.merge(list2);
        System.out.println("After merge");
        list1.display();




    }
    
}
