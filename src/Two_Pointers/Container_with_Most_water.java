package Two_Pointers;

public class Container_with_Most_water {
    class Solution {
        public int maxArea(int[] height) {
            int maxwater=0,lp=0,rp=height.length-1;
            while(lp<rp){
                int width = rp-lp;
                int ht = Math.min(height[lp],height[rp]);
                int currentwater =ht*width;
                maxwater= Math.max(maxwater , currentwater);
                if(height[lp] < height[rp]){
                    lp++;
                }
                else
                    rp--;


            }
            return maxwater;
        }
    }
}
