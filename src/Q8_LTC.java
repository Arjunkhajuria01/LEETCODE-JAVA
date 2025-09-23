public class Q8_LTC {
    class Solution {
    }
    public int searchInsert(int[] nums, int target) {
        int  a = 0;
        for(int i = 0; i<= nums.length -1 ; i++){
            if (nums[i] == target ){
                a = i;
                break;
            }
            if(nums[i] < target){

            }
            if(nums[i] > target ){
                a = i ;
                break;
            }
            if(target > nums[nums.length -1]){
                a = nums.length ;
                break;
            }
        }
        return a;
    }
}


