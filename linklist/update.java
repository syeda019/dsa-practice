package linklist;

public class update{
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
            System.out.println("empty");
            return;
        }
        
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void updatelist(int value, int newValue){
        Node curr = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
    
        
        while(curr != null ){
            if(curr.data == value){
                curr.data = newValue;
                System.out.println("value update successfully:");
                return;
            }
            curr = curr.next;
        }
        System.out.print("value Not update:");
        
    }
    public static void main(String[] args){
        update list = new update();
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.print("before:  ");
        list.display();

        System.out.print("After: ");
        list.updatelist(30, 300);
        list.display();

    }

}