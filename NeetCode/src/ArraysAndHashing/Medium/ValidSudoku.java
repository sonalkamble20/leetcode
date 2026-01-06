package ArraysAndHashing.Medium;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] arr =
                {{'1','2','.','.','3','.','.','.','.'},
                 {'4','.','.','5','.','.','.','.','.'},
                 {'.','9','8','.','.','.','.','.','3'},
                 {'5','.','.','.','6','.','.','.','4'},
                 {'.','.','.','8','.','3','.','.','5'},
                 {'7','.','.','.','2','.','.','.','6'},
                 {'.','.','.','.','.','.','2','.','.'},
                 {'.','.','.','4','1','9','.','.','8'},
                 {'.','.','.','.','8','.','.','7','9'}};
        
        System.out.println(isValidSudoku(arr));
    }

    public static boolean isValidSudoku(char[][] board)
    {
        int n = board.length;

        Map<Integer, Integer> rmap = new HashMap<>();
        Map<Integer, Integer> cmap = new HashMap<>();

        Map<Integer, Integer> cube = new HashMap<>();

        int[][] temp = new int[3][3];

        //Each row must contain the digits 1-9 without duplicates.
        //Each column must contain the digits 1-9 without duplicates.
        for(int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                int remp = board[row][col];
                int cemp = board[col][row];

                if(remp == '.' || cemp == '.')
                    continue;

                if (!rmap.containsKey(remp))
                    rmap.put(remp, col);

                if (!cmap.containsKey(cemp))
                    cmap.put(cemp, col);

                else
                    return false;
            }
            rmap = new HashMap<>();
            cmap = new HashMap<>();
        }


        return true;
    }
}
