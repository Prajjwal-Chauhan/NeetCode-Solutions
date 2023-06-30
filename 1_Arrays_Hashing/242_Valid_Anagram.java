//O(n) Time complexity as we search the character using index
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            freq[s.charAt(i) - 'a'] += 1;
        }

        for(int i = 0 ; i < t.length() ; i++){
            freq[t.charAt(i) - 'a'] -= 1;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] != 0) return false;
        }

        return true;
    }
}

// O(n^2) Time complexity Using HashMap as it also takes O(n) time to find the key
class Solution2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> hash1 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            hash1.put(c,hash1.getOrDefault(c,0) + 1);
        }

        for(int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i);
            hash1.put(c,hash1.getOrDefault(c,0) - 1);
        }

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(hash1.get(c) != 0) return false;
        }

        return true;
    }
}
