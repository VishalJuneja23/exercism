public class Acronym {

  public static String generate(String phrase) {
    phrase = phrase.replaceAll("-"," ");
    String phraseArray[] = phrase.split(" ");
    StringBuilder acronym = new StringBuilder();
    for(int i=0 ; i< phraseArray.length; i++) {
      acronym.append(phraseArray[i].toCharArray()[0]);
    }
     return acronym.toString().toUpperCase();
  }
}