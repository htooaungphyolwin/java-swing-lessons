
import javax.swing.*;

public class CheckBoxExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        JButton button = new JButton("Submit");

        button.addActionListener(e -> {

            StringBuilder selectedOptions = new StringBuilder("Selected Options:\n");
            if (checkBox1.isSelected()) {
                selectedOptions.append("- Option 1\n");
            }
            if (checkBox2.isSelected()) {
                selectedOptions.append("- Option 2\n");
            }
            if (checkBox3.isSelected()) {
                selectedOptions.append("- Option 3\n");
            }
            JOptionPane.showMessageDialog(frame, selectedOptions.toString());
        }
        );

        JPanel panel = new JPanel();
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(button);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
