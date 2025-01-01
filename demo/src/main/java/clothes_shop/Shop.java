package clothes_shop;

import java.util.Random;

import clothes_shop.Exceptions.ShopCapacityExceedException;
//ArrayList.add()
public class Shop {

  private Clothing[] clothes;
  private int totalCashDesk;
  private int freeCashDesk;
  private int currentCapacityInArray;
  private Random random = new Random();


  public Shop() {
    this.clothes = new Clothing[100];
    this.totalCashDesk = 10;
    this.freeCashDesk = random.nextInt(totalCashDesk) + 1;
    this.currentCapacityInArray = 0;
  }

  public Shop(int capacity) {
      this.clothes = new Clothing[capacity];
      this.totalCashDesk = 10;
      this.freeCashDesk = random.nextInt(totalCashDesk) + 1;
      this.currentCapacityInArray = 0;
  }

  public Clothing getClothes(int index) {
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
      return freeCashDesk;
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
}

