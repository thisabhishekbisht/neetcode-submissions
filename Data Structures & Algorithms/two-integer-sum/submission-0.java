class Solution {
    public int[] twoSum(int[] nums, int target) {
        // length of the array
        int len = nums.length;
int[] index = new int [2];
        for(int i=0;i<len;i++){

for(int j=i+1;j<len;j++){
    int sum = nums[i]+nums[j];
if(sum == target){
// target reached 
if(i<j){
index[0]=i;
index[1]=j;
}
else{
index[0]=j;
index[1]=i;
}
}

}
        }
        
 return index;   }
}
