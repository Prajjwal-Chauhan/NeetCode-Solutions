import java.util.*;

// O(n) Time complexity -- Beats 97% in Time and 88% in Space as it uses indexarray for storing the index and we dont search for the element as we know the location of the elements using index array
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       if(n <= 1) return n;
        int max = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            if (charIndex[s.charAt(j)] >= i) {
                i = charIndex[s.charAt(j)] + 1;
            }
            charIndex[s.charAt(j)] = j;
            max = Math.max(max, j - i + 1);
        }
        
        return max;
    }
}
// can go O(n^2) Time complexity -- Beats 73% in Time and 49% in Space as it uses set and checks using contains every time for the element
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        if(n <= 1) return n;
        int i = 0;
        int j = 1;
        int max = 0;
        set.add(s.charAt(i));
        while(j < n){
            if(set.contains(s.charAt(j))){
                max = Math.max(max,j-i);
                while(s.charAt(i) != s.charAt(j)) {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            j++;
        }
        max = Math.max(max,j-i);
        return max;
    }
}
// O(n^2) Time complexity -- Beats23% in Time and 19% in Space as it uses map and searches every time for the element
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        if(n <= 1) return n;
        int i = 0;
        int j = 1;
        int max = 0;
        map.put(s.charAt(i),i);
        while(j < n){
            if(map.containsKey(s.charAt(j)) && i <= map.get(s.charAt(j))){
                max = Math.max(max,j-i);
                // while(s.charAt(i) != s.charAt(j)) {
                //     set.remove(s.charAt(i));
                //     i++;
                // }
                // map.remove(s.charAt(i));
                i = map.get(s.charAt(j)) + 1;
            }
            map.put(s.charAt(j),j);
            j++;
        }
        max = Math.max(max,j-i);
        return max;
    }
}