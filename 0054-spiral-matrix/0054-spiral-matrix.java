class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int sr=0;
        int ec=n-1;
        int er=m-1;
        int sc=0;
        List<Integer> res=new ArrayList<>();
        int count=n*m;
        while(count>0){
            //sr
            for(int i=sc;i<=ec;i++){
                res.add(matrix[sr][i]);
                count--;
            }
            sr++;
            if(count==0)break;

            //ec
            for(int i=sr;i<=er;i++){
                res.add(matrix[i][ec]);
                count--;
            }
            ec--;
            if(count==0)break;

            //er
            for(int i=ec;i>=sc;i--){
                res.add(matrix[er][i]);
                count--;
            }
            er--;
            if(count==0)break;

            //sc
            for(int i=er;i>=sr;i--){
                res.add(matrix[i][sc]);
                count--;
            }
            sc++;
            if(count==0)break;

        }
        return res;
    }
}