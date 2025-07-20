public class floodfill {
    public static void floodFill(int[][] grid, int r, int c, int newColor, int origColor) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != origColor) {
            return;
        }
        grid[r][c] = newColor;
        floodFill(grid, r + 1, c, newColor, origColor);
        floodFill(grid, r - 1, c, newColor, origColor);
        floodFill(grid, r, c + 1, newColor, origColor);
        floodFill(grid, r, c - 1, newColor, origColor);
    }
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        floodFill(grid, 1, 1, 2, grid[1][1]);
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}



