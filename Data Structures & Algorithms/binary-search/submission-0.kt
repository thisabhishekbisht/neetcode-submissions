class Solution {
    fun search(nums: IntArray, target: Int): Int    {
        if(nums.size==0 || nums==null) return -1

        val len = nums.size
        var left = 0
        var right = len-1

    while(left<=right){
        val mid = left +(right-left)/2
        // check if nums mid is equal to target
        if(nums[mid]==target){
            return mid
        }
       // check if mid is greater than target
        else if(nums[mid]<target){
            left =mid+1
        }
        else{
            right = mid-1
        }
    }
        return -1

    }
}
