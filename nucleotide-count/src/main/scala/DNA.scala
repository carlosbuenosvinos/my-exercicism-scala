class DNA(chain: String) {
  chain.map(checkChar)

  private def checkChar(c: Char): Char =
    if (!validChar(c)) throw new RuntimeException
    else c

  private def validChar(c: Char): Boolean =
    (c == 'A') || (c == 'T') || (c == 'C') || (c == 'G')

  def nucleotideCounts: Map[Char, Int] =
    chain.foldRight(
      Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)
    )((c, m) => m + (c -> (m(c) + 1)))

  def nucleotideCounts(nucleotide: String): Int =
    nucleotideCounts(
      checkChar(
        nucleotide.charAt(0)
      )
    )
}
