package shopping;
// commas in type declaration list are multiple variables, NOT
// multiple constraints!!!!
//public class ClothingPair<E extends Object & Colored & Sized/*, String*/> extends Pair<E> {
public class ClothingPair<E extends Colored & Sized> extends Pair<E> {
//  private java.lang.String s = "Hello";
//  private Sized & Colored ss = null; // NO :(
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public /*<E, F, G>*/ boolean isMatched() {
//    E thing;
    return left.getColor().equals(right.getColor())
        && left.getSize() == right.getSize();
  }

  public static <E extends Colored & Sized> boolean match(E left, E right) {
    return left.getColor().equals(right.getColor())
        && left.getSize() == right.getSize();
  }
}
