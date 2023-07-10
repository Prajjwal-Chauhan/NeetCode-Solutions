// Best as beats 100% in time and 60% in space
class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        if(n == 1) return new int[]{0,1};
        int result[] = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for(int i = 2; i <= n ; i++){
            if(i%2 == 0) result[i] = result[i/2];
            else result[i] = result[i/2] + 1;
        }

        return result;
    }
}

// Better i.e.; beats 60% in time and 45% in space
class Solution2 {
    public int[] countBits(int n) {
        int result[] = new int[n+1];
        for(int i = 0; i <= n ; i++){
            int k = i;
            while(k>0){
                k = k&(k-1);
                result[i]++;
            }
        }

        return result;
    }
}

// Beats only 10% in time and 30% in space
class Solution3 {
    public int solve(int n){
        if(n == 0)  return 0;
        if(n == 1)  return 1;

        if(n%2 == 0) return solve(n/2);
        else return 1+solve(n/2);
    }
    public int[] countBits(int n) {
        int result[] = new int[n+1];
        for(int i = 0; i <= n ; i++){
            result[i] = solve(i);
        }

        return result;
    }
}
