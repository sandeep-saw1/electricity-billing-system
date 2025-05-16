package electric.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class meterInfo extends JFrame implements ActionListener {
    Choice c1, c2, c3, c4;
    JButton submit;
    String meterNumber;

    meterInfo(String meterNumber) {
        super("Meter Info");
        setLayout(null);
        this.meterNumber = meterNumber;

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 415);
        panel.setBackground(Color.orange);
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Meter Information");
        label.setBounds(120, 8, 200, 40);
        label.setFont(new Font("System", Font.BOLD, 20));
        label.setForeground(Color.BLACK);
        panel.add(label);

        JLabel l1 = new JLabel("Meter Number");
        l1.setBounds(30, 45, 100, 40);
        l1.setFont(new Font("System", Font.BOLD, 14));
        l1.setForeground(Color.BLACK);
        panel.add(l1);

        JLabel meterNumberLabel = new JLabel(meterNumber);
        meterNumberLabel.setBounds(160, 57, 130, 17);
        meterNumberLabel.setFont(new Font("System", Font.PLAIN, 14));
        panel.add(meterNumberLabel);

        JLabel l2 = new JLabel("Meter Location");
        l2.setBounds(30, 90, 100, 40);
        l2.setFont(new Font("System", Font.BOLD, 14));
        l2.setForeground(Color.BLACK);
        panel.add(l2);

        c1 = new Choice();
        c1.add("Outside");
        c1.add("Inside");
        c1.setBounds(160, 103, 130, 19);
        panel.add(c1);

        JLabel l3 = new JLabel("Meter Type");
        l3.setBounds(30, 135, 100, 40);
        l3.setFont(new Font("System", Font.BOLD, 14));
        l3.setForeground(Color.BLACK);
        panel.add(l3);

        c2 = new Choice();
        c2.add("Electric Meter");
        c2.add("Solar Meter");
        c2.add("Smart Meter");
        c2.setBounds(160, 150, 130, 17);
        panel.add(c2);

        JLabel l4 = new JLabel("Phase Code");
        l4.setBounds(30, 175, 100, 40);
        l4.setFont(new Font("System", Font.BOLD, 14));
        l4.setForeground(Color.BLACK);
        panel.add(l4);

        c3 = new Choice();
        c3.add("011");
        c3.add("022");
        c3.add("033");
        c3.add("044");
        c3.add("055");
        c3.add("066");
        c3.add("077");
        c3.add("088");
        c3.add("099");
        c3.setBounds(160, 190, 130, 17);
        panel.add(c3);

        JLabel l5 = new JLabel("Bill Type");
        l5.setBounds(30, 215, 100, 40);
        l5.setFont(new Font("System", Font.BOLD, 14));
        l5.setForeground(Color.BLACK);
        panel.add(l5);

        c4 = new Choice();
        c4.add("Normal");
        c4.add("Industrial");
        c4.setBounds(160, 230, 130, 17);
        panel.add(c4);

        JLabel l6 = new JLabel("30 Days Billing Time");
        l6.setBounds(30, 255, 200, 40);
        l6.setFont(new Font("System", Font.BOLD, 14));
        l6.setForeground(Color.BLACK);
        panel.add(l6);

        JLabel l7 = new JLabel("Note:-");
        l7.setBounds(30, 295, 100, 40);
        l7.setFont(new Font("System", Font.BOLD, 14));
        l7.setForeground(Color.BLACK);
        panel.add(l7);

        JLabel l9 = new JLabel("By default bill is calculated for 30 days only.");
        l9.setBounds(30, 310, 350, 40);
        l9.setFont(new Font("System", Font.BOLD, 14));
        l9.setForeground(Color.BLACK);
        panel.add(l9);

        submit = new JButton("Submit");
        submit.setBounds(120, 355, 80, 30);
        submit.setForeground(Color.white);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        panel.add(submit);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/details.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(413, 80, 200, 200);
        add(image);

        setSize(650, 450);
        setVisible(true);
        setLocation(310, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String meterLocation = c1.getSelectedItem();
            String meterType = c2.getSelectedItem();
            String phaseCode = c3.getSelectedItem();
            String billType = c4.getSelectedItem();


            System.out.println("Meter No: " + meterNumber);
            System.out.println("Location: " + meterLocation);
            System.out.println("Type: " + meterType);
            System.out.println("Phase: " + phaseCode);
            System.out.println("Bill Type: " + billType);



            JOptionPane.showMessageDialog(this, "Meter Info Saved Successfully");
        }
    }

    public static void main(String[] args) {
        new meterInfo("123456"); // Example meter number
    }
}
