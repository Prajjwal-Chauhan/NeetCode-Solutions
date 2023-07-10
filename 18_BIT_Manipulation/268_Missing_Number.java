// best as it uses O(n) Time complexity with 100% beat in time and O(1) space complexity with 62% of space complexity 
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i = 0 ; i < n ; i++){
            sum -= nums[i];
        }
        return sum;
    }
}

// Beats 29% in time and 39% in space as it uses O(nlogn) time complexity with O(n) space complexity
class Solution2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0 ; i < n ; i++){
            if(nums[i] != i) return i;
        }

        return n;
    }
}
