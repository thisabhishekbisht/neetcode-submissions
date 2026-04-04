class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) +1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());

        sortList(keys,map);

        int[] topK = new int[Math.min(k,keys.size())];
        for(int i =0;i<topK.length;i++){
            topK[i]= keys.get(i);
        }
        return topK;
    }
    public void sortList(List<Integer> keys, Map<Integer,Integer> map){

for(int i =0;i<keys.size()-1;i++){

for(int j=i+1;j<keys.size();j++){

int a = map.get(keys.get(i));
int b = map.get(keys.get(j));
if(a<b){
    int temp= keys.get(i);
     a = keys.set(i,keys.get(j));
     b = keys.set(j,temp);
}
}
}
    }
}
