package recursion;

public class Resursion2 {
    static int sum(int n){

        if(n==1){
            return 1;
        }
        System.out.println(n);
        return n + sum(n-1);
    }
    public static void main(String[] args){
        int num = sum(5);
        System.out.println(num);
    }
    
}
//Print 1 to N
//Print N to 1
// Factorial
// Sum of N numbers
//Fibonacci
// Power (xⁿ)
// Reverse String
// Palindrome
// Sum of Digits
// Count Digits
// Linear Search
// Binary Search
// Check Sorted Array
// First Occurrence
// Last Occurrence