class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] result = new int[size];
        int index =0;
          int product =1;
        for(int i=0;i<size;)
        {
            int j =0;
            while(j<size){
                    if(i==j){
                    // do nothing
                    }
                    else
                    {
                        product *= nums[j];
                    }
                    j++;
            }
             
            
            result[i]=product;
            i++;
            index =i;
            product =1;
        }
        
        return result;
    
}  
}
