import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Customer extends JFrame {
  JPanel panel = new JPanel();
  private JComboBox<String> comboType;
  private JComboBox<String> comboSize;
  private JComboBox<String> comboCost;

  public Customer() {
    this.setTitle("Customer");
    this.setBounds(500, 500, 250, 150);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
