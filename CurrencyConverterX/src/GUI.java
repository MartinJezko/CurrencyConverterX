import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    int height;
    int width;

    GUI(int height, int width) {

        this.height = height;
        this.width = width;

        JFrame frame = new JFrame("Currency Converter X");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //frame.setSize(width, height);
        frame.setLayout(new GridLayout(2,3));

        JTextField entry_a = new JTextField(10);    // Field for entry number one
        JTextField entry_b = new JTextField(10);    // Field for the result

        JComboBox dropdown_a = new JComboBox(ConvertEngine.currencies);
        JLabel emptylabel = new JLabel(" ");
        JComboBox dropdown_b = new JComboBox(ConvertEngine.currencies);
        dropdown_b.setSelectedIndex(1);

        JButton convert_button = new JButton("Convert");    // Button to call the conver function
        convert_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double entryValue = Double.parseDouble(entry_a.getText());
                String unit_a = (String) dropdown_a.getSelectedItem();
                String unit_b = (String) dropdown_b.getSelectedItem();

                ConvertEngine.conversion(unit_a, unit_b, entryValue);
                entry_b.setText(String.valueOf(ConvertEngine.result));

            }
        });




        // PACK AND SHOW CONTENT
        frame.add(entry_a);
        frame.add(convert_button);
        frame.add(entry_b);
        frame.add(dropdown_a);
        frame.add(emptylabel);
        frame.add(dropdown_b);

        // Pack and show the frame
        frame.pack();
        frame.setVisible(true);

    }


}
