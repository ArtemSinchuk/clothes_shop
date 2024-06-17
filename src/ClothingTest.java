public class ClothingTest {
  public static void main(String[] args) {
  Clothing c1 = new Clothing("T-shirt", "M", 12.99, 12);
  Clothing c2 = new Clothing("Shirt", "M", 25.99, 10);
  Clothing c3 = new Clothing("Pants", "L", 49.99, 5);
  Clothing c4 = new Clothing("Jacket", "S", 79.99, 3);
  Clothing c5 = new Clothing("Dress", "M", 39.99, 7);
  Clothing c6 = new Clothing("Sweater", "XL", 59.99, 4);
  Clothing c7 = new Clothing("Skirt", "S", 34.99, 6);
  Clothing c8 = new Clothing("Shorts", "M", 29.99, 8);
  Clothing c9 = new Clothing("Blouse", "L", 24.99, 9);
  Clothing c10 = new Clothing("Socks", "S", 9.99, 20);

  Shop shop = new Shop(new Clothing[100], 0, 0);
  shop.getClothes()[0] = c1;
  shop.getClothes()[1] = c2;
  shop.getClothes()[2] = c3;
  shop.getClothes()[3] = c4;
  shop.getClothes()[4] = c5;
  shop.getClothes()[5] = c6;
  shop.getClothes()[6] = c7;
  shop.getClothes()[7] = c8;
  shop.getClothes()[8] = c9;
  shop.getClothes()[9] = c10;
  for (int i = 0; i < 10; i++) {
    System.out.println(shop.getClothes()[i]);
  }
  }
}
