public class Hamming {
  public static int compute(String dna1, String dna2) throws IllegalArgumentException {
    if (dna1.length() != dna2.length()) {
      throw new IllegalArgumentException();
    }
    int difference = 0;
    char[] dna1CharactersArray = dna1.toCharArray();
    char[] dna2CharactersArray = dna2.toCharArray();
    for (int i = 0; i < dna1CharactersArray.length; i++) {
      if (dna1CharactersArray[i] != dna2CharactersArray[i]) {
        difference += 1;
      }
    }
    return difference;
  }
}
