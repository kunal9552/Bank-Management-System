package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    String formNo;
    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAdhar;
    JRadioButton e1, e2, e3, e4;
    JButton nextButton;

    Signup2(String formNo){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Helvetica", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Helvetica", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Helvetica", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"-- Empty --", "Hindu", "Muslim", "Cristian", "Sikh", "Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(Color.white);
        comboBox1.setFont(new Font("Helvetica", Font.BOLD, 14));
        comboBox1.setBounds(350, 120, 320, 30);
        add(comboBox1);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Helvetica", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String category[] = {"-- Empty --", "General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(Color.white);
        comboBox2.setFont(new Font("Helvetica", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Helvetica", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = {"-- Empty --", "Below 1,50,000", "Below 2,50,000", "2,50,000 - 5,00,000", "5,00,000 - 7,00,000", "7,00,000 -  10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.white);
        comboBox3.setFont(new Font("Helvetica", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education");
        l6.setFont(new Font("Helvetica", Font.BOLD, 18));
        l6.setBounds(100, 270, 100, 30);
        add(l6);

        String education[] = {"-- Empty --", "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(Color.white);
        comboBox4.setFont(new Font("Helvetica", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation");
        l7.setFont(new Font("Helvetica", Font.BOLD, 18));
        l7.setBounds(100, 320, 150, 30);
        add(l7);

        String occupation[] = {"-- Empty --", "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(Color.white);
        comboBox5.setFont(new Font("Helvetica", Font.BOLD, 14));
        comboBox5.setBounds(350, 320, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number");
        l8.setFont(new Font("Helvetica", Font.BOLD, 18));
        l8.setBounds(100, 370, 150, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Helvetica", Font.BOLD, 18));
        textPan.setBounds(350, 370, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Adhar Number");
        l9.setFont(new Font("Helvetica", Font.BOLD, 18));
        l9.setBounds(100, 420, 150, 30);
        add(l9);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Helvetica", Font.BOLD, 18));
        textAdhar.setBounds(350, 420, 320, 30);
        add(textAdhar);

        JLabel l10 = new JLabel("Senior Citizen");
        l10.setFont(new Font("Helvetica", Font.BOLD, 18));
        l10.setBounds(100, 470, 200, 30);
        add(l10);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Helvetica", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 470, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Helvetica", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(450, 470, 100, 30);
        add(e2);

        // Grouping the "Senior Citizen" radio buttons
        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(e1);
        seniorCitizenGroup.add(e2);

        JLabel l11 = new JLabel("Existing Account");
        l11.setFont(new Font("Helvetica", Font.BOLD, 18));
        l11.setBounds(100, 520, 200, 30);
        add(l11);

        e3 = new JRadioButton("Yes");
        e3.setFont(new Font("Helvetica", Font.BOLD, 14));
        e3.setBackground(new Color(252, 208, 76));
        e3.setBounds(350, 520, 100, 30);
        add(e3);

        e4 = new JRadioButton("No");
        e4.setFont(new Font("Helvetica", Font.BOLD, 14));
        e4.setBackground(new Color(252, 208, 76));
        e4.setBounds(450, 520, 100, 30);
        add(e4);

        // Grouping the "Existing Account" radio buttons
        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(e3);
        existingAccountGroup.add(e4);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Helvetica", Font.BOLD, 14));
        l12.setBounds(600, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Helvetica", Font.BOLD, 14));
        l13.setBounds(680, 10, 100, 30);
        add(l13);

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Helvetica", Font.BOLD, 18));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(570, 640, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox1.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String adhar = textAdhar.getText();

        String scitizen = " ";
        if ((e1.isSelected())){
            scitizen = "Yes";
        } else if (e2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((e3.isSelected())){
            eAccount = "Yes";
        } else if (e4.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPan.getText().equals("") || textAdhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                ConnectionSetup c = new ConnectionSetup();
                String q = "insert into Signup2 values('"+formNo+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formNo);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
