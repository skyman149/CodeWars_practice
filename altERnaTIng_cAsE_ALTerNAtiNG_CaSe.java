/*
Define String.prototype.toAlternatingCase (or a similar function/method such as 
to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; 
see the initial solution for details) such that each lowercase letter becomes 
uppercase and each uppercase letter becomes lowercase. 
*/

public class altERnaTIng_cAsE_ALTerNAtiNG_CaSe {
    public static String toAlternativeString(String string) {
      String str = "";
      for (int i = 0; i < string.length(); i++){
        if (string.charAt(i) == Character.toLowerCase(string.charAt(i))){
          str += Character.toUpperCase(string.charAt(i));
        }
        else {
          str += Character.toLowerCase(string.charAt(i));
        }
      }
      return str;
    }
  }