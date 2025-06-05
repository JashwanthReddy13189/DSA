package CodingNinjas;

public class ArraySortedCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 12, 7, 46, 87, 6};
        System.out.println(sortedCheck(arr, arr.length));
        System.out.println(sortedCheck(arr2, arr2.length));
    }

    private static boolean sortedCheck(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
