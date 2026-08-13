package basicDsa;

public class array7 {
    public static void main(String[] args){
        int[] name = {7, 4 , 3 , 1, 2};
        // search an element
        int search = 3;
        for(int i=0; i<name.length; i++){
            if(name[i] == search){
                System.out.println("element found at index:" + " " + i);
            }
        }
    }
    
}
