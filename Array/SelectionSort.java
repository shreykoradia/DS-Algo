package Array;
// import java.util.*;

import java.util.Scanner;

class SelectionSort {

        void sort(int arr[]){
            int n = arr.length ;
            
            // one by one moving boundary of unsorted array 

            for(int i = 0; i < n-1; i++){
                // finding the min element in the array 
                int min_index = i;
                for(int j = i+1 ; j< n ; j++){
                    if(arr[j] < arr[min_index]){
                        min_index = j ;
                    }
                }
                // swapping the founded min element
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i]  = temp;
            }  
        }

             // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        // int arr[] = {64,25,12,22,11};
        // taking random values from user 
        int values ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value for the array");
        values = sc.nextInt();
        int [] arr = new int[values];
        for(int i = 0 ; i<values;i++){
            System.out.println("Enter the values of the Array in order ");
            arr[i] = sc.nextInt();
        }
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        sc.close();
    }
}
