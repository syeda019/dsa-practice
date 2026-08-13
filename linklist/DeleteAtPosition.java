package linklist;
public class DeleteAtPosition{
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
            System.out.println("empty:");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void delete(int position){
        
        if(head == null){
            System.out.println("empty:");
            return;
        }
       
        if(position == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        
    }
    public static void main(String[] args){
        DeleteAtPosition list = new DeleteAtPosition();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before:");
        list.display();
        System.out.println("After:");
        list.display();


    }
}