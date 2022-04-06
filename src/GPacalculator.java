
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GPacalculator implements ActionListener{

    JLabel prompt;
    JLabel nom;
    JButton deposit;
    JButton withdraw;
    JLabel oldbal;
    JLabel amount;
    JButton balance;
    JTextField oldbal1;
    JTextField amount1;
    JTextField balance1;
    GPacalculator()
    {
        JFrame window = new JFrame("GPa CALCULOATOR");
        window.setLayout(new GridLayout(5,2));
        window.setSize(1000,1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prompt = new JLabel("CHOOSE TYPE OF TRANSACTION");
        nom = new JLabel ();
        deposit = new JButton("DEPOSIT");
        withdraw = new JButton ("WITHDRAW");

        oldbal = new JLabel("BALANCE:");
        oldbal1 = new JTextField();

        amount = new JLabel ("ENTER AMOUNT:");
        amount1 = new JTextField();

        balance = new JButton ("NEW BALANCE:");
        balance1 = new JTextField();

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        balance.addActionListener(this);

        window.add(prompt);
        window.add(nom);
        window.add(deposit);
        window.add(withdraw);
        window.add(oldbal);
        window.add(oldbal1);
        window.add(amount);
        window.add(amount1);
        window.add(balance);
        window.add(balance1);

        oldbal.setVisible(false);
        oldbal.setVisible(false);
        amount.setVisible(false);
        amount1.setVisible(false);
        balance.setVisible(false);
        balance1.setVisible(false);

        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getActionCommand().equals("DEPOSIT"))
        {
            oldbal.setVisible(true);
            oldbal.setVisible(true);
            amount.setVisible(true);
            amount1.setVisible(true);
            balance.setVisible(true);
            balance1.setVisible(true);

            oldbal1.setText("1000");
            int a = Integer.parseInt(oldbal1.getText());
            int b = Integer.parseInt(amount1.getText());

            if (ae.getActionCommand().equals("NEW BALANCE"))
            {
                int c = a + b;

                balance1.setText(""+c);
            }


        }
        if (ae.getActionCommand().equals("WITHDRAW"))
        {
            oldbal.setVisible(true);
            oldbal.setVisible(true);
            amount.setVisible(true);
            amount1.setVisible(true);
            balance.setVisible(true);
            balance1.setVisible(true);

            oldbal1.setText("1000");
            int a = Integer.parseInt(oldbal1.getText());
            int b = Integer.parseInt(amount1.getText());

            if (ae.getActionCommand().equals("NEW BALANCE"))
            {
                int c = a - b;

                balance1.setText(""+c);
            }

        }
    }
}