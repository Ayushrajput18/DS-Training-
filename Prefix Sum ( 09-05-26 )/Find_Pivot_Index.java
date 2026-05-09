class Solution {
    public int pivotIndex(int[] nums) {


        int lsum=0,total=0;

        for(int i:nums)
            total=total+i;

        for(int i=0; i<nums.length;lsum+=nums[i++])
        {
            if(lsum*2==total-nums[i])
                return i;

        }


        return -1;
    }
}