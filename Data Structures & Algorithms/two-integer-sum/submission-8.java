class Solution {
       public static int[] twoSum(int[] nums, int target) {
        // length of the array
        int len = nums.length;
        int[][] sortedArray = new int[len][2];
        for (int i = 0; i < len; i++) {
            sortedArray[i][0] = nums[i];
            sortedArray[i][1] = i;
        }

        Arrays.sort(sortedArray, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[2];
        int left =0;
        int right = len-1;
        while(left<right){
            int sum = sortedArray[left][0] + sortedArray[right][0];
            if(sum==target){
              int  ind1 = sortedArray[left][1];
              int ind2 = sortedArray[right][1];
            
            result[0]=Math.min(ind1,ind2);
             result[1]=Math.max(ind1,ind2);
                break;
            } else if (sum>target) {
                right--;
            }
            else {
                left ++;
            }
        }
        return result;
    }
}
