package clothes_shop.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import clothes_shop.*;

public class OwnerGUI extends JFrame {

    private JPanel pnlPanel = new JPanel();
    private JLabel lblDescription = new JLabel("Add new product");
    private JLabel lblSavedProduct = new JLabel("Product saved successfully");
    private JLabel lblType = new JLabel("Type:"), lblSize = new JLabel("Size:"), lblCost = new JLabel("Cost:");
    private JLabel lblAmount = new JLabel("Amount:");
    private JLabel lblProTip = new JLabel("Pro tip:");
    private JLabel lblProTip2 = new JLabel("Press the tab key to switch");
    private JLabel lblProTip3 = new JLabel("between text fields quickly");
    private JButton btnAddProduct = new JButton("Add");
    private JButton btnDeleteProduct = new JButton("Delete");
    private JTextField txtType = new JTextField();
    private JTextField txtSize = new JTextField();
    private JTextField txtCost = new JTextField();
    private JTextField txtAmount = new JTextField();
    private Font descriptionFont = new Font("Arial", Font.BOLD, 18);
    private Font saveFont = new Font("Arial", Font.BOLD, 20);
    private Shop shop;

    public OwnerGUI() {
        shop = new Shop(100);
        addComponents();
        addListeners();
        configureComponents();
    }

    public void addComponents() {
        add(pnlPanel);
        pnlPanel.add(lblDescription);
        pnlPanel.add(lblType);
        pnlPanel.add(txtType);
        pnlPanel.add(lblSize);
        pnlPanel.add(txtSize);
        pnlPanel.add(lblCost);
        pnlPanel.add(txtCost);
        pnlPanel.add(lblAmount);
        pnlPanel.add(txtAmount);
        pnlPanel.add(btnAddProduct);
        pnlPanel.add(btnDeleteProduct);
        pnlPanel.add(lblProTip);
        pnlPanel.add(lblProTip2);
        pnlPanel.add(lblProTip3);
    }

    public void configureComponents() {
        setTitle("Owner");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        pnlPanel.setLayout(null);

        lblDescription.setSize(250, 15);
        lblDescription.setLocation(300, 35);
        lblDescription.setFont(descriptionFont);

        lblSavedProduct.setForeground(Color.green);
        lblSavedProduct.setSize(300, 20);
        lblSavedProduct.setLocation(200, 500);
        lblSavedProduct.setFont(saveFont);
        lblSavedProduct.setVisible(false);

        lblType.setBounds(100, 100, 80, 25);
        txtType.setBounds(180, 100, 165, 25);

        lblSize.setBounds(100, 150, 80, 25);
        txtSize.setBounds(180, 150, 165, 25);

        lblCost.setBounds(100, 200, 80, 25);
        txtCost.setBounds(180, 200, 165, 25);

        lblAmount.setBounds(100, 250, 80, 25);
        txtAmount.setBounds(180, 250, 165, 25);

        lblProTip.setBounds(500, 125, 100, 25);
        lblProTip2.setBounds(450, 150, 300, 25);
        lblProTip3.setBounds(450, 175, 300, 25);

        btnAddProduct.setBounds(150, 300, 100, 50);
        btnDeleteProduct.setBounds(450, 300, 100, 50);

    }

    public void addListeners() {

        btnDeleteProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtType.setText("");
                txtSize.setText("");
                txtCost.setText("");
                txtAmount.setText("");
            }
        });

        btnAddProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String typeOfClothing = txtType.getText().trim();
                    String size = txtSize.getText().trim();
                    double cost = Double.parseDouble(txtCost.getText().trim());
                    int amount = Integer.parseInt(txtAmount.getText().trim());

                    Clothing clothing = new Clothing(typeOfClothing, size, cost, amount);
                    shop.addClothing(clothing);

                    lblSavedProduct.setVisible(true); // Показать сообщение о сохранении продукта
                    revalidate();
                    repaint();

                    Timer timer = new Timer(3000, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            lblSavedProduct.setVisible(false);
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter cost and amount correctly.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new OwnerGUI();
    }
}
