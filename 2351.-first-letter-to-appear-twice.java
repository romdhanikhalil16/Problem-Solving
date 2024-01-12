class Solution {
    public char repeatedCharacter(String s) {
        int [] existent_elements = new int [26];
        char result = Character.MIN_VALUE;
        for(int i=0 ; i<s.length() ; i++ ){
            if(existent_elements[s.charAt(i) - 'a'] == 1 ) return s.charAt(i);
            else existent_elements[s.charAt(i) - 'a'] ++ ;
        }
        return result;
    }
}