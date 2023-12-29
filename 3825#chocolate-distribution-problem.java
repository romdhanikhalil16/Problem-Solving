import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        int min = Integer.MIN_VALUE;
        Collections.sort(a);
        if(n == m) return a.get(n-1) - a.get(0);
        else if( n > m){
            if(n-m == 1 ){
                return  Math.min( a.get(m) - a.get(1) , a.get(m - 1) - a.get(0));
            }else {
          int prevdifference = a.get(m - 1) - a.get(0);
            for(int i=1; i<=n - m  ; i++){
                int difference = a.get(i+ m - 1) - a.get(i) ;
                min = Math.min(difference, prevdifference);
                prevdifference = min;
            }  
            return min ;
        }
        }
           return 0;
    }
}