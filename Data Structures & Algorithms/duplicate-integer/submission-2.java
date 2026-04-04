class Solution {
    public boolean hasDuplicate(int[] nums) {
        // boolean 
        boolean isContains = false;
        // length of array
        int len =nums.length;
        // Declare hashmap to store the values
        HashMap<Integer , Integer> hashMap = new HashMap<>();

        // lets iterate inside input array to get store all the 
        // elemnets inside array 

        for(int i=0;i<len;i++){
            int value= nums[i];
             if(hashMap.containsKey(value)){
                int count=hashMap.get(value);
                System.out.println("Count "+count);
                hashMap.put(value,count+1);
                isContains= true;
                break;
            }
            else
             {   
                hashMap.put(value,1);
            }
        }


        return isContains;
    }
}