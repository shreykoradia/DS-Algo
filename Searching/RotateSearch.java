package Searching;

import java.util.Scanner;

public class RotateSearch {
    static int search(int arr[] , int l , int h , int k){
        if(l > h){
            return -1;
        }
        
        int mid = (l+h) / 2 ;

        if(arr[mid] == k){
            return mid ;
        }

        if(arr[l] <= arr[mid]){
            if(k >= arr[l] && k <= arr[mid]){
                return search(arr , l , mid-1 , k);
            }
            return search(arr , mid+1 , h ,k);
        }

        if (k >= arr[mid] && k <= arr[h])
        return search(arr, mid + 1, h, k);

    return search(arr, l, mid - 1, k);

    }    

    public static void main(String[] args) {
        int values ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value for the array");
        values = sc.nextInt();
        int [] arr = new int[values];
        for(int i = 0 ; i<values;i++){
            System.out.println("Enter the values of the Array in order ");
            arr[i] = sc.nextInt();
        }
        int k ;
        System.out.println("Enter the value of key : ");
        k = sc.nextInt();
        int i = search(arr ,0 , values-1 , k);
        if(i != -1){
            System.out.println("Index" + i);
        }        
        else{
            System.out.println("Key or K is not found");
        }
        sc.close();
    }
}


// Algorithm :

// 1) Find middle point mid = (l + h)/2
// 2) If key is present at middle point, return mid.
// 3) Else If arr[l..mid] is sorted
//     a) If key to be searched lies in range from arr[l]
//        to arr[mid], recur for arr[l..mid].
//     b) Else recur for arr[mid+1..h]
// 4) Else (arr[mid+1..h] must be sorted)
//     a) If key to be searched lies in range from arr[mid+1]
//        to arr[h], recur for arr[mid+1..h].
//     b) Else recur for arr[l..mid] 