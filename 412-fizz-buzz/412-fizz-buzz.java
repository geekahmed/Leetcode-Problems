class Solution {
    public static boolean isDivisibleBy3(int n){
        return (n % 3) == 0;
    }
    public static boolean isDivisibleBy5(int n){
        return (n % 5) == 0;
    }
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            String resultStr="";
            if(i%3==0){
                resultStr+="Fizz";
            }
            if(i%5==0){
               resultStr+="Buzz";
            }
            if(resultStr==""){
                resultStr+=Integer.toString(i);
            }
            result.add(resultStr);
        }
        return result;
    }
}