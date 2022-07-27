class Solution {
    public boolean isPalindrome(String s) {
        /*
            -- First Solution using the regex and string builder.
        String new_s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if(new_s.equals(new StringBuilder(new_s).reverse().toString())) return true;
        return false;
        */
        
        int start = 0;
        int end = s.length() - 1;
        
        char[] chars = s.toCharArray();
        
        while(start < end){
            if (!Character.isLetterOrDigit(chars[start])){
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(chars[end])){
                end--;
                continue;
            }
            if (Character.isLetterOrDigit(chars[start]) && Character.isLetterOrDigit(chars[end])){
                char lowered1 = Character.toLowerCase(chars[start]);
                char lowered2 = Character.toLowerCase(chars[end]);

                if (lowered1 != lowered2) return false;
            }
            

    
            start++;
            end--;
        }
        return true;
    }
}