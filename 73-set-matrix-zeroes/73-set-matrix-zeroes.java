class Solution {
    public void setZeroes(int[][] arr) {
        boolean rowt = false;
        boolean colt = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i][0]==0){
                rowt = true;
                break;
            }
        }
        for(int j = 0;j<arr[0].length;j++){
            if(arr[0][j]==0){
                colt = true;
                break;
            }
        }
        for(int row =0; row< arr.length;row++){
           for(int col =0;col<arr[0].length;col++){
               if(arr[row][col]==0){
                   arr[row][0]=0;
                   arr[0][col]=0;
               }
           }
        }
        
        
        for(int i =1;i<arr.length;i++){
            if(arr[i][0]==0){
                for(int j =0;j<arr[0].length;j++){
                      arr[i][j]=0;
                }
            }   
        }
        
        for(int i =1;i<arr[0].length;i++){
            if(arr[0][i]==0){
                for(int j =0;j<arr.length;j++){
                    arr[j][i]=0;
                }
            }
        }
        if(rowt){
            for(int i =0;i<arr.length;i++){        
            arr[i][0]=0;
            }
        }
        if(colt){
            for(int j = 0;j<arr[0].length;j++){
                arr[0][j]=0;
            }
        }
    }
}