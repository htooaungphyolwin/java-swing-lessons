
import javax.swing.*;

public class PasswordFieldExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JPasswordField Example");
        JLabel label = new JLabel("Enter your password:");

        JPasswordField passwordField = new JPasswordField(20);
        JButton button = new JButton("Submit");

        button.addActionListener(e -> {
            char[] password = passwordField.getPassword();
            String passwordText = new String(password);
            JOptionPane.showMessageDialog(frame, "You entered: " + passwordText);
        }
        );

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(passwordField);
        panel.add(button);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
}
