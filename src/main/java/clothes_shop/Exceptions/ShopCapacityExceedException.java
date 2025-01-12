package clothes_shop.exceptions;

public class ShopCapacityExceedException extends RuntimeException {
  
  public ShopCapacityExceedException(String message) {
    super(message);
  }
}
