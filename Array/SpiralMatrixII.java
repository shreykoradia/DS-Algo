package Array;

     class SpiralMatrixII {
        
        public int[][] generateMatrix(int n) {
      
            int[][] result = new int[n][n] ;
            
            int rowBegin = 0;
            int rowEnd = n-1;
            int colBegin = 0 ;
            int colEnd = n-1;
            int counter = 1;
            while(rowBegin <= rowEnd && colBegin <= colEnd){
                  
                for(int i = colBegin ; i <=colEnd ; i++){
                      result[rowBegin][i] = counter++ ;
                    }
              rowBegin++;
                
                for(int i = rowBegin ; i<=rowEnd ; i++){
                   result[i][colEnd] = counter++;
                  }
              colEnd--;
              
                if(rowBegin <= rowEnd){
              
                for(int i = colEnd ; i>=colBegin ; i--){
                    result[rowEnd][i] = counter++ ;
                }
                   
                }
              rowEnd--;
              
                if(colBegin <= colEnd){
                for(int i = rowEnd ; i>=rowBegin ; i--){
                    result[i][colBegin] = counter++ ;
                }
                }
              colBegin++ ;
              }
            return result ;
        }
}


// this is an exclusive leet code solution 