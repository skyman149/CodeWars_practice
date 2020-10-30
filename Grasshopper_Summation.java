public class Grasshopper_Summation {
    public static int summation(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

//    public static void main(String[] args) {
//
//        int x = summation(2);
//        int y = summation(8);
//
//        System.out.println(x); // 3
//        System.out.println(y); // 36
//    }
}
