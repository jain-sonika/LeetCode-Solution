class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0 , right =0;
        Set<Character> seen = new HashSet();
        int max =0;
        while(right<s.length()){
       
        //The character at the current right pointer position is stored in the variable c.

            char c = s.charAt(right);
      //If the character c is added to the seen set (meaning it's unique in the current substring):


            if(seen.add(c)){
         
 //Update the max variable with the maximum length of the substring without repeating characters.
                max=Math.max(max , right-left+1);
            right++;
        }else{
            while(s.charAt(left)!=c){
                seen.remove(s.charAt(left));
                left++;
            }
        seen.remove(c);
        left++;
        }
        }

return max;
        
    }
}

//sliding window
