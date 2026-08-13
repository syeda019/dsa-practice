package basicDsa;

public class array3 {
    public static void main(String[] args){
        int[] name = {7, 9, 8, 3, 2, 1};
        int even = name[0];
        for(int i=0; i<name.length; i++){
            if(name[i]/2==even){
                even= name[i];
            }
        }
        System.out.println("Minimum element:" + even);
    }
    
}
