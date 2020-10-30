public class School{

    public static int getAverage(int[] marks){
   
   int res = 0;
   
   for(int i = 0; i < marks.length; i++){
     res += marks[i];
   }
   
       return res / marks.length;
   }

}