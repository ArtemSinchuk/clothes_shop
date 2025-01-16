package clothes_shop.exceptions;

public class TextFieldEmptyException extends RuntimeException {
  public TextFieldEmptyException(String message) {
    super(message);
  }
}
