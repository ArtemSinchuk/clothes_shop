import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Entrace extends JFrame {
  private JPanel pnlPanel = new JPanel();
  private JLabel lblLabel = new JLabel("Who are you?");
  private JButton btnOwner = new JButton("Owner");
  private JButton btnCustomer = new JButton("Customer");


  public Entrace(){
    this.setTitle("Zlart entrance");
    this.setBounds(500, 500, 600, 550);
    //this.setSize(600, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true);
    //this.getContentPane().setBackground(Color.BLACK);

    lblLabel.setVerticalTextPosition(JLabel.TOP);
    lblLabel.setHorizontalTextPosition(JLabel.RIGHT);
    lblLabel.setHorizontalAlignment(JLabel.RIGHT);
    lblLabel.setVerticalAlignment(JLabel.TOP);
    lblLabel.setBackground(Color.blue);
    //label.setBounds(0, 0, 0, 0);

    Container container = this.getContentPane();
    container.setLayout(new GridLayout(3, 3, 3, 3));
    container.add(lblLabel);
    container.add(pnlPanel);
    container.add(btnOwner);
    container.add(btnCustomer);
    

  }

  public static void main(String[] args) {
  Entrace entrace = new Entrace();
  System.out.println(entrace);
}
}