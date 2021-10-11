/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures? 
 */
public class isUnique {
    
    public static boolean isUnique(String str){
        if (str.length() > 128){
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++){
            int val = str.toLowerCase().charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isUnique("abC"));
    }

}
