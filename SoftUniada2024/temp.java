package SoftUniada2024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();   // Chessboard size
        int R = scanner.nextInt();   // Knight starting row
        int C = scanner.nextInt();   // Knight starting column
        int T = scanner.nextInt();   // Target row
        int F = scanner.nextInt();   // Target column

        // Call the BFS function to find the minimum knight moves
        int result = minKnightMoves(N, R, C, T, F);

        // Output the result
        System.out.println(result);
    }

    // Possible knight moves in terms of row and column changes
    static int[] rowMoves = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] colMoves = {-1, 1, -2, 2, -2, 2, -1, 1};

    // Method to check if a position is within the chessboard boundaries
    static boolean isValid(int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    // BFS to find the minimum moves for the knight to reach the target
    static int minKnightMoves(int N, int startR, int startC, int targetR, int targetC) {
        // If starting and target positions are the same
        if (startR == targetR && startC == targetC) {
            return 0;
        }

        // Create a queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.add(new int[]{startR, startC, 0}); // {row, column, moves}
        visited[startR][startC] = true;

        // BFS loop
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curR = current[0];
            int curC = current[1];
            int moves = current[2];

            // Check all possible knight moves
            for (int i = 0; i < 8; i++) {
                int newRow = curR + rowMoves[i];
                int newCol = curC + colMoves[i];

                if (isValid(newRow, newCol, N) && !visited[newRow][newCol]) {
                    // If the knight reaches the target
                    if (newRow == targetR && newCol == targetC) {
                        return moves + 1;
                    }

                    // Add the new position to the queue and mark as visited
                    queue.add(new int[]{newRow, newCol, moves + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }
        return -1; // If no solution is found
    }
}