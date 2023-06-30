// Problem number -- 125

// O(n) time complexity
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n == 0) return true;
        int i = 0;
        int j = n - 1;

        while(i < j){
            char left = (s.charAt(i));
            char right = (s.charAt(j));
            if(Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)){
                if(Character.toLowerCase(left) != Character.toLowerCase(right)) return false;
                else{
                    i++;
                    j--;
                }
            }
            else if(!Character.isLetterOrDigit(left)){
                i++;
            }
            else if(!Character.isLetterOrDigit(right)){
                j--;
            }
        }
        return true;
    }
}