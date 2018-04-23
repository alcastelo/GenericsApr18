package question;

public class Boot {
  public static void main(String[] args) {
    Bucket<ConstraintType> bc = new Bucket<>();
    bc.theConstraint = new ConstraintType();
    bc.showTest();
  }
}
