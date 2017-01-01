import java.util.*;

public class Anagram {
  private String storedWord;

  public Anagram(String word) {
    storedWord = word;
  }

  public List<String> match(List<String> listOfWords) {
    List<String> matchingWords = new ArrayList<>();
    for (String word : listOfWords) {
      if (!(storedWord.equalsIgnoreCase(word)) && isAnagram(storedWord.toLowerCase(), word.toLowerCase())) {
        matchingWords.add(word);
      }
    }
    return matchingWords;
  }

  private boolean isAnagram(String word1, String word2) {
    char[] storedWordCharacterArray = word1.toCharArray();
    char[] wordCharacterArray = word2.toCharArray();
    Arrays.sort(wordCharacterArray);
    Arrays.sort(storedWordCharacterArray);
    return Arrays.equals(storedWordCharacterArray, wordCharacterArray);
  }
}