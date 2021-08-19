package Array;
import java.util.*;

public class MaxMin {
    void maxMin(int A[]){
        int max ;
        int min ;
        
            Arrays.sort(A);
         max = A[A.length-1];
         min = A[0];

        int result = max + min ;
        System.out.println("THe MaxMin :" + result);
    }
    public static void main(String[] args) {
        MaxMin ob = new MaxMin();
        Scanner sc  = new Scanner(System.in);
        int lengthOfArray ;
        System.out.println("Enter the length for the array that you want to make  ");
        lengthOfArray = sc.nextInt();
        // initalising array 
        int[] A  = new int[lengthOfArray] ;
        // values of array is taken in below block of code
        for(int i = 0 ; i < lengthOfArray; i++){
                System.out.println("Enter the value of the array in order you like ");
                A[i] = sc.nextInt();
        }
        ob.maxMin(A);
        sc.close();  
    }
}

/*  leet code solution if you want to run on leet code 

public class Solution {
    public int solve(int[] A) {
        int max ;
        int min ;
        
            Arrays.sort(A);
         max = A[A.length-1];
         min = A[0];

        int result = max + min ;
        return result ;
    }
}


*/
