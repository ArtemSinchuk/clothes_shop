import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Owner extends JFrame {
  
  private JPanel pnlPanel = new JPanel();
  private JLabel lblDescription = new JLabel("add new product");
  private JLabel lblSavedProduct = new JLabel("product saved successfully");
  private JButton btnAddProduct = new JButton("Add");
  private JButton btnDeleteProduct = new JButton("Delete");
  private JTextField txtInputField = new JTextField();

  public Owner() {
    addComponents();
    addListeners();
    configureComponents();
  }

  public void addComponents() {
    this.add(pnlPanel);
    pnlPanel.add(lblDescription);
    pnlPanel.add(btnAddProduct);
    pnlPanel.add(btnDeleteProduct);
    pnlPanel.add(txtInputField);
  }

  public void configureComponents() {
    setTitle("Owner");
    setSize(700, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    pnlPanel.setLayout(null);

    lblDescription.setSize(250, 15);
    lblDescription.setLocation(300, 35);
    lblDescription.setFont(new Font("Arial", Font.BOLD, 18));

    lblSavedProduct.setForeground(Color.green);
    lblSavedProduct.setSize(300, 20);
    lblSavedProduct.setLocation(200, 500);
    lblSavedProduct.setFont(new Font("Arial", Font.BOLD, 20));

    btnAddProduct.setBounds(345, 5, 100, 50);
    btnAddProduct.setLocation(150, 100);

    btnDeleteProduct.setBounds(355, 5, 100, 50);
    btnDeleteProduct.setLocation(450, 100);

    txtInputField.setBounds(250, 555, 500, 50);
    txtInputField.setLocation(100, 250);

    

  }

  public void addListeners() {

  btnDeleteProduct.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      txtInputField.setText("");
    }
  });

  btnAddProduct.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      pnlPanel.add(lblSavedProduct);
      revalidate();
      repaint();

      Timer timer = new Timer(3000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          lblSavedProduct.setVisible(false);
        }
      });
      timer.setRepeats(false);
      timer.start();
    }
  });
}
  public static void main(String[] args) {
  new Owner();
  }
}