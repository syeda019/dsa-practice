package DSA;

public class evenOddRecursion {
    static boolean evenOdd(int n){
        if(n==0){
            return true;
        }
        if(n==1){
            return false;
        }
        return evenOdd(n-2);
    }
    public static void main(String[] args){
        int n=8;
        if(evenOdd(n)){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
//isEven(8)
// → isEven(6)
// → isEven(4)
// → isEven(2)
// → isEven(0)
// → true


// odd(7)
// → odd(5)
// → odd(3)
// → odd(1)
// → false