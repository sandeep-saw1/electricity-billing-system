package electric.billing.system;

import javax.swing.*;
import java.awt.*;

public class main_class extends JFrame {

    main_class() {
        setTitle("Main Page");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image i2 = i1.getImage().getScaledInstance(1273, 720, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1273, 720);
        add(image);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(menu);

        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerimage = customerImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerimage));
        menu.add(newcustomer);

        JMenuItem customerDetalis = new JMenuItem("Customer Details");
        customerDetalis.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerDetailsImg = customerdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerDetalis.setIcon(new ImageIcon(customerDetailsImg));
        menu.add(customerDetalis);

        JMenuItem depositDetails = new JMenuItem("Deposit Details");
        depositDetails.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon depositdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositDetails.png"));
        Image depositDetailsImg = depositdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositDetails.setIcon(new ImageIcon(depositDetailsImg));
        menu.add(depositDetails);

        JMenuItem calculateDetails = new JMenuItem("Calculate Bill");
        calculateDetails.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon calculateImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculateDetailsImg = calculateImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculateDetails.setIcon(new ImageIcon(calculateDetailsImg));
        menu.add(calculateDetails);

        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(info);

        JMenuItem updateInfo = new JMenuItem("Update Information");
        updateInfo.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon upadteImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image updateimg = upadteImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateInfo.setIcon(new ImageIcon(updateimg));
        info.add(updateInfo);

        JMenuItem view = new JMenu("View Information");
        view.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon viewImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewimg = viewImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        view.setIcon(new ImageIcon(viewimg));
        info.add(view);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(user);

        JMenuItem pay = new JMenuItem("Pay Bill");
        pay.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon payImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image payimg = payImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        pay.setIcon(new ImageIcon(payimg));
        user.add(pay);

        JMenuItem billDe = new JMenuItem("Bill Details");
        billDe.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon billImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image billimg = billImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billDe.setIcon(new ImageIcon(billimg));
        user.add(billDe);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(bill);







        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(utility);

        JMenuItem notepad = new JMenuItem("NotePad");
        notepad.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadimg = notepadImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadimg));
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon calcuImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calcuimg = calcuImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calcuimg));
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif", Font.PLAIN, 15));
        menuBar.add(exit);

        JMenuItem exitt = new JMenuItem("Exit");
        exitt.setFont(new Font("serif", Font.PLAIN, 15));
        ImageIcon exitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image exitimg = exitImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exitt.setIcon(new ImageIcon(exitimg));
        exit.add(exitt);

        setSize(1300, 720);
        setVisible(true);
    }

    public static void main(String[] args) {
        new main_class();
    }
}
