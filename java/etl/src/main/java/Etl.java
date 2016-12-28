import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    Map<String, Integer> newMap = new HashMap<>();

    final Set<Map.Entry<Integer, List<String>>> entries = getEntriesSet(old);
    for (Map.Entry<Integer, List<String>> entry : entries) {
      for (String value : entry.getValue()) {
        newMap.put(value.toLowerCase(), entry.getKey());
      }
    }
    return newMap;
  }

  private Set<Map.Entry<Integer, List<String>>> getEntriesSet(Map<Integer, List<String>> old) {
    return old.entrySet();
  }
}

