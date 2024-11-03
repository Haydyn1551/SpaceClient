package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JLabel label;
    private JButton button;

    public Gui() {
        // Set up the frame
        setTitle("SpaceClient - Eaglercraft 1.16"); // Updated title
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Use BorderLayout for layout management

        // Create a label
        label = new JLabel("Welcome to the GUI!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        add(label, BorderLayout.CENTER); // Add label to the center

        // Create a button
        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // Update label text on button click
            }
        });
        add(button, BorderLayout.SOUTH); // Add button to the bottom

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new Gui());
    }
}
