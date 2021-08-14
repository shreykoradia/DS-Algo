package Array;
import java .util.Scanner;
 class BubbleSort {

            void bubbleSort(int arr[]){
                int n = arr.length;
                for(int i=0; i<n-1; i++){
                    for(int j =0; j<n-i-1; j++){
                        if(arr[j] > arr[j+1]){
                            // swap of the terms 
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
             /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();
        // int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int values ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value for the array");
        values = sc.nextInt();
        int [] arr = new int[values];
        for(int i = 0 ; i<values;i++){
            System.out.println("Enter the values of the Array in order ");
            arr[i] = sc.nextInt();
        }
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        sc.close();

    }
}
