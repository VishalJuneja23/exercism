import java.util.HashMap;
import java.util.Map;

public class DNA {
  private String dna;
  Map<Character, Integer> nuceotideCount;

  public DNA(String dna) {
    this.dna = dna;
    nuceotideCount = new HashMap<>();
    nuceotideCount.put('A', 0);
    nuceotideCount.put('C', 0);
    nuceotideCount.put('G', 0);
    nuceotideCount.put('T', 0);
    computeNucleotideCount();
  }

  public int count(char nucleotide) throws IllegalArgumentException {
    if (nucleotideCounts().containsKey(nucleotide)) {
      return nucleotideCounts().get(nucleotide);
    }
    throw new IllegalArgumentException();
  }

  public Map<Character, Integer> nucleotideCounts() {
    return nuceotideCount;
  }

  private void computeNucleotideCount() {
    char[] dnaArray = this.dna.toCharArray();
    for (int i = 0; i < dnaArray.length; i++) {
      int count = nuceotideCount.get(dnaArray[i]);
      nuceotideCount.replace(dnaArray[i], count + 1);
    }
  }

}
