package org.bturos.project_euler.utils

import scala.annotation.tailrec

class PalindromeFinder {
  def isPalindrome(text: String): Boolean = cutAndCompare(text)

  @tailrec
  private def cutAndCompare(text: String): Boolean = {
    if (text.length < 2) true
    else if (text(0) != text(text.length - 1)) false
    else cutAndCompare(text.substring(1, text.length - 1))
  }
}
