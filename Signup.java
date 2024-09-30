package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.sql.*;

public class Signup extends JFrame implements ActionListener {

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String formno = "" + Math.abs(first4);

    JTextField textName, textFName, textEmail, textMS, textAdd, textCity, textPincode, textState;

    JDateChooser dateChooser;

    JRadioButton r1, r2, r3, r4, r5;

    JButton buttonNext;

     Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + formno);
        label1.setFont(new Font("Helvetica", Font.BOLD, 38));
        label1.setBounds(160, 20, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Helvetica", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Helvetica", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Helvetica", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Helvetica", Font.BOLD, 15));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name : ");
        labelFName.setFont(new Font("Helvetica", Font.BOLD, 20));
        labelFName.setBounds(100, 240, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Helvetica", Font.BOLD, 15));
        textFName.setBounds(300, 240, 400, 30);
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Helvetica", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

         JLabel labelG = new JLabel("Gender : ");
         labelG.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelG.setBounds(100, 290, 200, 30);
         add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Helvetica", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

         r2 = new JRadioButton("Female");
         r2.setFont(new Font("Helvetica", Font.BOLD, 14));
         r2.setBackground(new Color(222, 255, 228));
         r2.setBounds(400, 290, 90, 30);
         add(r2);

         ButtonGroup buttonGroup1 = new ButtonGroup();
         buttonGroup1.add(r1);
         buttonGroup1.add(r2);

         JLabel labelEmail = new JLabel("Email address : ");
         labelEmail.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelEmail.setBounds(100, 390, 200, 30);
         add(labelEmail);

         textEmail = new JTextField();
         textEmail.setFont(new Font("Helvetica", Font.BOLD, 15));
         textEmail.setBounds(300, 390, 400, 30);
         add(textEmail );

         JLabel labelMS = new JLabel("Martial Status  : ");
         labelMS.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelMS.setBounds(100, 440, 200, 30);
         add(labelMS);

         r3 = new JRadioButton("Married");
         r3.setFont(new Font("Helvetica", Font.BOLD, 14));
         r3.setBackground(new Color(222, 255, 228));
         r3.setBounds(300, 440, 100, 30);
         add(r3);

         r4 = new JRadioButton("Unmarried");
         r4.setFont(new Font("Helvetica", Font.BOLD, 14));
         r4.setBackground(new Color(222, 255, 228));
         r4.setBounds(400, 440, 100, 30);
         add(r4);

         r5 = new JRadioButton("Other");
         r5.setFont(new Font("Helvetica", Font.BOLD, 14));
         r5.setBackground(new Color(222, 255, 228));
         r5.setBounds(530, 440, 100, 30);
         add(r5);

         ButtonGroup buttonGroup2 = new ButtonGroup();
         buttonGroup2.add(r3);
         buttonGroup2.add(r4);
         buttonGroup2.add(r5);

         JLabel labelAdd = new JLabel("Address  : ");
         labelAdd.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelAdd.setBounds(100, 490, 200, 30);
         add(labelAdd);

         textAdd = new JTextField();
         textAdd.setFont(new Font("Helvetica", Font.BOLD, 15));
         textAdd.setBounds(300, 490, 400, 30);
         add(textAdd );

         JLabel labelCity = new JLabel("City  : ");
         labelCity.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelCity.setBounds(100, 540, 200, 30);
         add(labelCity);

         textCity = new JTextField();
         textCity.setFont(new Font("Helvetica", Font.BOLD, 15));
         textCity.setBounds(300, 540, 400, 30);
         add(textCity);

         JLabel labelPincode = new JLabel("Pincode  : ");
         labelPincode.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelPincode.setBounds(100, 590, 200, 30);
         add(labelPincode);

         textPincode = new JTextField();
         textPincode.setFont(new Font("Helvetica", Font.BOLD, 15));
         textPincode.setBounds(300, 590, 400, 30);
         add(textPincode);

         JLabel labelState = new JLabel("State  : ");
         labelState.setFont(new Font("Helvetica", Font.BOLD, 20));
         labelState.setBounds(100, 640, 200, 30);
         add(labelState);

         textState = new JTextField();
         textState.setFont(new Font("Helvetica", Font.BOLD, 15));
         textState.setBounds(300, 640, 400, 30);
         add(textState);

         buttonNext = new JButton("Next");
         buttonNext.setFont(new Font("Helvetica", Font.BOLD, 14));
         buttonNext.setBackground(Color.BLACK);
         buttonNext.setForeground(Color.WHITE);
         buttonNext.setBounds(620, 710, 80, 30);
         buttonNext.addActionListener(this);
         add(buttonNext);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = formno;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = textEmail.getText();
        String martial = null;

        if (r3.isSelected())
        {
            martial = "Married";
        } else if (r4.isSelected()) {
            martial = "Unmarried";
        } else if (r5.isSelected()) {
            martial = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                ConnectionSetup con1 = new ConnectionSetup();
                String q = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+martial+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);  // close the current signup frame and open the another
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
