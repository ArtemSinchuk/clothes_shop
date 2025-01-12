package clothes_shop.gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import clothes_shop.Customer;

public class CustomerGUI extends JFrame {
  private Customer customer;
  private JPanel pnlMainPanel;
  private JComboBox<String> comboType, comboSize, comboCost;
  private JLabel lblBalance;
  private String[] types;
  private String[] sizes;
  private double[] costs;

    public CustomerGUI() {
      initialization();
      configureFrame();
      configureComboBox();
      addComponents();
    }

    private void initialization() {
      types = new String[]{"-", "Shirt"};
      sizes = new String[]{"-", "XS", "S", "M", "L", "XL"};
      costs = new double[]{};
      customer = new Customer();
      comboType = new JComboBox<>(types);
      comboSize = new JComboBox<>(sizes);
      comboCost = new JComboBox<>();
      pnlMainPanel = new JPanel();
      lblBalance = new JLabel(customer.toString());
    }

    public void configureComboBox() {
      comboType.setLocation(150, 200);
      comboSize.setLocation(150, 250);
      comboCost.setLocation(150, 300);
    }

    public void addComponents() {
      add(pnlMainPanel);
      pnlMainPanel.add(comboType);
      pnlMainPanel.add(comboSize);
      pnlMainPanel.add(comboCost);
      pnlMainPanel.add(lblBalance);
    }

    public void configureFrame() {
      setTitle("Customer");
      setSize(500, 700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
    }
    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new CustomerGUI());
    }
}
