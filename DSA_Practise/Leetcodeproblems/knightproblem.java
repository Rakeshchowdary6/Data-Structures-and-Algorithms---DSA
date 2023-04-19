package DSA_Practise.Leetcodeproblems;

public class knightproblem {
    public static void main(String[] args) {
        int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(validchessforknight(grid));
    }
    static boolean validchessforknight(int[][] grid){
        int[][] offsets = new int[][]{
            {-2,1},
            {-1,2},
            {1,2},
            {2,1},
            {2,-1},
            {1,-2},
            {-1,-2},
            {-2,-1},
        };

        int n = grid.length;
        int currentvalue = 0;
        int x = 0 , y=0;
        boolean flag = false;
        while(currentvalue!=n*n-1){
            for(int[] ofs : offsets){
            int newX = x + ofs[0];
            int newY = y + ofs[1];
            if(newX>=0 && newX<n && newY>=0 && newY<n && currentvalue+1==grid[newX][newY]){
                currentvalue++;
                x=newX;
                y=newY;
                flag=true;
                break;
            }
        }
        if(!flag){
            return false;
        }
    }
    return true;
    }
}
