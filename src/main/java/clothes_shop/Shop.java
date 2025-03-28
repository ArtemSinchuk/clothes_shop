package clothes_shop;

import java.util.Random;
import clothes_shop.exceptions.ShopCapacityExceedException;

public class Shop {

  private Clothing[] clothes;
  private int totalCashDesk;
  private int freeCashDesk;
  private int currentCapacityInArray;
  private Random random = new Random();

  public Shop() {
    this.clothes = new Clothing[100];
    this.totalCashDesk = 10;
    this.freeCashDesk = getFreeCashDesk();
    this.currentCapacityInArray = 0;
  }

  public Shop(int capacity) {
      this.clothes = new Clothing[capacity];
      this.totalCashDesk = 10;
      this.freeCashDesk = getFreeCashDesk();
      this.currentCapacityInArray = 0;
  }

  public Clothing getClothing(int index) {
    if (index < 0){
      throw new IndexOutOfBoundsException("Index is negative.");
    }
    if (index > getClothesLength()) {
      throw new ShopCapacityExceedException("Index is out of bounds.");
    }
      return clothes[index];
  }

  public int getClothesLength() {
    return clothes.length;
  }

  public int getTotalCashDesk() {
      return totalCashDesk;
  }

  public void setTotalCashDesk(int totalCashDesk) {
      this.totalCashDesk = totalCashDesk;
  }

  public int getFreeCashDesk() {
    return random.nextInt(totalCashDesk) + 1;
  }
  
  public void setFreeCashDesk(int freeCashDesk) {
      this.freeCashDesk = freeCashDesk;
  }

  public int getCurrentCapacityInArray() {
    return currentCapacityInArray;
  }

  public void addClothing(Clothing clothing) {
    if (currentCapacityInArray < clothes.length) {
        clothes[currentCapacityInArray] = clothing;
        currentCapacityInArray++;
    } else {
      throw new ShopCapacityExceedException(
        String.format("No space to add more clothing. %d/%d", currentCapacityInArray, clothes.length)
        );
    }
  }

  public void addClothes(Clothing[] clothing) {
    for (int i = 0; i < clothing.length; i++) {
      if (currentCapacityInArray < clothes.length) {
        clothes[currentCapacityInArray] = clothing[i];
        currentCapacityInArray++;
      } else {
        throw new ShopCapacityExceedException(
          String.format("No space to add more clothing. %d/%d", currentCapacityInArray, clothes.length)
          );
        }
      }
  }

  public void addAllClothes(Shop shop, Clothing... clothes) {
    if (shop == null || clothes == null) {
      throw new IllegalArgumentException("Shop or clothes can not be null");
    }
    try {
      for (Clothing clothing : clothes) {
        shop.addClothing(clothing);
      }
    } catch (ShopCapacityExceedException e) {
      System.out.println("Cannot add more clothes: " + e.getMessage());
    }
  }

  public void getAllClothes() {
    for (Clothing clothing : clothes) {
      System.out.println(clothing);
    }
  }

  public void removeClothing(int index) { //TODO: finish

  }
}
