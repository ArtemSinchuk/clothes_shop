public class Shop {
  
  private Clothing[] clothes;
  private int totalCashDesk;
  private int freeCashDesk;

  public Shop(){
  Clothing[] clothings = null;
  int toalCashDesk = 0;
  int freeCashDesk = 0;
  }

  public Shop(Clothing[] clothings, int totalCashDesk, int freeCashDesk) {
    this.clothes = new Clothing[100];
    this.totalCashDesk = totalCashDesk;
    this.freeCashDesk = freeCashDesk;
  }
  public Clothing[] getClothes() {
    return clothes;
  }
  public void setClothes(Clothing[] clothes) {
    this.clothes = clothes;
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
  
}
