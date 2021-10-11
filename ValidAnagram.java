/**
 * Given two strings s and t, write a function to determine if t is an anagram of s
 */
public class ValidAnagram {
    
    public static boolean isAnagram(String t, String s){
        if(t.length() > 26 || s.length() > 26){
            return false;
        }
        else if (t.length() != s.length()){
            return false;
        }

        int[] letters = new int[128];
        for (int i = 0; i < t.length(); i++) {
            char index = t.charAt(i);
            letters[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char index = s.charAt(i);
            letters[index]--;

            if(letters[index] < 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
}
