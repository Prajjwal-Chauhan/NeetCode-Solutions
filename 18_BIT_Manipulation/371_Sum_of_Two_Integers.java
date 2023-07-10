// beats 100% in time and uses O(1) space complexity
class Solution {
    public int getSum(int a, int b) {
        
        while(b != 0){
            int temp =  (a&b) << 1;
            a = a^b;
            b = temp;
        }

        return a;
    }
}