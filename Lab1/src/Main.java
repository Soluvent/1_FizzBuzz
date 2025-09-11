public class Main {
    public static void main(String[] args) {
        // 1
        int[] arr1 = {1, 2, 2, 3};
        System.out.print("isNonDecreasing: " + isNonDecreasing(arr1) + "\n");

        // 2
        fizzBuzz();

        // 3
        int[] arr2 = {1, 1, 1, 2, 1};
        System.out.print("canBalance: " + canBalance(arr2) + "\n");
    }

    private static boolean isNonDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz\n");
            } else {
                System.out.print(i + "\n");
            }
        }
    }

    private static boolean canBalance(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int j : arr) {
            leftSum += j;
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}
