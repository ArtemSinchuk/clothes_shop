package clothes_shop;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Entrance extends JFrame {
  private JPanel pnlPanel = new JPanel();
  private JLabel lblLabel = new JLabel("I am...");
  private JButton btnOwner = new JButton("Owner");
  private JButton btnCustomer = new JButton("Customer");

  public Entrance(){
    addComponents();
    configureFrame();
    configureLabel();
    configureButtons();
  }

  public void addComponents() {
    add(lblLabel);
    add(pnlPanel);
    add(btnOwner);
    add(btnCustomer);
  }

  public void configureFrame() {
    setTitle("Shop entrance");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);
    setLayout(null);
    
  }

  public void configureLabel() {
    lblLabel.setLocation(275, 100);
    lblLabel.setSize(150, 20);
    lblLabel.setFont(new Font("Arial", Font.BOLD, 20));
    lblLabel.setForeground(new Color(65,67,69));
  }

  public void configurePanel() {
    pnlPanel.setBounds(0, 0, 600, 400);
    pnlPanel.setLayout(null);
    pnlPanel.setOpaque(false);
  }
  public void configureButtons() {
    btnOwner.setBounds(200, 300, 200, 50);
    btnOwner.setLocation(100, 200);
    btnOwner.setFont(new Font("Arial", Font.BOLD, 20));
    btnOwner.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new OwnerGUI();
        dispose();
      }
    });

    btnCustomer.setBounds(300, 300, 200, 50);
    btnCustomer.setLocation(300, 200);
    btnCustomer.setFont(new Font("Arial", Font.BOLD, 20));
    btnCustomer.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new Customer();
        dispose();
      }
    });
  }
  public static void main(String[] args) {
    new Entrance();
  
}
}