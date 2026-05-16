package two_pointer;

public class duplicate {
    public static int removeDuplicates(int[] nums){
        int slow =0;
        for(int fast =1;fast<nums.length;fast++){
            if(nums[fast] != nums[slow]){
                nums[++slow] = nums[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        int length = removeDuplicates(nums);
        System.out.println("Unique Length : "+length);
        System.out.print("Array: ");

        for(int i=0;i<length;i++){
            System.out.println(nums[i]+" ");
        }
    }
    
}
