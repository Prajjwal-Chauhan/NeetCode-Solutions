import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


// O(n) Time Complexity Using Hashset -- more optimal tha hashmap in both space and time
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }

        return false; 
    }
}
// O(n) Time Complexity Using HashMap
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
// O(nlogn) Time complexity
class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1 ; i< nums.length ; i++){
            if(nums[i] == nums[i-1]) return true;
        }

        return false;
    }
}
