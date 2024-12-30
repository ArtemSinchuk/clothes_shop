package clothes_shop;

import java.util.Arrays;
import java.util.Random;

public class Shop {

  private Clothing[] clothes;
  private int totalCashDesk;
  private int freeCashDesk;
  private int nextIndex;
  private Random random = new Random();


  public Shop() {
    this.clothes = new Clothing[100];
    this.totalCashDesk = 10;
    this.freeCashDesk = random.nextInt(totalCashDesk) + 1;
    this.nextIndex = 0;
  }

  public Shop(int capacity) {
      this.clothes = new Clothing[capacity];
      this.totalCashDesk = 10;
      this.freeCashDesk = random.nextInt(11);
      this.nextIndex = 0;
  }

  public Clothing getClothes(int index) {
      return clothes[index];
  }

  public int clothesLength() {
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

  public int getNextIndex() {
    return nextIndex;
  }

  public void addClothing(Clothing clothing) {
    if (nextIndex < clothes.length) {
        clothes[nextIndex] = clothing;
        nextIndex++;
    } else {
        System.out.printf("No space to add more clothing. %d/%d", nextIndex, clothes.length);
    }
  }
}

