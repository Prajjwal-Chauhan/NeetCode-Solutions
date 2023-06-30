// O(n) with beats 82% in Time but optimal in space - beats 55%
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            int l = height[i];
            int r = height[j];
            max = Math.max(max,(j-i)*Math.min(l,r));
            if(l < r) i++;
            else if(l > r) j--;
            else{
                if(height[i+1] < height[j-1]) j--;
                else if(height[i+1] < height[j-1]) i++;
                else{
                    i++;
                    j--;
                }
            }
        }

        return max;
    }
}

// O(n) in time but beats 10% in space
class Solution2 {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        int test = 0;

        while(i < j){
            test = height[i] < height[j] ? height[i] : height[j]; 
            max = Math.max(max,(j-i)*test);
            if(height[i] <= height[j]) i++;
            else j--;
        }

        return max;
    }
}
