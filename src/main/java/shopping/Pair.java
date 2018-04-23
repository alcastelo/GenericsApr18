package shopping;

public class Pair<F> {
  F left;
  F right;

  public Pair(F left, F right) {
    this.left = left;
    this.right = right;
  }

  public F getLeft() {
    return left;
  }

  public void setLeft(F left) {
    this.left = left;
  }

  public F getRight() {
    return right;
  }

  public void setRight(F right) {
    this.right = right;
  }

//  public boolean isMatched() {
////    if (left instanceof Colored)...
//    return left.getColor().equals(right.getColor());
//  }

  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
