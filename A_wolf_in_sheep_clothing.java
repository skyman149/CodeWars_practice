public class A_wolf_in_sheep_clothing {
    public static String warnTheSheep(String[] array) {
        for (int i = 0; i < array.length; i++){
            if(array[i].equals("wolf")){
                if(i == array.length-1){
                    return "Pls go away and stop eating my sheep";
                } else {
                    return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
                }
            }
        }
        return null;
      }
      public static void main (String[] args){
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"})); // "Oi! Sheep number 1! You are about to be eaten by a wolf!"
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"})); // "Pls go away and stop eating my sheep"
      }
}
