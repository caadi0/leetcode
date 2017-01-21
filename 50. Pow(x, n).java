public class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1.0;
        return pow(x, n);
    }
    
    double pow(double x, int n) {
        if(n == 1)
            return x;
        
        double temp = 0.0;
        if(n < 0) {
            temp = myPow(x, -(n/2));
            x = 1/x;
            temp = 1/temp;
            n *= -1;
        } else {
            temp = myPow(x, n/2);
        }
        
        if (n % 2 == 1) 
            return x * temp * temp;
        else
            return temp * temp;
    }
}