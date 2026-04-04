class Solution {
    fun maxArea(h: IntArray): Int {
        if(h.size<=1) return 0 

        var left =0
        var right = h.size-1
        var maxArea =0

        while(left<right){
            val height = Math.min(h[left],h[right])
            val area = height*(right -left)
            if(area>maxArea) maxArea = area
            if(h[left]<h[right]) left++
            else right--
        }

return maxArea
    }
}
