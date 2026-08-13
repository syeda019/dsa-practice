package basicDsa;

public class array8 {
    public static void main(String[] args){
        int[] name = {7, 8, 11, 9, 4, 2 ,1};
        // find second largest element 
        
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i=0; i<name.length; i++){
            if(name[i] > largest){
                SecondLargest = largest;
                largest = name[i];
            }
            else if(name[i] > SecondLargest && name[i] != largest){
                SecondLargest = name[i];
            }
            else{
                continue;
            }
        }
        System.out.println("Second largest element is: " + SecondLargest);
    }
    
}
