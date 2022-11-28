package SearchingAlgorithm;

public class FindElementInMountain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 5, 4, 3, 2, 1, 0};
        int target = 0;
        int ans = 0;
//        int[] arr = {0, 2, 1, 0};
//        System.out.println(findPeakValue(arr));
        int peakValue = findPeakValue(arr);
        int firstHalf = returnIndex(arr, 0 , peakValue, target);
        if(firstHalf == -1){
            ans = returnSecondIndex(arr, peakValue, arr.length , target);
        }
        else {
            ans =firstHalf;
        }

        System.out.println(ans);
    }

    public static int returnSecondIndex(int arr[], int start, int end, int target){

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                end = mid - 1;
            }else if (arr[mid] > target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int returnIndex(int arr[], int start, int end, int target){

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPeakValue(int arr[]){

        int start = 0;
        int end = arr.length;

        while (start != end){
            int mid = start + (end -start)/2;

            if(arr[mid] > arr[mid +1]){
                end = mid;
            }else {
                start = mid +1 ;
            }
//
//            if (arr[mid] < arr[mid -1]){
//
//            }
        }
        return start;
    }
}
