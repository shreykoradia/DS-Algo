package Array;
import java.util.Scanner;

 class MajorityElement {
            void majorityElement(int[] arr){
                    int count = 0 ;
                    int tem = 0;
                for(int i = 0 ; i < arr.length; i++){
                    for(int j =arr.length-1 ; j>=0 ; j--){
                    if(arr[i] == arr[j]){
                        count = count++ ;
                         tem = arr[i];
                        }
                    }
                }
                System.out.println(tem);
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
        ob.majorityElement(arr);
        sc.close();
    }
}



// this is a leet code question the question no is 229 henceforth if any more doubt in the question read it on leetcode.com