object Pangrams {
  def isPangram(sentence: String): Boolean = {
    sentence
      .toLowerCase
      .toSet
      .filter(c => c >= 'a' && c <= 'z')
      .equals('a' to 'z' toSet)
  }
}