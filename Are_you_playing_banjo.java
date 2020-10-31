public class Are_you_playing_banjo {
    public static String areYouPlayingBanjo(String name) {
        String result;
        if(name.toLowerCase().charAt(0) == 'r'){
            result = name + " plays banjo";
        } else {
            result = name + " does not play banjo";
        }
        return result;
      }
      public static void main (String[] args){
        System.out.println(areYouPlayingBanjo("Martin")); // false
        System.out.println(areYouPlayingBanjo("Rickie")); // true
      }
}

/*
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings.
*/
