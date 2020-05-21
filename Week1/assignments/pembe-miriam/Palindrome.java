public class Palindrome {

  // Function that checks if sting is a palindrome
  static boolean isPalindrome(String string)
  {

    // Pointers pointing to the beginning
    // and the end of the string
    int i = 0, j = string.length() - 1;

    while (i < j) {

      // If there is a mismatch
      if (string.charAt(i) != string.charAt(j))
        return false;

      // Increment first pointer and
      // decrement the other
      i++;
      j--;
    }

    // Given string is a palindrome
    return true;
  }

  public static void main(String[] args)
  {
    String string = "mom";

    if (isPalindrome(string))
      System.out.print("true");
    else
      System.out.print("false");
  }
}