
import javax.swing.*;

public class TextFieldExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");

        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");

        button.addActionListener(e -> {
            String inputText = textField.getText();
            JOptionPane.showMessageDialog(frame, "You entered: " + inputText);
        });

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        frame.setVisible(true);
    }
}
