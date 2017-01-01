import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class WordCount {
  Map<String, Integer> wordCount;

  WordCount() {
    wordCount = new HashMap<>();
  }

  public Map<String, Integer> phrase(String phrase) {
    int count = 1;
    String[] wordArray = normalize(phrase.split("[\\p{Punct}\\s]+"));
    for (int i = 0; i < wordArray.length; i++) {
      if (wordCount.containsKey(wordArray[i])) {
        count = wordCount.get(wordArray[i]);
        wordCount.replace(wordArray[i], count + 1);
      } else {
        wordCount.put(wordArray[i], 1);
      }
    }
    return wordCount;
  }

  private String[] normalize(String[] wordArray) {
    for (int i = 0; i < wordArray.length; i++) {
      wordArray[i] = wordArray[i].toLowerCase();
    }
    return wordArray;
  }
}
