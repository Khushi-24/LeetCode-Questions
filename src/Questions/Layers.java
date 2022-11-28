package Questions;

public class Layers {

    public static void main(String[] args) {
         int n = 6;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        if(n<=2){
            return 1;
        }else{
            int temp = 1;
            int sum = 1;
            int count = -1;
            while(temp <= n){
                temp = sum;
                sum = sum + 1;
                temp = temp + sum;
                count = count + 1;
            }
            return count;
        }
    }
}
