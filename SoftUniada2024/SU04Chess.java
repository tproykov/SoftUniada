package SoftUniada2024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SU04Chess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chessboardSize = Integer.parseInt(scanner.nextLine());
        int startRow = Integer.parseInt(scanner.nextLine());
        int startColumn = Integer.parseInt(scanner.nextLine());
        int endRow = Integer.parseInt(scanner.nextLine());
        int endColumn = Integer.parseInt(scanner.nextLine());

        // call the Breadth-First Search (BFS) function
        int minKnightMoves = minKnightMoves(chessboardSize, startRow, startColumn, endRow, endColumn);

        System.out.println(minKnightMoves);
    }

    // define knight moves
    private static final int[] rowMoves = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static final int[] columnMoves = {-1, 1, -2, 2, -2, 2, -1, 1};

    // check if the position is valid (within the chess board)
    private static boolean isValidPosition(int row, int column, int chessboardSize) {
        return (row >= 0 && row < chessboardSize && column >= 0 && column < chessboardSize);
    }

    //find the minimum moves for the knight to reach the target
    private static int minKnightMoves(int chessboardSize, int startRow, int startColumn,
                                      int endRow, int endColumn) {

        // check first if start and end positions are the same
        if (startRow == endRow && startColumn == endColumn) {
            return 0;
        }

        // create a queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[chessboardSize][chessboardSize];
        queue.add(new int[]{startRow, startColumn, 0}); // {row, column, moves}
        visited[startRow][startColumn] = true;

        // BFS loop
        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            int currentRow = current[0];
            int currentColumn = current[1];
            int moves = current[2];

            // check all possible knight moves
            for (int i = 0; i < 8; i++) {      // the knight has 8 potential moves
                int nextRow = currentRow + rowMoves[i];
                int nextColumn = currentColumn + columnMoves[i];

                if (isValidPosition(nextRow, nextColumn, chessboardSize) && !visited[nextRow][nextColumn]) {

                    // if the knight reaches the target
                    if (nextRow == endRow && nextColumn == endColumn) {
                        return moves + 1;
                    }

                    // add the new position to the queue and mark as visited
                    queue.add(new int[]{nextRow, nextColumn, moves + 1});
                    visited[nextRow][nextColumn] = true;
                }
            }
        }
        return -1;    // if no solution is found
    }
}