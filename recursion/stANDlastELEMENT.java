package recursion;


public class stANDlastELEMENT{
    static int first = -1;
    static int last = -1;
    static void Elements(String str, int index, char target ){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar==target){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        Elements(str,index+1,target);
    }

    
    public static void main(String[] args){
        String str="Tatheer";
        char target= 'a';
        Elements(str, 0, target);
    }

}