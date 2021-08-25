package Array;
import java.util.Scanner;

 class MajorityElement {
                
                void printElement(int[] arr){
                    int result = majorityElement(arr);

                    if(isMajority(arr, result)){
                        System.out.println(" " + result + " ");
                    }
                    else{
                        System.out.println("No majority found");
                    }
                }

            int majorityElement(int[] arr){
                    int n = arr.length;
                // method by moores algorithm 
                int ansIndex = 0 ; 
                int count = 1 ;

                for(int i = 0; i < n ; i++){
                    if(arr[i] == arr[ansIndex]){
                        count++;
                    }
                    else{
                        count--;
                    }
                    if(count == 0){
                        ansIndex = i;
                        count = 1;
                    }
                }
                    return arr[ansIndex];
            }

            // we need to check if the value is really repeating or having highest frequency 

            boolean isMajority(int[] arr ,int result){
                int n = arr.length;
                 int count = 0 ;

                 for(int i = 0 ; i < n ; i++){
                     if(arr[i] == result){
                        count++;
                     }     
                }
                if(count > n/3){
                    return true ;
                }
                else return false ;
            }


    public static void main(String[] args) {
        MajorityElement ob = new MajorityElement();
         int n ; 
        System.out.println("Enter the values of the n");
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        int[] arr = new int[n] ;
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter the value of the array in order ");
            arr[i] = sc.nextInt();
        }
        // ob.majorityElement(arr);
        ob.printElement(arr);
        sc.close();
    }
}



// this is a leet code question the question no is 229 henceforth if any more doubt in the question read it on leetcode.com

// the first apporach is we will maintain two loops and then we will make a check on array one loop iterate and then the second loop will
// check the if condition  hence the array index value will be stored and met with condition of count and  , max count
// and hece forth we will store and print the value  but time complexity is not that efficient hence O(n^2); 

// =>sol by method 1
                //     int maxcount = 0 ;
                //     int index = -1;
                // for(int i = 0 ; i < arr.length; i++){
                //     int count = 0 ;
                //     for(int j =0 ; j<arr.length ; j++){
                //     if(arr[i] == arr[j]){
                //         count++ ;
                //     }
                //     }
                //     if(count > maxcount){
                //         maxcount = count ;
                //         index  = i ;    
                //     }
                // }
                // if(maxcount > n/3){
                //     System.out.println("here is the index"+arr[index]);
                // }
                // else{
                //     System.out.println("the array is the only max repeating element itself");
                // }


// approach for moore's alogrithm

/* (Using Moore’s Voting Algorithm):   

Approach: This is a two-step process. 
The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.
Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.
 
Algorithm: 
Loop through each element and maintains a count of majority element, and a majority index, maj_index
If the next element is same then increment the count if the next element is not same then decrement the count.
if the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
Now again traverse through the array and find the count of majority element found.
If the count is greater than half the size of the array, print the element
Else print that there is no majority element */