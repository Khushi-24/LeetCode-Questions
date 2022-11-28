package SearchingAlgorithm;

public class RotatedArray {

    public static void main(String[] args) {

//        int[] arr = {4,5,6,7,8,9,10,0,1};
        int[] arr = {5,1,3};
        int target = 0;
//        int pivot = findLargestElement(arr);
//        int ans = simpleBinarySearch(arr,0, pivot, target);
//        if(ans == -1){
//            ans = simpleBinarySearch(arr, pivot +1, arr.length-1, target);
//        }
        System.out.println(search(arr, target));
    }

    private static int search(int[] nums, int target){
        int pivot = findLargestElement(nums);
        if (pivot == -1){
            return simpleBinarySearch(nums,0, nums.length -1, target);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return simpleBinarySearch(nums,0, pivot-1, target);
        }
        return simpleBinarySearch(nums, pivot+1, nums.length-1, target);
    }
    private static int findLargestElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int simpleBinarySearch(int[] arr, int start, int end, int target){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }
}
