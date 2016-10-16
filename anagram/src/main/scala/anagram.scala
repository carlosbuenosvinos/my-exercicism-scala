class Anagram(val sentence: String) {
  def matches(words: Seq[String]): Seq[String] = 
    words
      .filter(
        w => w.toLowerCase.sorted == sentence.toLowerCase.sorted && w.toLowerCase != sentence.toLowerCase)
      .distinct
  }
}
