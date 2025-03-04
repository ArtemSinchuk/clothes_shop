
package clothes_shop;

import clothes_shop.exceptions.ShopCapacityExceedException;

public class ClothingAddingManager {
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
  Clothing c11 = new Clothing("Socks", "S", 9.99, 21);

  public static void addClothing(Shop shop, Clothing clothing) {
    
    try {
      shop.addClothing(clothing);
    } catch (ShopCapacityExceedException e) {
      System.out.println("Cannot add more clothes: " + e.getMessage());
    }
  }

  public static void addAllClothes(Shop shop, Clothing... clothes) {
    try {
      for (Clothing clothing : clothes) {
        shop.addClothing(clothing);
      }
    } catch (ShopCapacityExceedException e) {
      System.out.println("Cannot add more clothes: " + e.getMessage());
    }
  }
}
