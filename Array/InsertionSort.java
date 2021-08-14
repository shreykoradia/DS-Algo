package Array;

import java.util.Scanner;

class InsertionSort {

        void sort(int arr[]){
            int n = arr.length;
            for(int i = 1 ; i<n ; i++){
                int key = arr[i];
                int j = i-1 ;

                
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */

               while(j>=0 && arr[j]>key){
                   arr[j+1] = arr[j];
                   j = j-1;
               }
               arr[j+1] = key ;
            }
        }

          /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

    public static void main(String args[])
    {
        // int arr[] = { 12, 11, 13, 5, 6 };

        int values ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value for the array");
        values = sc.nextInt();
        int [] arr = new int[values];
        for(int i = 0 ; i<values;i++){
            System.out.println("Enter the values of the Array in order ");
            arr[i] = sc.nextInt();
        }
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
        sc.close();
    }

}
