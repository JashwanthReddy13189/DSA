package ArraysProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = nums.length;
        //missingNumber(nums, n);
        //hashingApproach(nums, n);
        //optimalSumApproach(nums, n);
        optimalXORApproach(nums, n);
    }

    // Optimal Approach
    private static void optimalXORApproach(int[] nums, int n) {
        int XOR1 = 0, XOR2 = 0;
        for (int i = 0; i < n; i++) {
            XOR2 = XOR2 ^ nums[i];
            XOR1 = XOR1 ^ (i);
        }
        XOR1 = XOR1 ^ n;
        System.out.println(XOR1 ^ XOR2);
    }

    // Optimal Approach
    private static void optimalSumApproach(int[] nums, int n) {
        int sum = (n * (n + 1)) / 2;
        int sumOfArray = 0;
        for (int i = 0; i < n; i++) {
            sumOfArray += nums[i];
        }
        System.out.println(" Optimal Sum Approach - " + (sum - sumOfArray));
    }

    // Better Approach
    private static void hashingApproach(int[] nums, int n) {
        int[] hashTable = new int[n + 2];
        for (int i = 0; i < n; i++) {
            hashTable[nums[i]] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            if (hashTable[i] == 0) {
                System.out.println(" Hashing Approach - " + i);
            }
        }
    }

    // Brute Force Approach
    public static void missingNumber(int[] nums, int n) {
        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(" Brute Force - " + i);
                break;
            }
        }
    }
}
