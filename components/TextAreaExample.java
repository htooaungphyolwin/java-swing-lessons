
import javax.swing.*;

public class TextAreaExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton button = new JButton("Submit");

        button.addActionListener(e -> {
            String inputText = textArea.getText();
            JOptionPane.showMessageDialog(frame, "You entered:\n" + inputText);
        }
        );

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(button);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setVisible(true);
    }
}
