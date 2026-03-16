import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                set.add(grid[i][j]); // size 0 rhombus

                for(int size=1; i+2*size<n && j-size>=0 && j+size<m; size++){

                    int sum = 0;

                    int r = i;
                    int c = j;

                    // down-left
                    for(int k=0;k<size;k++){
                        sum += grid[r+k][c-k];
                    }

                    // down-right
                    for(int k=0;k<size;k++){
                        sum += grid[r+size+k][c-size+k];
                    }

                    // up-right
                    for(int k=0;k<size;k++){
                        sum += grid[r+2*size-k][c+k];
                    }

                    // up-left
                    for(int k=0;k<size;k++){
                        sum += grid[r+size-k][c+size-k];
                    }

                    set.add(sum);
                }
            }
        }

        int k = Math.min(3, set.size());
        int[] ans = new int[k];

        int idx = 0;
        for(int val : set){
            if(idx==k) break;
            ans[idx++] = val;
        }

        return ans;
    }
}