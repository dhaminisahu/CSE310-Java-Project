
// DHAMINI SAHU
//
// import necessary packages
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BMIcalculator {
    public static void main(String[] args) {
        // create JFrame and set its properties
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(525, 525); // set size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation
        frame.setLayout(null); // set layout to null for absolute positioning
        frame.getContentPane().setBackground(Color.BLACK); // set background color of the content pane
        // create and add heading label to the frame
        JLabel heading = new JLabel("BMI Calculator");
        heading.setBounds(125, 15, 100, 45); // set size and position of the label
        heading.setFont(new Font("Times New Roman", Font.BOLD, 24)); // set font of the label
        heading.setForeground(Color.WHITE); // set foreground color of the label
        frame.add(heading);

        // create and add height label and text field to the frame
        JLabel heightLabel = new JLabel("Height (in cm):");
        heightLabel.setBounds(60, 75, 150, 45); // set size and position of the label
        heightLabel.setForeground(Color.WHITE); // set foreground color of the label
        frame.add(heightLabel);

        JTextField heightTextField = new JTextField();
        heightTextField.setBounds(225, 75, 225, 45); // set size and position of the text field
        frame.add(heightTextField);

        // create and add weight label and text field to the frame
        JLabel weightLabel = new JLabel("Weight (in kg):");
        weightLabel.setBounds(60, 135, 150, 45); // set size and position of the label
        weightLabel.setForeground(Color.WHITE); // set foreground color of the label
        frame.add(weightLabel);

        JTextField weightTextField = new JTextField();
        weightTextField.setBounds(225, 135, 225, 45); // set size and position of the text field
        frame.add(weightTextField);

        // create and add result label to the frame
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(60, 300, 300, 45); // set size and position of the label
        resultLabel.setForeground(Color.WHITE); // set foreground color of the label
        resultLabel.setFont(new Font("Times New Roman", Font.BOLD, 21)); // set font of the label
        frame.add(resultLabel);

        // create and add calculate button to the frame
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(225, 210, 150, 45); // set size and position of the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // get height and weight values from text fields and calculate BMI
                    double height = Double.parseDouble(heightTextField.getText());
                    double weight = Double.parseDouble(weightTextField.getText());
                    double bmi = weight / ((height / 100) * (height / 100));

                    // format and display the result in the result label
                    String result = String.format("Your Body Mass Index: %.2f", bmi);
                    resultLabel.setText(result);
                    resultLabel.setForeground(Color.WHITE); // set foreground color of the label
                } catch (NumberFormatException ex) {
                    // display error message if invalid values are entered
                    resultLabel.setText("Please enter valid values");
                }
            }
        });
        frame.add(calculateButton);

        // create and add clear button to the frame
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(60, 210, 150, 45);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                heightTextField.setText("");
                weightTextField.setText("");
                resultLabel.setText("");
            }
        });
        frame.add(clearButton);

        frame.setVisible(true);
    }
}
