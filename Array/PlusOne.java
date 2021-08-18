/* Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123. */


package Array;

import java.util.Scanner;

 class PlusOne {

        int[] plusOne(int arr[]){
                for (int i = arr.length-1 ; i>=0 ; i--){
                    if(arr[i] < 9){
                        arr[i]++;
                        return arr;
                    }
                    arr[i] = 0;
                }

                int[] arra = new int[arr.length+1];
                arra[0] = 1;
               
                // for (int i : arra) {
                //     System.out.println(arra[i]);
                // }
                return arra;

                
        }

            

        public static void main(String[] args) {
            PlusOne ob = new PlusOne(); 
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
            ob.plusOne(arr);         
            sc.close();
        }    
}

// leet code solution that was verifed !but need to configure for IB

/*   for(int i=nums.length-1;i>=0;i--)
    {
        if(nums[i]<9)
        {
            nums[i]++;
            return nums;
        }
        nums[i]=0;
    }
    int[] numss = new int[nums.length+1];
    numss[0]=1;
    
    
    return numss;*/