// This  is a question depicting how to deal with array how to intialise array and how to print the array 
package Array;

import java.util.*;

 class array {
    public static void main(String[] args) {
        int[] priceofPen = new int[5];
        Scanner sc = new Scanner(System.in);
        
            for(int i = 0 ; i<priceofPen.length; i++){
                System.out.println("Enter the price of Pen");
                priceofPen[i] = sc.nextInt();
            }

            for(int i = 0 ; i<priceofPen.length; i++){
                System.out.println("The price of the pen is " + priceofPen[i] + " ");
               
            }
        sc.close();
    }
}
