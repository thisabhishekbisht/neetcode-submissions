class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int [][] sorted = new int [len][2];
        for(int i =0;i<len;i++){
            sorted[i][0]=nums[i];
            sorted[i][1]=i;
        }
  Arrays.sort(sorted, Comparator.comparingInt(a-> a[0]));

  int left =0;
  int right =len-1;
  int [] result = new int [2];

  while(left<right){
        int sum= sorted[left][0] + sorted[right] [0];

        if(sum ==target){
            int ind1 = sorted[left][1];
            int ind2 = sorted[right][1];

            result[0] = Math.min(ind1,ind2);
            result[1] =Math.max(ind1,ind2);

            break;
        }
        else if(sum>target){
               right--;
         
        }
        else{
   left++;
        }
  }
      return result;  
    }
}
