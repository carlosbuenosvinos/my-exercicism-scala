class Bob
{
  def hey(s: String) = {
    if (isShouting(s)) "Whoa, chill out!"
    else if (isInSilence(s)) "Fine. Be that way!"
    else if (isAsking(s)) "Sure."
    else "Whatever."
  }

  private def isShouting(s: String): Boolean =
    isUpperCase(s) && containsLetters(s)

  private def isUpperCase(s: String): Boolean =
    s == s.toUpperCase

  private def containsLetters(s: String): Boolean =
    s.exists(_.isLetter)

  private def isInSilence(s: String): Boolean =
    s.trim.isEmpty

  private def isAsking(s: String): Boolean = 
    s.endsWith("?")
}