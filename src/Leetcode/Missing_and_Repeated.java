//2965. Find Missing and Repeated Values
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int[] ans = new int[2];

        for(int key: map.keySet()){
            if(map.get(key)>1){
                ans[0]=key;
            }
        }
        int num  = grid.length*grid[0].length;
        for(int i=1;i<=num;i++){
            if(!map.containsKey(i)){
                ans[1]= i;
            }
        }
        return ans ;
    }
}
