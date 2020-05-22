public class Staircase {

  public static void main(String[] args) {
    int number = 4;

    for (int i = 1; i <= number; i++) {
      for (int k = number; k > i; k--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("#");
      }
      System.out.println();
    }

  }

}
