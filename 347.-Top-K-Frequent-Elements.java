class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();
        // Set sortedOccurencSet = new HashSet<>(map.entrySet());
        int  [] res = new int [k];

        int newValue = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                newValue = map.get(num) + 1;
                map.put(num,newValue);
            }else 
                map.put(num,0);
                
        }
        if(nums.length == 1 )
            res[0] = nums[0];
        else{
           int i = 0 ;
        while(i < k ){
            int max = Integer.MIN_VALUE;
            int value = 0;
            for(int el : map.keySet()){
                if(map.get(el) > max){
                    max = map.get(el);
                    value = el;
                }
                
            }
            res[i]=value;
            map.remove(value);
            i++;
        } 
        }
  
        return res;
    }   
}