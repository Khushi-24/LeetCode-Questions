package SearchingAlgorithm;

public class CeilingOfaNumber {

    public static void main(String[] args) {
        int[] arr = {-18, -11, -1, 0, 22, 34, 35, 47, 52};
        int target = 15;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

}
