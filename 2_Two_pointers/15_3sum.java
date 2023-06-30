import java.util.*;

// O(n^2) Time complexity but with more optimality as it doesnt use Hashset and skips indexes to avoid duplicates
// Beats 86% in time and 24% in space 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sums = new ArrayList<>(); 
        int n = nums.length;

        for(int i = 0 ; i < n-2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while(j<k){ 
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    sums.add(arr);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }
                else if(nums[i] + nums[j] + nums[k] > 0) k--;
                else if(nums[i] + nums[j] + nums[k] < 0) j++;
            }

        }
            return sums;
    }
}

// O(n^2) overall Time Complexity with HashMap taking extra space -- beats 38% in time and 21% in space 
class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> sums = new ArrayList<>(); 
        int n = nums.length;
        int k = 0;
        int i = k+1;
        int j = n - 1;

        while(k < n-2){
            i= k + 1;
            j=n - 1;
            while(i<j){ 
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    if(!set.contains(arr)){
                        set.add(arr);
                        sums.add(arr);
                    }
                    i++;
                    j--;
                }
                else if(nums[i] + nums[j] + nums[k] > 0) j--;
                else if(nums[i] + nums[j] + nums[k] < 0) i++;
            }
            k++;

        }
            return sums;
    }
}
