/* Kadane’s Algorithm:

Initialize:
    max_so_far = INT_MIN
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
  (c) if(max_ending_here < 0)
            max_ending_here = 0
return max_so_far */


package Array;

import java.util.Scanner;


class MaxSubarray {

        void maxSubArraySum(int arr[]){
            int n = arr.length ;
            int max_so_far = Integer.MIN_VALUE , max_ending_here = 0 ;
            
            for(int i = 0 ; i < n ; i++){
                max_ending_here = max_ending_here + arr[i];
                if(max_so_far < max_ending_here){
                    max_so_far = max_ending_here ;
                }
                if(max_ending_here < 0){
                    max_ending_here = 0;
                }
                // the below prints says each value in each iterate !
              //  System.out.println(max_ending_here);
            }
            System.out.println(" ");
            System.out.println(max_ending_here);
        }   

        public static void main(String[] args) {
            MaxSubarray ob = new MaxSubarray();
            Scanner sc  = new Scanner(System.in);
            int lengthOfArray ;
            System.out.println("Enter the length for the array ");
            lengthOfArray = sc.nextInt();
            // initalising array 
            int[] arr  = new int[lengthOfArray] ;
            // values of array is taken in below block of code
            for(int i = 0 ; i < lengthOfArray; i++){
                    System.out.println("Enter the value of the array in order you like ");
                    arr[i] = sc.nextInt();
            }
            ob.maxSubArraySum(arr);
            sc.close();

        }
    
}
