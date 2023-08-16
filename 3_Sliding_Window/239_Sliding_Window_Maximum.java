// Beats 72% in time and 59% in space 
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int max[] = new int[n - k + 1];
        int j = 0;
        Deque<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            if(!q.isEmpty() && q.peekFirst() < i-k+1) q.pollFirst();
            while(!q.isEmpty() && nums[i] > nums[q.peekLast()]) q.pollLast();
            q.offer(i);
            if(i >= k-1) max[j++] = nums[q.peekFirst()]; 
        }

        return max;
    }
}
