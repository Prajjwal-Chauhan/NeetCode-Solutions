// Beats 96% in time and 44% in space
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxL = height[l];
        int maxR = height[r];
        int count = 0;

        while(l < r){
            int k ;
            if(maxL <= maxR){
                l++;
                k = maxL - height[l];
                count += k > 0 ? k : 0;
                maxL = Math.max(maxL,height[l]);
            }
            else if(maxL > maxR){
                r--;
                k = maxR - height[r];
                count += k > 0 ? k : 0;
                maxR = Math.max(maxR,height[r]);
            }

        }

        return count;
         
    }
}
class Solution2 {
    public int trap(int[] height) {
        int n = height.length;
        int maxL[] = new int[n];
        maxL[0] = 0;
        int maxR[] = new int[n];
        maxR[n-1] = 0;

        for(int i = 1 ; i < n ; i++){
            maxL[i] = Math.max(maxL[i-1],height[i-1]);
        }
        for(int i = n-2 ; i >= 0 ; i--){
            maxR[i] = Math.max(maxR[i+1],height[i+1]);
        }

        int count = 0;

        for(int i = 0 ; i < n ; i++){
            int k = Math.min(maxL[i],maxR[i]) - height[i];
            count += k > 0 ? k : 0;
        }

        return count;
    }
}

// Beats 96% in time and 34% in space
class Solution3 {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxL = height[l];
        int maxR = height[r];
        int count = 0;

        while(l < r){
            if(maxL <= maxR){
                l++;
                maxL = Math.max(maxL,height[l]);
                count += maxL - height[l];
            }
            else if(maxL > maxR){
                r--;
                maxR = Math.max(maxR,height[r]);
                count += maxR - height[r];
            }

        }

        return count;
         
    }
}
