// bottom to up 

// class Solution {
//     public int fib(int n) {
//         if(n<=1){
//             return n;
//         }
//         int[] dp = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;
//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         return dp[n];
//     }
// }

// top to down

// class Solution {
//     public int fib(int n) {
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return solve(n,dp);
//     }
//     public int solve(int n , int[] dp){
//         if(n<=1){
//             return n;
//         }

//         if(dp[n] != -1){
//             return dp[n];
//         }
        
//         dp[n] = solve(n-1,dp) + solve(n-2,dp);

//         return dp[n];
//     }
// }


// STEP 4 — Space Optimisation: dp[i] only needs the last two values
// static long fibBest(int n) {
//     if (n <= 1) return n;

//     long prev2 = 0, prev1 = 1; // dp[i-2], dp[i-1]

//     for (int i = 2; i <= n; i++) {
//         long cur = prev1 + prev2;
//         prev2 = prev1;
//         prev1 = cur;
//     }

//     return prev1;
// }