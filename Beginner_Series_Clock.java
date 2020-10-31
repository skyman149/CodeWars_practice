public class Beginner_Series_Clock {
    public static int Past(int h, int m, int s) {
        return (h * 3600 + m * 60 + s) * 1000;
        // return -> miliseconds
      }
      public static void main (String[] args){
        System.out.println(Past(0, 1, 1)); // 61000
      }
}
