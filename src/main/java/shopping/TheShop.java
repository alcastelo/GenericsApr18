package shopping;

public class TheShop {
  public static void main(String[] args) {
    Pair<String> pst = new Pair<>("Hello", "Bonjour");

    ClothingPair<Shoe> ps = new ClothingPair<>(
        new Shoe(44, "Black"), new Shoe(44, "Brown"));

    ClothingPair<Glove> pg = new ClothingPair<>(
        new Glove(8, "Green"), new Glove(7, "Green"));

    ClothingPair<Glove> pg1 = new ClothingPair<>(
        new Glove(7, "Green"), new Glove(7, "Green"));

    System.out.println("shoes match? " + ps.isMatched()); // ??? <= No, the colors differ...
    System.out.println("gloves match? " + pg.isMatched()); // ??? <= No, the sizes differ...
    System.out.println("other gloves match? " + pg1.isMatched()); // ??? <= No, the sizes differ...
  }
}
