class Solution {
    public double myPow(double x, int n) {
        double temp;
        
        if(n == 0){
            return 1;
        } 
      
 //A recursive call to myPow is made with the base x and the exponent n/2. The result is stored in the temp variable
        temp = myPow(x, n/2);
//If the exponent n is even (remainder when divided by 2 is 0), it returns the square of temp, which is essentially raising x to the power of n.


        
        if(n % 2 == 0) return temp * temp;// even pow
        
        else{//odd pow
            
            if(n > 0) return x * temp * temp;//odd +ve pow
            
            else return (temp * temp)/x;//odd -ve pow
        }
    }
}


//even x^n =(x^(n/2))^2
//odd x^n = x*(x^(n/2))^2

/*
The idea would be pretty simple. We would just use loops and multiply the number by 'n' times.

class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        for(int i=0;i<n;i++){
            ans = ans * x;
        }
        return ans;
    }
}*/
