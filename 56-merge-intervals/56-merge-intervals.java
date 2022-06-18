class Solution {
    public int[][] merge(int[][] arr) {
        
       Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
      //  Arrays.sort(arr, (i1, i2) -> Integer.compare(i1[0], i2[0]));
     
        
        int count = 0;
        for(int i =1;i<arr.length;i++){
        if(count<arr.length&&arr[count][1]>=arr[i][0]){
            arr[count][1]=Math.max(arr[i][1], arr[count][1]);
        }
         else{
            count++;
            arr[count][0]=arr[i][0];
            arr[count][1]=arr[i][1];
            
        }
            
            
        }
        
    //    System.out.println(count);
        int[][] res = new int[count+1][2];
        
        for (int i = 0; i <= count; i++) {
			for (int j = 0; j < arr[0].length; j++) {
			//	System.out.print(arr[i][j] + " ");
                  res[i][j]= arr[i][j];
			}
		//	System.out.println();
		}
        
        return res;
        
    }
}