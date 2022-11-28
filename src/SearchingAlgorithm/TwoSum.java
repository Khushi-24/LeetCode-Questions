package SearchingAlgorithm;

public class TwoSum {

    public static void main(String[] args) {
//        int [] arr = {2,7,11,15};
//        int [] arr = {3,24,50,79,88,150,345};
//        int [] arr = {1,3,4,4};
        int[] arr = {-1,-1,-1,1,1};
        int target = 2;
        int [] arr2 = twoSum(arr,target);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }


    public static int[] twoSum(int[] numbers, int target) {

        for(int i=0; i<=numbers.length ; i++){

            int start = i+1;
             int end = numbers.length -1;
            int mid = 0;

            while(start <= end){
                mid = start +(end - start)/2;
                if(numbers[i] == target - numbers[mid] ){
                    return new int[]{i+1, mid+1};
                }else if(numbers[i] > target - numbers[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }

        }
        return new int[]{-1, -1};

    }
}
