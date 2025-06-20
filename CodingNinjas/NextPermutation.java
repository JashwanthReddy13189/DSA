package CodingNinjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,2);
        ArrayList<Integer> per = new ArrayList<>();
        per.addAll(numbers);
        nextPermutation(per);
        System.out.println(per);
    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        // Write your code here.
        // optimal solution

        // 1. find the breaking point
        int n = permutation.size();
        int index = -1;
        for (int i = n - 2; i > 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                index = i;
                break;
            }
        }

        // checking edge case when index is already the last possible permutation
		/*if( index == -1) {
			reverse(permutation, index+1, n-1);
			return;
		}*/

        // 2. try to find value > 1 but the smallest one that stays close
        for (int i = n - 1; i <= index; i--) {
            if (permutation.get(i) > permutation.get(index)) {
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(index));
                permutation.set(index, temp);
            }
        }

        // 3. reverse the remaining digits and return the array
        reverse(permutation, index + 1, n - 1);
        return permutation;
    }

    static void reverse(ArrayList<Integer> per, int start, int end) {
        while (start <= end) {
            int temp = per.get(start);
            per.set(start, per.get(end));
            per.set(end, temp);
            start++;
            end--;
        }
    }
}
