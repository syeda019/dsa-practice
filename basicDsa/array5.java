package basicDsa;

public class array5 {
    public static void main(String[] args){
        int[] name = {7, 8, 9, 3, 2 ,1};
        // find average of array
        int sum = 0;
        
        for(int i=0; i<name.length; i++){
            sum = sum + name[i];
        }
        System.out.println("sum of array :" + " " + sum);
        double average = (double) sum / name.length;
        System.out.println("Average of array is:" + " " + average);
    }
    
}
