import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class intern3 extends JFrame {
    private JTextField balanceTextField;
    private JTextField amountTextField;
    private JButton checkBalanceButton;
    private JButton depositButton;
    private JButton withdrawButton;

    public intern3() {
        setTitle("ATM Interface");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(3, 2));

        balanceTextField = new JTextField("0.00");
        amountTextField = new JTextField();

        checkBalanceButton = new JButton("Check Balance");
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");

        mainPanel.add(new JLabel("Current Balance:"));
        mainPanel.add(balanceTextField);
        mainPanel.add(new JLabel("Enter Amount:"));
        mainPanel.add(amountTextField);
        mainPanel.add(checkBalanceButton);
        mainPanel.add(depositButton);
        mainPanel.add(withdrawButton);

        add(mainPanel);

        // Attach action listeners to buttons
        checkBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement logic to check balance
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement logic to deposit funds
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement logic to withdraw funds
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new intern3().setVisible(true);
            }
        });
    }
}
