package basicDsa;

public class array9{
    public static void main(String[] args){
        int[] name = {1,6, 9, 4,2,1};
        // sorting in ascending order
        for(int i=0; i<name.length-1; i++){
            for(int j=0; j<name.length-i-1; j++){
                // in desending order we use | if(name[j] < name[j+1])
                if(name[j] < name[j+1]){
                    int temp= name[j];
                    name[j] = name[j+1];
                    name[j+1]= temp;
                }
            }
            
        }
        System.out.println("Ascending:" );
        for(int i=0; i<name.length; i++){
            System.out.print(name[i] + " ");
        }
        
    }
}
