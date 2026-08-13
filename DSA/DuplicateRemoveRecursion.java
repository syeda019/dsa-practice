package DSA;

public class DuplicateRemoveRecursion{
    public static boolean[] map = new boolean[26];

    static void remove(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            remove(str,index+1,newString);
        }
        else{
            newString += currChar;
            map[currChar-'a'] = true;
            remove(str,index+1,newString);
        }
    }
    public static void main(String[] args){
        String str = "abbccda"; 
        remove(str,0,"");
    }
}