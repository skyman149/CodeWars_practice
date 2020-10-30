public class Get_the_mean_of_an_array {
    
    public static int getAverage(int[] marks){
    
        int res = 0;
        
        for(int i = 0; i < marks.length; i++){
          res += marks[i];
        }
        
        return res / marks.length;
      }
}
