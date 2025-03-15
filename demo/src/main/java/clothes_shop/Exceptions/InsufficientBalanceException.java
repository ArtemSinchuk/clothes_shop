package clothes_shop.exceptions;

public class InsufficientBalanceException extends Exception {
  
  public InsufficientBalanceException(String message) {
      super(message);
  }
}