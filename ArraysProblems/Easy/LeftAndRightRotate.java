package ArraysProblems.Easy;

import java.util.*;

public class LeftAndRightRotate {
    public static void main(String[] args) {
        int[] bfArr = {8, 10, 5, 7, 9};
        int[] oaArr = {1, 2, 3, 4, 5, 6, 7};
        int bfLength = bfArr.length;
        int oaLength = oaArr.length;
        int k = 3;

        rotateToLeft(bfArr, bfLength, k);
        rotateToRight(oaArr, oaLength, k);

    }

    private static void rotateToRight(int[] oaArr, int oaLength, int k) {
        // Optimal Approach Right Rotate
        int last = oaArr[oaLength - 1];
        for (int i = 0; i < k; i++) {
            for (int j = oaLength - 1; j > 0; j--) {
                oaArr[j] = oaArr[j - 1];
            }
            oaArr[0] = last;
            last = oaArr[oaLength - 1];
        }
        System.out.println(Arrays.toString(oaArr));
    }

    private static void rotateToLeft(int[] arr, int bfLength, int k) {
        k = k % bfLength;
        System.out.println(k);
        // BruteForce Approach
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < bfLength; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = bfLength - k; i < bfLength; i++) {
            arr[i] = temp[i - (bfLength - k)];
        }
        System.out.println(Arrays.toString(arr));

        // Optimal Approach Left Rotate
        int first = arr[0];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < bfLength - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[bfLength - 1] = first;
            first = arr[0];
        }
        System.out.println(Arrays.toString(arr));
    }
}
