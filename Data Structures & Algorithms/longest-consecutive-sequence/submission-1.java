class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0 && nums== null) return 0;
        int len = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int i : nums ){
            set.add(i);
        }

        int best =0;

        for(int j : nums){
            if(!set.contains(j-1)){
                int cur =j;
                int size= 1;

                while(set.contains(cur+1)){
                    cur++;
                    size++;

                }
                best = Math.max(best,size);
            }
        }

return best;

    }

}
