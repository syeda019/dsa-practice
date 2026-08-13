package recursion;

public class subSequence {
    static void Sequence(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        // choose character
        Sequence(str, index+1, newString+currChar);
        // not choose charcter
        Sequence(str, index+1, newString);
    }
    public static void main(String[] args){
        String str = "abcd";
        Sequence(str, 0, "");

    }
    
}
