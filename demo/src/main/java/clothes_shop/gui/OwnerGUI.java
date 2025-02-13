package clothes_shop.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import clothes_shop.Shop;
import clothes_shop.exceptions.TextFieldEmptyException;

public class OwnerGUI extends JFrame {

    private JPanel pnlPanel = new JPanel();
    private JPanel pnlCenterpPanel = new JPanel();
    private JPanel pnlWestPanel = new JPanel();
    private JPanel pnlNorthPanel = new JPanel();
    private JPanel pnlEastPanel = new JPanel();
    private JPanel pnlSouthPanel = new JPanel();
    private JLabel lblDescription = new JLabel("Add new product");
    private JLabel lblSavedProduct = new JLabel("Product saved successfully");
    private JLabel lblType = new JLabel("Type:"), lblSize = new JLabel("Size:"), lblCost = new JLabel("Cost:");
    private JLabel lblAmount = new JLabel("Amount:");
    private JLabel lblProTip = new JLabel("Pro tip:");
    private JLabel lblProTip2 = new JLabel("Press the tab key to switch");
    private JLabel lblProTip3 = new JLabel("between text fields quickly");
    private JLabel shopCapacity = new JLabel();
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
                if(txtType == null || txtSize == null || txtAmount == null || txtCost == null) {
                    try {
                        throw new TextFieldEmptyException("One of your fields is empty, please fill in all fields");
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new OwnerGUI();
    }
}
