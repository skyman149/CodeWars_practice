public class Square_Sum {
    public static int squareSum(int[] n)
  { 
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
        sum += n[i] * n[i];
    }
    return sum;
  }
    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1,2,2})); // 9
        System.out.println(squareSum(new int[] {1,2})); // 5
    }
}


// OR

/*
public class Square_Sum {
    public static int squareSum(int[] n)
  { 
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
        sum += Math.pow(n[i], 2);
    }
    return sum;
  }
}
*/