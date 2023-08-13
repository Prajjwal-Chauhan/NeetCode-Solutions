// Beats 62% in time and 35% in space
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i = 0 ;
        int max = 0;
        int count = 0;

        for(int j = 0 ; j < s.length() ; j++){
            freq[s.charAt(j) - 'A']++;
            max = Math.max(max,freq[s.charAt(j) - 'A']);
            if(j - i + 1 - max > k){
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            count = Math.max(j - i + 1,count);
        }

        return count;
    }
}
