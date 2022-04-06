//importing libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AtmDemo  implements ActionListener {
    //GUI components
    JLabel prompt;
    JLabel nom;
    JButton deposit;
    JButton withdraw;
    JLabel oldbal;
    JLabel amount;
    JLabel balance;
    JTextField oldbal1;
    JTextField amount1;
    JTextField balance1;


    //Constructor
    AtmDemo() {
        JFrame window = new JFrame(" atm system");
        window.setLayout(new GridLayout(5, 2));
        window.setSize(1000, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prompt = new JLabel("CHOOSE TYPE OF TRANSACTION");
        nom = new JLabel();
        deposit = new JButton("DEPOSIT");
        withdraw = new JButton("WITHDRAW");

        oldbal = new JLabel("BALANCE:");
        oldbal1 = new JTextField("20000");

        amount = new JLabel("ENTER AMOUNT:");
        amount1 = new JTextField();

        balance = new JLabel("NEW BALANCE:");
        balance1 = new JTextField();

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

//adding components to frame
        window.add(prompt);
        window.add(nom);
        window.add(oldbal);
        window.add(oldbal1);
        window.add(amount);
        window.add(amount1);
        window.add(deposit);
        window.add(withdraw);
        window.add(balance);
        window.add(balance1);


        balance.setVisible(false);
        balance1.setVisible(false);

        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("DEPOSIT")) {

            balance.setVisible(true);
            balance1.setVisible(true);


            int a = Integer.parseInt(oldbal1.getText());
            int b = Integer.parseInt(amount1.getText());
            int c = Integer.parseInt(balance1.getText());

            c = c + b;

            balance1.setText("" + c);


        }
        if (ae.getActionCommand().equals("WITHDRAW")) {
            if (balance1.getText().equals("")) {
                balance.setVisible(true);

                balance1.setVisible(true);


                int a = Integer.parseInt(oldbal1.getText());
                int b = Integer.parseInt(amount1.getText());


                int c = a - b;

                balance1.setText("" + c);


            }
            else{

                balance.setVisible(true);

                balance1.setVisible(true);


                int a = Integer.parseInt(oldbal1.getText());
                int b = Integer.parseInt(amount1.getText());
                int c = Integer.parseInt(balance1.getText());

                c = c - b;

                balance1.setText("" + c);



            }
        }
    }

}