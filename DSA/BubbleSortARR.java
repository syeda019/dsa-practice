package DSA;

public class BubbleSortARR{
    public static void main(String[] args){
        int[] arr = {7, 8, 3, 1, 2};
        // sorting the array
        
        for(int i=0; i<arr.length-1; i++){ // n-1 tak arrange karna ha this is logic
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
            
        }
        // print the sorted array
            for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
           }
        
    }
    
}
