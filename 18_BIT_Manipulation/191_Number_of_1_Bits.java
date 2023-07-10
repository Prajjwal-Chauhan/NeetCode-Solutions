// 100% in time and 79% in space
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            int last = n&1;
            count+=last;
            n = n>>>1;
        }
        return count;
    }
}

// 43% in time and 79% in space
public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
