public class Triple_Trouble {
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for(int i = 0; i < one.length(); i++){
          result += one.charAt(i);
          result += two.charAt(i);
          result += three.charAt(i);
        }
        return result;
      }
}
