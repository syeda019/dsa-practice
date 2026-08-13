package basicDsa;

public class array4 {
    public static void main(String[] args){
        int[] name = {7, 8, 9, 1, 2};
        // print sum of array
        int sum = 0;
        for(int i=0; i<name.length; i++){
            sum = sum + name[i];
        }
        System.out.println("Sum of array is:" + " " + sum);
    }
    
}
