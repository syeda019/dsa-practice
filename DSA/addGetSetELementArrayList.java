package DSA;
import java.util.ArrayList;
import java.util.Collections;


public class addGetSetELementArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // get method 
        int element = list.get(1);
        System.out.println(element);

        // add element between
        list.add(1,2);
        System.out.println(list);

        // set method
        list.set(1,5);
        System.out.println(list);

        // remove method
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        //with loops print all elements
        for(int i=0; i<list.size(); i++){
            System.out.println("elements:" + " " + list.get(i));
        }
        // sorting the arraylist
        Collections.sort(list);
        System.out.println(list);



    }
    
}
