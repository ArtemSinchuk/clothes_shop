package clothes_shop;

public class MainShop {
    public static void main(String[] args) {
      Shop shop = new Shop(10);
      ClothingAddingManager clothingManager = new ClothingAddingManager();

      ClothingAddingManager.addClothes(shop, clothingManager.c1, 
                                              clothingManager.c2,
                                              clothingManager.c3,
                                              clothingManager.c4,
                                              clothingManager.c5,
                                              clothingManager.c6,
                                              clothingManager.c7,
                                              clothingManager.c8,
                                              clothingManager.c9,
                                              clothingManager.c10,
                                              clothingManager.c11); // TODO: fix

      for (int i = 0; i < shop.getClothesLength(); i++) {
        System.out.println(shop.getClothing(i));
      }


    }
}
