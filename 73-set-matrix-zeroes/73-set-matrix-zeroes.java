class Solution {
    public void setZeroes(int[][] arr) {
        boolean rowt = false;
        boolean colt = false;
        for(int row =0; row< arr.length;row++){
           for(int col =0;col<arr[0].length;col++){
               if(row==0){
                   if(arr[row][col]==0){
                       rowt = true;
                   }
               }
               if(col==0){
                   if(arr[row][col]==0){
                       colt=true;
                   }
               }
               else{
                    if(arr[row][col]==0){
                        arr[row][0]=0;
                        arr[0][col]=0;
                    }
               }
           }
        }
        
        for(int row = arr.length-1;row>=0;row--){
            for(int col = arr[0].length-1;col>=0;col--){
                if(row==0){
                    if(rowt==true){
                        arr[row][col]=0;
                    }
                }
                if(col==0){
                    if(colt==true){
                        arr[row][col]=0;
                    }
                }
                else{
                    if(arr[row][0]==0||arr[0][col]==0){
                        arr[row][col]=0;
                    }
                }
            }
        }    
       
    }
}