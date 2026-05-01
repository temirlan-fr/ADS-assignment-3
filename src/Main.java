import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        TASK-1:
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("First string:  ");
//        String word1 = scanner.nextLine();
//
//        System.out.print("Second string: ");
//        String word2 = scanner.nextLine();
//
//        if (AnagramCheck(word1, word2)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }



//        TASK-2
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Array size: ");
//        int n = scanner.nextInt();
//
//        int[] arr = new int[n];
//        System.out.print("Elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.print("k: ");
//        int k = scanner.nextInt();
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("K-th smallest element: " + arr[k - 1]);





//        TASK-3
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Array size: ");
//        int n = scanner.nextInt();
//
//        int[] arr = new int[n];
//        System.out.print("Elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//
//        if (n % 2 == 1) {
//            System.out.println("Median: " + arr[n / 2]);
//        } else {
//            double median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
//            System.out.println("Median: " + median);
//        }





//        TASK-4:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = scanner.nextInt();

        int[] weights = new int[n];
        System.out.print("Weights: ");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.print("Days: ");
        int days = scanner.nextInt();

        int result = binarySearch(weights, days);
        System.out.println("Minimum capacity: " + result);
    }

//    public static boolean AnagramCheck(String word1, String word2){
//        word1 = word1.toLowerCase().replace(" ","");
//        word2 = word2.toLowerCase().replace(" ","");
//
//        char[] arr1 = word1.toCharArray();
//        char[] arr2 = word2.toCharArray();
//
//        for (int i = 0; i < arr1.length - 1; i++) {
//            for (int j = 0; j < arr1.length - 1 - i; j++) {
//                if (arr1[j] > arr1[j + 1]) {
//                    char temp = arr1[j];
//                    arr1[j] = arr1[j + 1];
//                    arr1[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr2.length - 1; i++) {
//            for (int j = 0; j < arr2.length - 1 - i; j++) {
//                if (arr2[j] > arr2[j + 1]) {
//                    char temp = arr2[j];
//                    arr2[j] = arr2[j + 1];
//                    arr2[j + 1] = temp;
//                }
//            }
//        }
//
//        return Arrays.equals(arr1, arr2);
//    }


    public static int binarySearch(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > left) left = weights[i];
            right += weights[i];
        }

        while (left < right) {
            int mid = (left + right) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += weights[i];
        }

        return daysNeeded <= days;
    }
}
