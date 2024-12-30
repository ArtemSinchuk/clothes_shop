package clothes_shop;

public class MainShop {
    public static void main(String[] args) {
      Shop shop = new Shop(10);
  
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

      
      shop.addClothing(c1);
      shop.addClothing(c2);
      shop.addClothing(c3);
      shop.addClothing(c4);
      shop.addClothing(c5);
      shop.addClothing(c6);
      shop.addClothing(c7);
      shop.addClothing(c8);
      shop.addClothing(c9);
      shop.addClothing(c10);

      for (int i = 0; i < shop.clothesLength(); i++) {
        System.out.println(shop.getClothes(i));
      }
    }
}
