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

  public void addClothing(Clothing clothes2) {
    if (currentCapacityInArray < clothes.length) {
        clothes[currentCapacityInArray] = clothes2;
        currentCapacityInArray++;
    } else {
      throw new ShopCapacityExceedException(
        String.format("No space to add more clothing. %d/%d", currentCapacityInArray, clothes.length)
        );
    }
  }

  public void addClothing(Clothing[] clothing) {
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
}
