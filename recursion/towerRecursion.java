package recursion;



public class towerRecursion{
    static void tower(int n, String s, String h, String d ){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + s + " to " + d);
            return;
        }
        //  move from source to helper
        tower(n-1,  s,  d,  h);
        System.out.println("Transfer disk " + n + " from " + s + " to " + d);
        // move from hepler to distination
        tower(n-1, h , s, d);

    }  
    public static void main(String[] args){
        int n = 3;
        tower(n, "s" , "h" , "d");
    }
}
