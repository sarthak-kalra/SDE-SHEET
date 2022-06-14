class Solution {
    public List<List<Integer>> generate(int rows) {
       
		List<List<Integer>> bigl = new ArrayList<List<Integer>>();
        
        for(int i =1;i<=rows;i++){
        List<Integer> list = new ArrayList<Integer>();
            int val = 1;
            list.add(val);
            int nmult = i-1;
            int dmult = 1;
            for(int j = 2;j<=i;j++){
                val = val*nmult;
                val = val/dmult;
                
                nmult = nmult-1;
                dmult = dmult+1;
                list.add(val);
            }
            bigl.add(list);
        }
        
        return bigl;
        
    }
}