class Solution {
    public void setZeroes(int[][] arr) {
        boolean col = false;
        for(int i =0;i<arr.length;i++){
                for(int j = 0;j<arr[0].length;j++){
                    if(j==0){
                      if(arr[i][j]==0){
                        col = true;
                      }    
                    }else{
                    if(arr[i][j]==0){
                        arr[i][0]=0;
                        arr[0][j]=0;
                    }
                    }
                
            }
        }
        
        for(int i = arr.length-1;i>=0;i--){
            for(int j = arr[0].length-1;j>=0;j--){
                if(j==0){
                    if(col==true){
                        arr[i][j]=0;
                    }
                }else{
                    if(arr[i][0]==0||arr[0][j]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
    }
}