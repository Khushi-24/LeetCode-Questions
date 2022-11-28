package SearchingAlgorithm;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2,1,1};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length -1;
        int mid = 0;
        if(nums.length == 1){
            return nums[0];
        }

        while(start <= end){

            mid = start + (end - start)/2;
            if(isEven(mid)){
                if((mid-1)>=0  && nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                }else{
                    if((mid+1) <= (nums.length - 1) && nums[mid] == nums[mid + 1]){
                        end = mid-1;
                    }else{
                        return mid;
                    }
                }
            }else{
                if((mid+1) <= (nums.length - 1) && nums[mid] == nums[mid + 1]){
                    start = mid + 1;
                }else{
                    if((mid-1)>=0  && nums[mid] == nums[mid - 1]){
                        end = mid - 1;
                    }else{
                        return nums[mid];
                    }
                }

            }
        }
        return -1;
    }

    public static boolean isEven(int mid){

        if((mid+1) % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
