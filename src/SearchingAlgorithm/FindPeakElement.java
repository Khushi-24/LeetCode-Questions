package SearchingAlgorithm;

public class FindPeakElement {

    public static void main(String[] args) {

//        int[] arr = {0, 1, 2, 6, 5, 4, 3, 2, 1, 0};
        int[] arr = {4,5,6,7,0,1,2};

//        int[] arr = {0, 2, 1, 0};
        System.out.println(findPeakValue(arr));
    }


    public static int findPeakValue(int arr[]){

        int start = 0;
        int end = arr.length - 1;

        while (start != end){
            int mid = start + (end -start)/2;

            if(mid< end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                 end = mid -1;
            }
            else {
                start = mid +1;
            }

        }
        return -1;
    }
}
