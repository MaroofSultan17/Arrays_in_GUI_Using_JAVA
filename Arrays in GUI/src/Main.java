/*
Assignment is take an array at a single frame and show the elements
Arrays in GUI using Frame and Panel
We can sort or perform any operation on the array elements using GUI
This Program is written by: Maroof Sultan
Student Of BSCS in COMSATS University Islamabad, Sahiwal Campus
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //define a panel object
        Panel panel = new Panel();
        //define a Label that show the message
        JLabel element = new JLabel("Enter the elements using a single space : ");
        //define a text field to enter the elements of the array
        JTextField textField = new JTextField(20);
        //define a button to perform any action
        JButton button = new JButton("Show the Elements");
        //define a label to show the Elements of Array
        JLabel result = new JLabel("Elements in the array");
        //What action perform when the button pressed
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //define a string to get the text from the text field
                String s = textField.getText();
                //define a string array to split the string
                String[] string = s.split(" ");
                //define integer array to store the elements of the array
                int[] integer = new int[string.length];
                //copying a string array to an integer array
                for (int i = 0; i < string.length; i++) {
                    // parsing an integer from a string
                    integer[i] = Integer.parseInt(string[i]);
                }
                //storing the elements of the array in a string
                String a = Arrays.toString(integer);
                //show the elements of the array in the label
                result.setText(a);
            }});
        //add the objects to the panel
        panel.add(element);
        panel.add(textField);
        panel.add(button);
        panel.add(result);
        // define a frame to show the panel
        JFrame frame = new JFrame("Arrays in Single Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the size of the frame
        frame.setSize(500, 200);
        //add the panel into the frame
        frame.add(panel);
        //show the frame
        frame.setVisible(true);
    }
}