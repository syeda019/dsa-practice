package basicDsa;

public class array2 {
    public static void main(String[] args){
        int[] arr = {7,8,9,1,2};
        // find maximum element
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
    
}
