package basicDsa;

public class SUM {
    public static void main(String[] args){
        int[] arr1 = {2,3,5,8,10};
        int[] arr2 = {1,4,6};
        // logic create new array
        int[] merge= new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++){
            merge[i] = arr1[i];

        }
        for(int i=0; i<arr2.length; i++){
            merge[arr1.length + i] = arr2[i];
        }
        System.out.print("merge array:");
        for(int i=0; i<merge.length; i++){
            System.out.print(merge[i] + " ");
        }
    }
}
    

