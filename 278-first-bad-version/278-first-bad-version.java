/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int pos = 1;
        while (start <= end){
            int middle = start +  (end - start) / 2;
            
            boolean middle_element = isBadVersion(middle);
            
            if (middle_element){
                pos = middle;
                end = middle - 1;
            }
            else{
                start = middle + 1;
                
            }
                
        }
        return pos;
    }
}