package linklist;
// singly doubly update and search, findmiddle value,  is same
public class Doublylinklist {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
           this.data = data;
           this.prev = null;
           this.next = null;
        }
    }
    Node head;
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;

            if(head != null){
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=0; i<position -1; i++){
            temp= temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        newNode.next.prev = newNode;
        temp.next = newNode;
    }
    // delete from first
    public void deletefirst(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }
    }
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.prev.next = null;
    }
    public void deleteByValue(int value){
        if(head == null){
            System.out.println("empty");
            return;
        }
        if(head.data == value){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            return;
        }
        Node curr = head;
        Node prev = null;
        // finding value
        while(curr != null && curr.data != value){
            prev = curr;
            curr = curr.next;
        }
    // value not found
       if(curr == null){
            System.out.println("not found");
            return ;
        }
        //Delete node
        prev.next = curr.next;
        
        if(curr.next != null){
           curr.next.prev = prev;
        }
        //curr 30 hai aur:
        //Isliye curr.next 40 hai, null nahi.

        //Matlab curr last node nahi hai, isliye andar wali line execute hogi.
        // curr.next = 40 ha aur prev = 20
        // so curr.next.prev = prev
        //    40.prev = 20
        //20 ⇄ 30 ⇄ 40   30 delete ho ga 
        // 20 ⇄ 40
    }
    public void deletebyPosition(int position){
        if(head == null){
            System.out.println("empty");
            return;
        }
        // First node delete
        if (position == 1) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }
        Node curr = head;
        int count = 1;
        while(curr != null && count < position){
            curr = curr.next;
            count++;
        }
         // Position not found
        if (curr == null) {
            System.out.println("invalid position");
            return;
        }

    // Delete node
        curr.prev.next = curr.next;

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
    }
    public void search(int key){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                System.out.println(key + "found");
                return;
            }
            temp = temp.next;
        }
        System.out.println(key + "not found");
    }
    public void reverse(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node current = head;
        Node previous = null;

        while(current != null){

           Node temp = current.next;

           current.next = current.prev;
           current.prev = temp;

           previous = current;
           current = temp;
        }

        head = previous;
    }
    // update
    public void update(int value , int newValue){
        if(head == null){
            System.out.println("empty");
            return;  
        }
        Node curr = head;
        while(curr != null){
            if(curr.data == value){
                curr.data = newValue;
                System.out.println("update successfully");
                return;
            }
            curr = curr.next;
        }
        System.out.println("value not update");

    }
    public void Findmiddle(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle =" + slow.data);
    }
    public void insertAtmiddle(int data){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = new Node(data);
        newNode.next = slow;
        newNode.prev = slow.prev;
        if(slow.prev != null){
            slow.prev.next = newNode;
        }
        else{
            head = newNode;
        }
        slow.prev = newNode;
    }
    public void display(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Doublylinklist list = new Doublylinklist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();

        list.addfirst(5);
        System.out.println("add at first");
        list.display();
        list.insertAtPosition(25, 3);
        System.out.println("insert at a position");
        list.display();

        list.deletefirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteByValue(30);
        list.display();
    }
    
}
