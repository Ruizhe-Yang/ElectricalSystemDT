package cnsa.ee.digital.twin.design.com.net;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUITest {
//    private static void createAndShowGUI() {
//        JFrame frame = new JFrame("Layout Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//
//        JButton button1 = new JButton("Button 1");
//        JButton button2 = new JButton("Button 2");
//        JButton button3 = new JButton("Button 3");
//
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//
//        frame.setSize(300, 100);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> createAndShowGUI());
//    }
	
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Event Handling Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

	    

}

