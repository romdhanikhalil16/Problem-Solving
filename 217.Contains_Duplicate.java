import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> array = new HashSet<>();
        for(int n : nums){ array.add(n);}
        return nums.length != array.size() ; 
    }
}