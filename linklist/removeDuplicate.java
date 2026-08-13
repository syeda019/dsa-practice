package linklist;

public class removeDuplicate{
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
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("empty list");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void remove(){
        Node current = head;
        if(head == null){
            System.out.print("empty");
            return;
        }
        while(current != null){
            Node temp = current;
        
            while(temp.next != null){
                if(temp.next.data == current.data){
                // duplicate found
                    temp.next = temp.next.next;
                }
               else{
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }
    public static void main(String[] args){
        removeDuplicate list = new removeDuplicate();
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(20);
        list.add(10);

        System.out.println("before:");
        list.display();
        list.remove();
        System.out.println("after");
        list.display();

    }
}