class Solution {
    public static void main(String[] args) {

    }
    public static int numDecodings(String s) {
        //special cases
        if(s.length()==0)
            return 0;
        if(s.charAt(0)=='0')
            return 0;
        //init case
        if(s.length()==1)
            return 1;
        int result1=1,result2=1;
        for(int i=1;i<s.length();i++){
            int result=0;
            if(Integer.parseInt(s.substring(i,i+1))!=0)
                result+=result1;
            if(Integer.parseInt(s.substring(i-1,i+1))>9&&Integer.parseInt(s.substring(i-1,i+1))<27)
                result+=result2;
            result2=result1;
            result1=result;
        }
        return result1;
    }
}