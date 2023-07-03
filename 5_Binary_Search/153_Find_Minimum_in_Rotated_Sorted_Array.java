// O(logn) Time complexity
class Solution {
    public int findMin(int[] nums) {
        int smallest = nums[0];
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            int mid = (i+j)/2;
            if(nums[i] > nums[mid]) {
                if(nums[mid - 1] > nums[mid]) return nums[mid];
                else {
                    smallest = Math.min(smallest,nums[mid]);
                    j = mid - 1;
                }
            }
            else{
                if(nums[mid] > nums[mid+1]) return nums[mid+1];
                else {
                    smallest = Math.min(smallest,nums[i]);
                    i = mid + 1;
                }

            }
        }

        return smallest;
    }
}