package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField1;
    JPasswordField passwordField1;
    JButton button1, button2, button3;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image2 = new JLabel(ii3);
        image2.setBounds(630, 350, 100, 100);
        add(image2);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Helvetica", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card No.");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Helvetica", Font.BOLD, 28));
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(325, 190, 230, 30);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Helvetica", Font.BOLD, 14));
        add(textField1);

        label3 = new JLabel("PIN");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Helvetica", Font.BOLD, 28));
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField1 = new JPasswordField(15);
        passwordField1.setBounds(325, 250, 230, 30);
        passwordField1.setFont(new Font("Helvetica", Font.BOLD, 14));
        add(passwordField1);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Helvetica", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Helvetica", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Helvetica", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel image3 = new JLabel(iii3);
        image3.setBounds(0, 0, 850, 480);
        add(image3);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==button1){
                ConnectionSetup c = new ConnectionSetup();
                String cardno = textField1.getText();
                String pin = passwordField1.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }


            }
            else if(e.getSource() == button2){
                textField1.setText("");
                passwordField1.setText("");
            }
            else if(e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
