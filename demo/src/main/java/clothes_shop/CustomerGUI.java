package clothes_shop;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CustomerGUI extends JFrame {
  private Customer customer;
  private JPanel pnlMainPanel;
  private JComboBox<String> comboType, comboSize, comboCost;
  private JLabel lblBalance;

    public CustomerGUI() {
      initialization();
      configureFrame();
      configureComboBox();
      addComponents();
    }

    private void initialization() {
      comboType = new JComboBox<>();
      comboSize = new JComboBox<>();
      comboCost = new JComboBox<>();
      pnlMainPanel = new JPanel();
      lblBalance = new JLabel(customer.toString());
    }

    public void addComponents() {
      add(pnlMainPanel);
      pnlMainPanel.add(comboType);
      pnlMainPanel.add(comboSize);
      pnlMainPanel.add(comboCost);
    }

    public void configureFrame() {
      setTitle("Customer");
      setBounds(500, 500, 500, 700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
    }

    public void configureComboBox() {
      comboType.setLocation(150, 200);
    }

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new Customer());
    }
}
