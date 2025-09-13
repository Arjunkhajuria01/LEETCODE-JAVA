public class Q4_LC {
    public static void main(String[] args) {
        class Solution {
            public boolean containsDuplicate(int[] nums) {
                // boolean a = false;
                // for(int i = 0 ; i<= nums.length -1 ; i++){
                //     for(int j = i +1 ; j <= nums.length -1 ; j++){
                //     if(nums[i] == nums[j]){
                //         a = true;
                //      }

                //    }
                // }
                // return a;
                Arrays.sort(nums);
                boolean a = false;
                for(int i = 0 ; i<= nums.length -2 ; i++){

                    if(nums[i] == nums[i+1]){
                        a = true;
                    }

                }
                return a;
            }
        }
    }
}
