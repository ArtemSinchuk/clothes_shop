package clothes_shop;

public class MainShop {
    public static void main(String[] args) {
      Shop shop = new Shop(10);
      ClothingAddingManager clothingManager = new ClothingAddingManager();

      shop.addClothing(clothingManager.c1);
      shop.addClothing(clothingManager.c2);
      shop.addClothing(clothingManager.c3);
      shop.addClothing(clothingManager.c4);
      shop.addClothing(clothingManager.c5);
      shop.addClothing(clothingManager.c6);
      shop.addClothing(clothingManager.c7);
      shop.addClothing(clothingManager.c8);
      shop.addClothing(clothingManager.c9);
      shop.addClothing(clothingManager.c10);
      shop.addClothing(clothingManager.c11);

      for (int i = 0; i < shop.getClothesLength(); i++) {
        System.out.println(shop.getClothes(i));
      }
    }
}
