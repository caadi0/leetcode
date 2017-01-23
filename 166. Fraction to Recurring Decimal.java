public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        HashMap<Long, Integer> hash = new HashMap<Long, Integer>();
        long whole = 0;
        Long num = Long.valueOf(numerator); Long den = Long.valueOf(denominator);
        String s = ""; String sign = "";
        if(num == 0)
            return "0";
        if (num < 0 || den < 0) {
            sign = "-";
            if(num < 0 && den < 0) {
                num *= -1;
                den *= -1;
                sign = "";
            } else if(den < 0)
                den *= -1;
            else {
                num *= -1;
            }
        }
        whole = num / den;
        long d = num - den * whole;
        hash.put(d, s.length());
        
        if(d == 0)
            return sign +whole;
            
        long rem = 0;
        while (d != 0) {
            s += ((d * 10) / den);
            rem = d * 10 % den;
            if(hash.containsKey(rem)) {
                break;
            }
            hash.put(rem, s.length());
            d = rem;
        }
        if (d == 0)
            return sign +"" +whole + "." + s;
            
        return sign +"" +whole + "." + s.substring(0, hash.get(rem)) + "(" + s.substring(hash.get(rem)) + ")";
    }
}