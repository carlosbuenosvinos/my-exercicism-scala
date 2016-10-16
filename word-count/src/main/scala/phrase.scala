class Phrase(val sentence: String) {
  def wordCount: Map[String, Int] = 
    sentence
      .toLowerCase
      .split("[^\\w']+")
      .foldLeft(Map[String, Int]())((m, w) => (m + (w -> (m.getOrElse(w, 0) + 1))))
}