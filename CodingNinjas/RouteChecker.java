package CodingNinjas;

import java.util.Scanner;

public class RouteChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Length of instruction string
            String str = sc.next(); // Instruction string

            String result = isPossible(str, n);
            System.out.println(result);
        }

        sc.close();
    }

    public static String isPossible(String str, int n) {
        // Starting position and direction
        int x = 0, y = 0;
        int direction = 0; // 0=North, 1=East, 2=South, 3=West

        // Direction vectors: North, East, South, West
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        // Execute the instruction sequence once
        for (char c : str.toCharArray()) {
            if (c == 'L') {
                direction = (direction + 3) % 4; // Turn left (subtract 1, mod 4)
            } else if (c == 'R') {
                direction = (direction + 1) % 4; // Turn right (add 1, mod 4)
            } else if (c == 'G') {
                x += dx[direction];
                y += dy[direction];
            }
        }

        // After one execution, Alex is at (x, y) facing direction

        // Case 1: Already back at origin
        if (x == 0 && y == 0) {
            return "True";
        }

        // Case 2: If Alex is facing the same direction as start (North)
        // and not at origin, he will keep moving away
        if (direction == 0) {
            return "False";
        }

        // Case 3: If Alex is not facing North, then after repeating the sequence
        // multiple times, his direction will cycle. We need to check if during
        // this cycle, he can reach origin.

        // The key insight: if after one execution Alex moves by (x,y) and
        // changes direction, then after 4 executions his direction will be
        // the same as start. The total displacement after 4 executions will be
        // the sum of displacements in 4 different orientations.

        // Let's simulate up to 4 iterations to see if we can reach origin
        int currX = x, currY = y, currDir = direction;

        for (int i = 1; i < 4; i++) {
            // Execute the sequence again
            for (char c : str.toCharArray()) {
                if (c == 'L') {
                    currDir = (currDir + 3) % 4;
                } else if (c == 'R') {
                    currDir = (currDir + 1) % 4;
                } else if (c == 'G') {
                    currX += dx[currDir];
                    currY += dy[currDir];
                }
            }

            // Check if we're back at origin
            if (currX == 0 && currY == 0) {
                return "True";
            }
        }

        // If after 4 iterations we're not at origin and facing original direction,
        // we'll never reach origin
        return "False";
    }
}
