class Solution {
    public int maxArea(int[] heights) {
        if(heights==null && heights.length<2)return 0;

        int len = heights.length;

        int left=0;
        int right = len-1;
        int maxArea =0;

            while(left<right){
                int h = Math.min(heights[left],heights[right]);
                int area = h *(right-left);
                if(area>maxArea) maxArea= area;
                if(heights[left]<heights[right])left++;
                else right--;
            } 
          return maxArea;
    }
  
}
