import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {

    Login() {
        setTitle("Automated Teller Machine");

        setLayout(null);
        // icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        // Main heading
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        // card title
        JLabel cardno = new JLabel("Card no.");
        cardno.setFont(new Font("Railway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 200, 30);
        add(cardno);
        // card input
        JTextField CardTextField = new JTextField();
        CardTextField.setBounds(300, 150, 250, 30);
        add(CardTextField);

        // pin title
        JLabel Pin = new JLabel("PIN:");
        Pin.setFont(new Font("Railway", Font.BOLD, 28));
        Pin.setBounds(120, 220, 250, 40);
        add(Pin);
        // pin input
        JTextField PinTextField = new JTextField();
        PinTextField.setBounds(300, 220, 250, 30);
        add(PinTextField);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);

    }

    public static void main(String[] args) {

        new Login();

    }

}