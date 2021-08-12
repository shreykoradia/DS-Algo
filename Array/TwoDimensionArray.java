package Array;

import java.util.*;

public class TwoDimensionArray {
    public static void main(String[] args) {

        // we have seen how this works in the multi dimensional array !
        // arr[0][0] = 1
        // arr[0][1] = 2
        // arr[1][0] = 3
        // arr[1][1] = 4

        // int [][] array = {{1,2},{3,4}};
        // for(int i = 0 ; i<2 ;i++){
        //     for(int j = 0 ; j<2 ; j++){
        //         System.out.println("arr[" + i + "][" + j + "] = "  + array[i][j]);
        //     }
        // }
            int totalRows , totalcol ;
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the Total Rows ");
             totalRows = sc.nextInt(); 
            System.out.println("Enter the Total Col ");
             totalcol = sc.nextInt(); 
            int [][] arr  = new int[totalRows][totalcol];        // An array is formed as row values for totalRows  

            // for loop to take input of
            // values in each TestCase
            for(int i = 0 ; i< totalRows ; i++){
                for(int j = 0 ; j<totalcol;j++){
                    System.out.print("Enter Element");  
                    arr[i][j]=sc.nextInt();       
                }
            }

            System.out.println("Printing Elements...");  
            for(int i=0;i<totalRows;i++)  
            {   
                System.out.println();  
                for(int j=0;j<totalcol;j++)  
                {  
                    System.out.print(arr[i][j]+"\t");  
                }  
            }  
            sc.close();
    }
}