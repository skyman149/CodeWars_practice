import java.util.Arrays;

public class Invert_values {
    public static int[] invert(int[] array) {
    
        int[] result = new int[array.length]; // new array with same length as "array"
        for (int i = 0; i<array.length; i++){
          result[i] = -array[i];// * -1;
        }
        return result;
      }
      public static void main (String[] args){
        System.out.println(Arrays.toString(invert(new int[]{1,2,3,4,5}))); // [-1, -2, -3, -4, -5]
        System.out.println(Arrays.toString(invert(new int[]{-1,-2,-3,-4,-5}))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(invert(new int[]{0}))); // [0]
      }
}
