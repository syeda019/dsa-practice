package DSA;

public class SelectionSort {
    public static void main(String[] args){
        int[] name = {1,3,6,4,10,9};
        // selection sort
        for(int i=0; i<name.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<name.length; j++){
                if(name[smallest] > name[j]){
                    smallest = j;
                }
            }
            int temp = name[smallest];
            name[smallest] = name[i];
            name[i] = temp;   
        }
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
    
}
