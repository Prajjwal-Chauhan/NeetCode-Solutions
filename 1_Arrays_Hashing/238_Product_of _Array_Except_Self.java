// optimal solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int temp = 1;
        for(int i = 0; i< n; i++) {
            ans[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = n-1; i >= 0; i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }
}
// Time complexity is high wrt solution above
class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lpre = new int[n];
        lpre[0] = 1;
        int[] rpre = new int[n];
        rpre[n-1] = 1;

        for(int i = 1 ; i < n ; i++)
        {
            lpre[i] = lpre[i-1]*nums[i-1];
        }

        for(int i = n-2 ; i >= 0 ; i--)
        {
            rpre[i] = rpre[i+1]*nums[i+1];
            rpre[i+1] *= lpre[i+1];
        }
        rpre[0] *= lpre[0];

        return rpre;
    }
}
