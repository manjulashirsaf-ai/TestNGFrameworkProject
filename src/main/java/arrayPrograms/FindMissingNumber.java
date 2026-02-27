package arrayPrograms;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // Total numbers should be n

        int totalSum = n * (n + 1) / 2; // Sum of 1..n
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        int missing = totalSum - arrSum;
        System.out.println("Missing number = " + missing);
    }
}