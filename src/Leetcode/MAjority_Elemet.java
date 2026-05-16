//Majority Element 
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// This is the bruit force emthod .
// Time Complexity is O(n^2)

// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for(int i =0;i<n;i++){
//             int count =0;
//             for(int j =0;j<n;j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//             }
//             if(count > n/2){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

// This is of time complexity O(n)

// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int n = nums.length;

//         for(int num : nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//             if(map.get(num)>n/2){
//                 return num;
//             }
//         }
//         return -1;

//     }
// }


    



    
