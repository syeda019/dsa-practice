package recursion;

public class powerRecursion {
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
    public static void main(String[] args){
        int x = 2;
        int n = 5;
        System.out.println(power(x,n));
    }
    
}
//power(5,2)
//5*5 power(5, 2-1) = (5,1)
// 5*5*1 = 25

// power(2,5)
// 2 * power(5,4)
// 2 * 2 * power(5,3)
// 2 * 2 * 2 * power(5, 2)
// 2 * 2 * 2 * 2 * power(5,1)
// 2 * 2 * 2 * 2 * 2 * power(5,0)
// 2 * 2 * 2 * 2 * 2 * 1 =32


