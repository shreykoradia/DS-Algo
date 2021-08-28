package Searching;

// public class SearcRange {
    
// }
public class SearcRange {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
                int n = A.length;
                int[] arr = {-1,-1};
                int start = 0;
                int end  =  n-1; 
                while(start <= end){
                    int mid = start + (end-start)/2 ;   

                    if (A[mid] == B){
                        arr[0] = mid ;
                        end = mid -1 ;
                    }        
                    else if(B < A[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
              // binary searching for last position

              start = 0;
              end = A.length-1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            
            if(A[mid] == B){
                arr[1] = mid;
                start = mid+1;
            }
            else if(B < A[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr;

    }
}
