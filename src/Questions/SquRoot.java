package Questions;

public class SquRoot {

    public static void main(String[] args) {

//        int x = 2147395600;
//        int x =253145;
        int x = 256;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int i = 1;
        if(x==1){
            return 1;
        }

        while (i*i <= x){
            System.out.println("Square of "+ i + " :" + i*i);
            i++;
        }
        return i-1;
    }
}
