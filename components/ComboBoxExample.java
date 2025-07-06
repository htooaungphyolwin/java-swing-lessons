import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};

        JComboBox<String> colorComboBox = new JComboBox<>(colors);

        colorComboBox.setSelectedItem("Green");

        // colorComboBox.setEditable(true);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedColor);
            }
        );

        JPanel panel = new JPanel();
        panel.add(new JLabel("Select a color:"));
        panel.add(colorComboBox);
        panel.add(submitButton);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}