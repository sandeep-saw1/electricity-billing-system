package electric.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.sql.*;

public class NewCustomer extends JFrame implements ActionListener {
    JTextField textField1, textField2, textField3, textField4, textField5, textField6;
    JButton next, cancle;
    JLabel labelmeter;
    String meterNumber;

    NewCustomer() {
        super("New Customer");
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(200, 0, 400, 415);
        panel.setBackground(Color.orange);
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("New Customer");
        label.setBounds(145, 8, 200, 40);
        label.setFont(new Font("System", Font.BOLD, 20));
        label.setForeground(Color.BLACK);
        panel.add(label);

        JLabel l1 = new JLabel("New Customer");
        l1.setBounds(30, 45, 100, 40);
        l1.setFont(new Font("System", Font.BOLD, 14));
        l1.setForeground(Color.BLACK);
        panel.add(l1);

        textField1 = new JTextField();
        textField1.setBounds(160, 57, 130, 17);
        panel.add(textField1);

        JLabel l2 = new JLabel("Meter Number");
        l2.setBounds(30, 90, 100, 40);
        l2.setFont(new Font("System", Font.BOLD, 14));
        l2.setForeground(Color.BLACK);
        panel.add(l2);

        Random ran = new Random();
        meterNumber = String.valueOf(Math.abs(ran.nextLong() % 1000000));

        labelmeter = new JLabel(meterNumber);
        labelmeter.setOpaque(true);
        labelmeter.setBackground(Color.orange);
        labelmeter.setForeground(Color.BLACK);
        labelmeter.setFont(new Font("System", Font.BOLD, 15));
        labelmeter.setBounds(160, 103, 130, 19);
        labelmeter.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        panel.add(labelmeter);

        JLabel l3 = new JLabel("Address");
        l3.setBounds(30, 135, 100, 40);
        l3.setFont(new Font("System", Font.BOLD, 14));
        l3.setForeground(Color.BLACK);
        panel.add(l3);

        textField2 = new JTextField();
        textField2.setBounds(160, 150, 130, 17);
        panel.add(textField2);

        JLabel l4 = new JLabel("City");
        l4.setBounds(30, 175, 100, 40);
        l4.setFont(new Font("System", Font.BOLD, 14));
        l4.setForeground(Color.BLACK);
        panel.add(l4);

        textField3 = new JTextField();
        textField3.setBounds(160, 190, 130, 17);
        panel.add(textField3);

        JLabel l5 = new JLabel("State");
        l5.setBounds(30, 215, 100, 40);
        l5.setFont(new Font("System", Font.BOLD, 14));
        l5.setForeground(Color.BLACK);
        panel.add(l5);

        textField4 = new JTextField();
        textField4.setBounds(160, 230, 130, 17);
        panel.add(textField4);

        JLabel l6 = new JLabel("Email");
        l6.setBounds(30, 255, 100, 40);
        l6.setFont(new Font("System", Font.BOLD, 14));
        l6.setForeground(Color.BLACK);
        panel.add(l6);

        textField5 = new JTextField();
        textField5.setBounds(160, 270, 130, 17);
        panel.add(textField5);

        JLabel l7 = new JLabel("Phone");
        l7.setBounds(30, 295, 100, 40);
        l7.setFont(new Font("System", Font.BOLD, 14));
        l7.setForeground(Color.BLACK);
        panel.add(l7);

        textField6 = new JTextField();
        textField6.setBounds(160, 310, 130, 17);
        panel.add(textField6);

        next = new JButton("Next");
        next.setBounds(120, 355, 80, 30);
        next.setForeground(Color.white);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        panel.add(next);

        cancle = new JButton("Cancel");
        cancle.setBounds(220, 355, 80, 30);
        cancle.setForeground(Color.white);
        cancle.setBackground(Color.BLACK);
        cancle.addActionListener(this);
        panel.add(cancle);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/chlid.png"));
        Image i2 = i1.getImage().getScaledInstance(210, 210, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(6, 80, 210, 210);
        add(image);

        setSize(600, 450);
        setVisible(true);
        setLocation(310, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String name = textField1.getText();
            String address = textField2.getText();
            String city = textField3.getText();
            String state = textField4.getText();
            String email = textField5.getText();
            String phone = textField6.getText();

            String q = "INSERT INTO customer (name, meter_no, address, city, state, email, phone) " +
                    "VALUES ('" + name + "', '" + meterNumber + "', '" + address + "', '" + city + "', '" +
                    state + "', '" + email + "', '" + phone + "')";

            String qs = "INSERT INTO Signup VALUES('" + meterNumber + "', '', '" + name + "', '', '')";
            try {
                database c = new database();
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(qs);
                JOptionPane.showMessageDialog(null, "Added successfully");
                setVisible(false);
                new meterInfo(meterNumber);
            } catch (Exception E) {
                E.getStackTrace();
            }
        } else if (e.getSource() == cancle) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
