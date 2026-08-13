package recursion;

public class RecursionFabonacci {
    static int fabonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fabonacci(n-1) + fabonacci(n-2);   
    }
    public static void main(String[] args){
        int n= 7;
        System.out.print(fabonacci(n));
    }    
}
