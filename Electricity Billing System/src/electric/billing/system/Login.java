package electric.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField textField;
    JPasswordField passwordField;
    Choice c1;
    JButton login, cancel, signup;

    Login() {
        super("Login");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image i2 = i1.getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(10, 0, 270, 270);
        add(image);

        JLabel l1 = new JLabel("UserName");
        l1.setBounds(380, 40, 200, 40);
        l1.setFont(new Font("System", Font.BOLD, 15));
        add(l1);

        textField = new JTextField();
        textField.setFont(new Font("System", Font.BOLD, 14));
        textField.setBounds(500, 50, 150, 20);
        add(textField);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(380, 90, 200, 40);
        l2.setFont(new Font("System", Font.BOLD, 15));
        add(l2);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("System", Font.BOLD, 14));
        passwordField.setBounds(500, 100, 150, 20);
        add(passwordField);

        JLabel l3 = new JLabel("Login In As");
        l3.setBounds(380, 140, 100, 40);
        l3.setFont(new Font("System", Font.BOLD, 15));
        add(l3);

        c1 = new Choice();
        c1.setFont(new Font("System", Font.BOLD, 14));
        c1.setBounds(500, 150, 150, 20);
        c1.add("Admin");
        c1.add("Customer");
        add(c1);

        login = new JButton("Login");
        login.setBounds(410, 200, 80, 20);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(460, 240, 80, 20);
        cancel.addActionListener(this);
        add(cancel);

        signup = new JButton("Signup");
        signup.setBounds(510, 200, 80, 20);
        signup.addActionListener(this);
        add(signup);

        setSize(700, 310);
        setLocation(320, 220);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = textField.getText();
            String password = new String(passwordField.getPassword());
            String user = c1.getSelectedItem();

            try {
                database c = new database();
                String q = "select * from Signup where username = '" + username + "' and password = '" + password + "' and usertype ='" + user + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    setVisible(false);
                    new main_class();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                }

            } catch (Exception E) {
                E.printStackTrace();
            }

        } else if (e.getSource() == cancel) {
            setVisible(false);
        } else if (e.getSource() == signup) {
            setVisible(false);
            new SignupPage();
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
