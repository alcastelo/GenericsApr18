package question;

public class Bucket<B extends ConstraintType> {
  B theConstraint;
  public void showTest() {
    System.out.println("Constraint says " + theConstraint.tryIt());
  }
}
