
import javax.swing.*;

public class ListExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Apple");
        listModel.addElement("Banana");
        listModel.addElement("Orange");
        listModel.addElement("Grape");
        listModel.addElement("Mango");
        listModel.addElement("Pineapple");

        JList<String> fruitList = new JList<>(listModel);

        fruitList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(fruitList);
        scrollPane.setPreferredSize(new java.awt.Dimension(200, 150));

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            java.util.List<String> selectedFruits = fruitList.getSelectedValuesList();
            if (selectedFruits.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No fruit selected.");
            } else {
                JOptionPane.showMessageDialog(frame, "Selected Fruits: " + String.join(", ", selectedFruits));
            }
        }
        );

        JPanel panel = new JPanel();
        panel.add(new JLabel("Select fruits:"));
        panel.add(scrollPane);
        panel.add(submitButton);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
