import java.util.Arrays;
import java.util.HashSet;

// O(nlogn) Time complexity
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;

        Arrays.sort(nums);
        int max = 0; 
        int count = 1;

        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] + 1 == nums[i]) count++;
            else if(nums[i - 1] == nums[i]) continue;
            else {
                max = Math.max(max,count);
                count = 1;    
            }
        }
        max = Math.max(max,count);
        return max;
    }
}


// O(n^2) Time Complexity -- [TLE]
class Solution2 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);

        int maxseq = 0;

        for(int i = 0 ;  i < nums.length ; i++){
            int currentseq = 1;
            int curr = nums[i];

            while(set.contains(--curr)) currentseq++;

            maxseq = Math.max(maxseq,currentseq);
        } 

        return maxseq;
    }
}