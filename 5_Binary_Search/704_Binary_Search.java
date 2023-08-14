// 100% in both time and space 
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        // if(nums[0] == target){
        //     return 0;
        // }

        while(l<=r){
        int mid = l + (r - l)/2;
            if(target == nums[mid]) return mid;

            if(target > nums[mid]) {
                l = mid + 1;
            }
            if(target < nums[mid]){
                r = mid - 1;
            }
            // mid = l + (r - l)/2;
        }

        return -1;

    }
}
