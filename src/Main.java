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


        Scanner scanner = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("k: ");
        int k = scanner.nextInt();

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("K-th smallest element: " + arr[k - 1]);
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

}