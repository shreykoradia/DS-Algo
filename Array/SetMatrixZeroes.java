package Array;

//  class SetMatrixZeroes {
    
// }

class SetMatrixZeroes
 {
    public void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;
      for(int i=0;i<rows;i++){
        if(matrix[i][0]==0) 
            col0=0;
        for(int j=1;j<cols;j++){
          if(matrix[i][j]==0)
            matrix[i][0]=matrix[0][j]=0;
        }
      }
      
      for(int i=rows-1;i>=0;i--){
        for(int j = cols-1;j>=1;j--)
          if(matrix[0][j]==0 || matrix[i][0]==0)
            matrix[i][j]=0;
        
        if(col0==0) matrix[i][0]=0;

      }
    }
}

// complete solution for the leet code tried and tested with many other apporoaches i found this easy and if trying in leet code please change className to Solution 
