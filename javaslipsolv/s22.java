import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class s22 extends JFrame {
    JLabel eventLabel;

    s22() {
        eventLabel = new JLabel("No event yet");
        eventLabel.setHorizontalAlignment(SwingConstants.CENTER);
        eventLabel.setForeground(Color.BLACK);
        add(eventLabel);

        MyMouseAdapter mouseAdapter = new MyMouseAdapter();
        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);

        setTitle("Mouse Event Handling");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            displayEvent("Mouse Pressed", Color.RED);
        }

        public void mouseReleased(MouseEvent e) {
            displayEvent("Mouse Released", Color.RED);
        }

        public void mouseClicked(MouseEvent e) {
            displayEvent("Mouse Clicked", Color.RED);
        }

        public void mouseEntered(MouseEvent e) {
            displayEvent("Mouse Entered", Color.RED);
        }

        public void mouseExited(MouseEvent e) {
            displayEvent("Mouse Exited", Color.RED);
        }

        public void mouseDragged(MouseEvent e) {
            displayEvent("Mouse Dragged", Color.RED);
        }

        public void mouseMoved(MouseEvent e) {
            displayEvent("Mouse Moved", Color.RED);
        }
    }

    private void displayEvent(String eventName, Color color) {
        eventLabel.setText(eventName);
        eventLabel.setForeground(color);
    }

    public static void main(String[] args) {
        new s22();
    }
}