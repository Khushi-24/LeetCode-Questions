package Questions;

public class SquRootUsingBinarySearch {

    public static void main(String[] args) {

        int x = 2147395599;
//        int x =253145;
//        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int ans = 1;
        if(x<2){
            return x;
        }else {
            int start =1;
            int end = x/2;
            while (start <= end){
                int mid = start + (end - start)/2;
                if(mid == x/mid){
                    ans = mid;
                    return ans;
                }
                if((mid) > x/mid){
//                    System.out.println(x/mid);

                   end = mid;
                }else {
                    ans =mid;
                    start = mid + 1;
                }
            }
            return ans;
        }

    }
}
