package SearchingAlgorithm;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 7, 14, 14, 21, 21, 21};
        int target = 7;
        int[] ans = {-1,-1};

        ans[0] = searchPosition(arr, target, true);
        ans[1] = searchPosition(arr, target, false);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    private static int searchPosition(int[] arr, int target, boolean findFirstPosition) {

        int start = 0;
        int end = arr.length -1;
        int ans = -1;


        while (start <= end){

            int mid = start +(end-start)/2;
            if(arr[mid] < target){
                start = mid +1 ;
            }else if(arr[mid] > target){
                end = mid -1 ;
            }else {
                ans = mid;

                if(findFirstPosition){
                    end = mid -1 ;
                }else {
                    start = mid +1;
                }
            }
        }
        return ans;

    }


}
