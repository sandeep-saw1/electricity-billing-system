package electric.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupPage extends JFrame implements ActionListener {
    JButton create, back;
    Choice c1;
    JTextField t1, t2, t3;
    JPasswordField passwordField;
    JLabel l2;

    SignupPage() {
        super("Signup Page");
        setLayout(null);
        getContentPane().setBackground(Color.pink);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image i2 = i1.getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(400, 50, 270, 270);
        add(image);

        JLabel label = new JLabel("Create Account");
        label.setBounds(280, 2, 140, 40);
        label.setFont(new Font("System", Font.BOLD, 14));
        add(label);

        JLabel l1 = new JLabel("Create Account As");
        l1.setBounds(25, 60, 140, 40);
        l1.setFont(new Font("System", Font.BOLD, 14));
        add(l1);

        c1 = new Choice();
        c1.add("Admin");
        c1.add("Customer");
        c1.setBounds(190, 70, 125, 30);
        add(c1);

        l2 = new JLabel("Employee Id");
        l2.setBounds(25, 110, 140, 40);
        l2.setFont(new Font("System", Font.BOLD, 14));
        add(l2);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c1.getSelectedItem().equals("Customer")) {
                    l2.setText("Meter Number");
                } else {
                    l2.setText("Employee Id");
                }
            }
        });

        t1 = new JTextField();
        t1.setBounds(190, 122, 130, 20);
        add(t1);

        JLabel l3 = new JLabel("UserName");
        l3.setBounds(25, 150, 140, 40);
        l3.setFont(new Font("System", Font.BOLD, 14));
        add(l3);

        t2 = new JTextField();
        t2.setBounds(190, 162, 130, 20);
        add(t2);

        JLabel l4 = new JLabel("Name");
        l4.setBounds(25, 190, 140, 40);
        l4.setFont(new Font("System", Font.BOLD, 14));
        add(l4);

        t3 = new JTextField();
        t3.setBounds(190, 202, 130, 20);
        add(t3);

        JLabel l5 = new JLabel("Password");
        l5.setBounds(25, 230, 140, 40);
        l5.setFont(new Font("System", Font.BOLD, 14));
        add(l5);

        passwordField = new JPasswordField();
        passwordField.setBounds(190, 245, 130, 20);
        add(passwordField);

        create = new JButton("Create");
        create.setBounds(25, 300, 100, 30);
        create.setBackground(Color.BLUE);
        create.setForeground(Color.BLACK);
        create.setFont(new Font("System", Font.BOLD, 15));
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBounds(150, 300, 100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("System", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);

        setSize(700, 400);
        setLocation(270, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == create) {
            String sloginAS = c1.getSelectedItem();
            String username = t2.getText();
            String sname = t3.getText();
            String spassword = new String(passwordField.getPassword());
            String meter = t1.getText();

            try {
                database c = new database();
                String q = "INSERT INTO Signup (meter_no, username, name, password, usertype) VALUES ('"
                        + meter + "','" + username + "','" + sname + "','" + spassword + "','" + sloginAS + "')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new Login();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
