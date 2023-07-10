// beats 100% in time and uses O(1) space complexity
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            nums[0] = nums[i] ^ nums[0];
        }

        return nums[0];
    }
}