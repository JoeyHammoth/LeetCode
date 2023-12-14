class Solution {
    public int islandPerimeter(int[][] grid) {
        int sqPer;
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                // Counted perimeter of each island
                sqPer = 0;

                if (grid[i][j] == 1) {

                    // Check if island is on the edge
                    if (j == 0) {
                        sqPer++;
                    }
                    if (j == grid[i].length - 1) {
                        sqPer++;
                    }
                    if (i == 0) {
                        sqPer++;
                    }
                    if (i == grid.length - 1) {
                        sqPer++;
                    }

                    // Check left of island
                    if (j - 1 >= 0) {
                        if (grid[i][j-1] == 0) {
                            sqPer++;
                        }
                    }
                    // Check top of island
                    if (i - 1 >= 0) {
                        if (grid[i-1][j] == 0) {
                            sqPer++;
                        }
                    }
                    // Check right of island
                    if (j + 1 < grid[i].length) {
                        if (grid[i][j+1] == 0) {
                            sqPer++;
                        }
                    }
                    // Check bottom of island
                    if (i + 1 < grid.length) {
                        if (grid[i+1][j] == 0) {
                            sqPer++;
                        }
                    }
                }
                result += sqPer;
            }
        }
        return result;
    }
}