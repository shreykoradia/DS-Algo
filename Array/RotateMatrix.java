package Array;

import java.util.Scanner;

 class RotateMatrix {

         static void rotateMatrix(int arr[][]){
            // this method resembles directly from the indices 

            int N = arr.length;
            System.out.println(N);

            for(int j =0 ; j < N ; j++){
                for(int i = N-1 ; i >= 0; i--){
                    System.out.println();
                    System.out.print(arr[i][j] + " " );
            System.out.println();
                }
            }

        }


    // main function return for the values of array 
    public static void main(String[] args) {
        int rowvals , colvals ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value for the array for rowvals");
        rowvals = sc.nextInt();
        System.out.println("Enter the value for the array for colvals");
        colvals = sc.nextInt();
        int[][] arr = new int [rowvals][colvals];
        for(int i = 0 ; i<rowvals;i++){
            for(int j =0; j<colvals ; j++ ){
                System.out.println("Enter the values of the Array in order ");
                     arr[i][j] = sc.nextInt();
            }
        }
        rotateMatrix(arr);

        // System.out.println("Printing Elements...");  
        // for(int i=0;i<rowvals;i++)  
        // {   
        //     System.out.println();  
        //     for(int j=0;j<colvals;j++)  
        //     {  2
        //         System.out.print(arr[i][j]+"\t");  
        //     }  
        // }  
        

        sc.close();
    }
}
