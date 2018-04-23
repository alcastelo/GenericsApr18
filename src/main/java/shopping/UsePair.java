package shopping;

import java.time.LocalDate;

public class UsePair {
  public static void main(String[] args) {
//    Pair<String> p = new Pair<>("Hello", LocalDate.now());
    Pair<String> p = new Pair<>("Hello", "Bonjour");
    System.out.println("left is " + p.getLeft());
  }
}
