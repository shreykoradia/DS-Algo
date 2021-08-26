package Searching;

import java.util.Scanner;

 class BinarySearch {
    static int target;
            void binarySearch(int[] arr , int target){
                int n  = arr.length;
                int start  = 0 ;
                int ending = n-1;
                while(start <= ending){
                    int mid = (start + ending) / 2;
                    if(arr[mid] == target){
                         System.out.println("mid" + mid + " " + arr[mid]);
                         break;
                    }
                    else if(arr[mid] < target){
                        start = mid+1;
                    }
                    else{
                        ending= mid-1;
                    }
                } 
            }

   public static void main(String[] args) {
    BinarySearch ob = new BinarySearch();
    int values;
    System.out.println("Enter the max values that array can have : ");
    Scanner sc = new Scanner(System.in);
    values = sc.nextInt();
    int[] arr = new int[values];
    for(int i = 0 ; i < values ; i++){
        System.out.println("Enter the values in the array in order :");
        arr[i] = sc.nextInt();
        System.out.println(" ");
    }
    System.out.println("ENter the Target");
    target = sc.nextInt();
    ob.binarySearch(arr, target);
    sc.close();
   }
}
