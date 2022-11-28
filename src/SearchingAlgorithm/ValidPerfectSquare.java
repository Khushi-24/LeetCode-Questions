package SearchingAlgorithm;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPerfectSquare(5));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num/2;
        int mid = 0;
        if(num<2){
            return true;
        }
        while(start<= end){
            mid = start + (end-start)/2;
            if((float) mid ==((float)num/(float)mid)){
                return true;
            }else if(mid < ((float)num/(float)mid)){
                start = mid +1;
            }else{
                end= mid -1;
            }

        }
        return false;
    }
}
