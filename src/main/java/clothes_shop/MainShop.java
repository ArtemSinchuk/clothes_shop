package clothes_shop;

public class MainShop {
    public static void main(String[] args) {
      Shop shop = new Shop(10);

      shop.addAllClothes(shop, Clothes.c1, 
                               Clothes.c2,
                               Clothes.c3,
                               Clothes.c4,
                               Clothes.c5,
                               Clothes.c6,
                               Clothes.c7,
                               Clothes.c8,
                               Clothes.c9,
                               Clothes.c10,
                               Clothes.c11);

      for (int i = 0; i < shop.getClothesLength(); i++) {
        System.out.println(shop.getClothing(i));
      }
    }
}
