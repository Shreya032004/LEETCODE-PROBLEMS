class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        double maxDiag=0;
        int maxArea=0;

        for(int[] rect:dimensions){
            int l=rect[0];
            int w=rect[1];
            double d=Math.sqrt(l*l+w*w);
            int area=l*w;
            if(d>maxDiag){
                maxDiag=d;
                maxArea=area;
            }else if(d==maxDiag){
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}