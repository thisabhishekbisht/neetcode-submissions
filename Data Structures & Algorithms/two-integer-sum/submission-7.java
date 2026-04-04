class Solution {
    public int[] twoSum(int[] nums, int target) {
        // length of the array

        // in order to use two pointer we need to sort the array but not index so 
        int len = nums.length;
        int arr[][]  = new int[len][2];

        for(int i =0;i<len ;i ++){
        arr[i][0] = nums[i];
        arr[i][1] = i;
        }

        Arrays.sort(arr,Comparator.comparingInt(a-> a[0]));


      
        int[] index = new int [2];
        int left=0;
        int right=len-1;

        while(left<right)
        {
            int sum =arr[left][0] + arr[right][0] ;
            if(sum==target)
            {
                if(arr[left][1]<arr[right][1]){
                  index[0]=arr[left][1];
                index[1]= arr[right][1];
                }
                else
                {
                        index[0]=arr[right][1];
                index[1]= arr[left][1];
                }
              
                break;
            }
            else if(sum > target){
                right--;

            }
            else
            {
                left++;

            }
        }

        return index;  
         }
}
