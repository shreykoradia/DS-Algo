package Searching;

public class implementPower {
    class Solution {
        public double myPow(double x, int n) {
              return (n<0)  ? 1 / Power(x , n) : Power(x , n) ;
        }
        public double Power(double x , int n ){
            if(n == 0) return 1;
            
          double value = Power(x , n/2);
          
          return value * value * (n % 2 != 0 ? x : 1) ;
        }
      
    }
}

// leet code solution for implement a Power function with Divide and conquer algorithm 