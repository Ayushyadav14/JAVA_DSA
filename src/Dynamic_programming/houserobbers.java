// 

// Simple Recursion 

// class Solution {
//     public int rob(int[] nums) {
//         return rob(nums,nums.length);        
//     }
//     int rob(int[] nums , int i){
//         if(i == 0){
//             return 0;
//         }
//         if( i == 1){
//             return nums[0];
//         }

//         int take = nums[i-1] +rob(nums,i-2);
//         int skip = rob(nums,i-1);
//         return  Math.max(take, skip);
//     }
// }