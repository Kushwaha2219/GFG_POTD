class Solution {
    public int romanToDecimal(String str) {
        int n=str.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);hm.put('V', 5);hm.put('X', 10);hm.put('L', 50);hm.put('C', 100);hm.put('D', 500);
        hm.put('M', 100);
        
        int res=hm.get(str.charAt(n-1));
        
        for(int i=n-2;i>=0;i--){
            int curr=hm.get(str.charAt(i));
            int last=hm.get(str.charAt(i+1));
            
            if(curr<last){
                
                res=res-curr;
            }
            else{
                res+=curr;
            }
        }
        return res;
    }
}