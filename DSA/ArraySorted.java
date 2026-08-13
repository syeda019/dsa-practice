package DSA;


// check array is sorted(Strictly  increasing)
public class ArraySorted {
    static boolean Sorted(int arr[] , int index){
        if(index==arr.length-1){
            return true;
        }

        if(arr[index] >= arr[index+1]){
            return false;
        }
        
        return Sorted(arr, index + 1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        System.out.println(Sorted(arr,0));
    }  
}
