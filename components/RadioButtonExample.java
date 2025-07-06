import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JRadioButton Example");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        JRadioButton otherRadioButton = new JRadioButton("Other");

        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);
        group.add(otherRadioButton);

        maleRadioButton.setSelected(true);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
                String selectedOption = "";
                if (maleRadioButton.isSelected()) {
                    selectedOption = "Male";
                } else if (femaleRadioButton.isSelected()) {
                    selectedOption = "Female";
                } else if (otherRadioButton.isSelected()) {
                    selectedOption = "Other";
                }
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedOption);
            }
        );

        JPanel panel = new JPanel();
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);
        panel.add(otherRadioButton);

        frame.add(panel);
        frame.add(submitButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}