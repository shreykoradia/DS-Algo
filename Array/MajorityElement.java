package Array;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        int index ; 
        System.out.println("Enter the values of the indexs");
        Scanner sc = new Scanner(System.in);
        index  = sc.nextInt();
        int[] arr = new int[index] ;
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter the value of the array in order ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}
