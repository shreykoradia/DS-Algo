package Array;

import java.util.Arrays;
import java.util.Scanner;

class SquaresOfSortedArray {

        void squaresOfSortedArray(int arr[]){
            int n = arr.length;
            // converting in to the Sqaures 

            for(int i = 0 ; i < n ; i++){
                arr[i] = arr[i] * arr[i];
            }

           
        }
    // printing array function 
    void printArray(int arr[])
    {   
            // sorting the array 
            Arrays.sort(arr);
          // testing if it is possible    
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    // main function 
    public static void main(String[] args) {
        SquaresOfSortedArray ob = new SquaresOfSortedArray();
        int values ;
        System.out.println("Enter the max values that array can have : ");
        Scanner sc = new Scanner(System.in);
        values = sc.nextInt();
        int[] arr = new int[values];
        for(int i = 0 ; i < values ; i++){
            System.out.println("Enter the values in the array in order :");
            arr[i] = sc.nextInt();
            System.out.println(" ");
        }

        ob.squaresOfSortedArray(arr);
        ob.printArray(arr);
        sc.close();
    }
}
