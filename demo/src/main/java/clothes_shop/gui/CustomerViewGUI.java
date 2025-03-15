package clothes_shop.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CustomerViewGUI extends JFrame {

  private JPanel pnlMainPanel;
  private JLabel lblBalance;

    public CustomerViewGUI() {
      initialization();
      configureFrame();
      addComponents();
    }

    private void initialization() {
      pnlMainPanel = new JPanel();
      // lblBalance = new JLabel(customer.toString());
    }

    public void addComponents() {
      add(pnlMainPanel);
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
