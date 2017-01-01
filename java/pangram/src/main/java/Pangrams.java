import java.util.Map;

public class Pangrams {


  public static boolean isPangram(String sentence) {
    sentence = sentence.replaceAll("[^a-zA-Z]", ""); // replace everything that is not between A-Za-z
    sentence = sentence.toLowerCase();
    sentence = sentence.replaceAll("(.)(?=.*\\1)", ""); // replace duplicate characters.
    if (sentence.length() == 26)
      return true;
    return false;
  }
}