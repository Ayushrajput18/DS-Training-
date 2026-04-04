package Two_Pointers;

public class Remove_duplicate_from_sorted_Array {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j=0;
            int i=0;
            int k=0;
            nums[j]=nums[0];
            for( i =0;i<nums.length;i++){
                //  nums[j]=nums[i+1];
                if(nums[i]!=nums[j]){
                    j++;
                    if(nums[i]!=nums[j]){
                        nums[j]=nums[i];


                    }
                }
                // if(nums[i]<nums[j]){
                //  nums[i]=nums[j];

            }

            return j+1;
            //     k++;
            //return k;
        }

    }

}
