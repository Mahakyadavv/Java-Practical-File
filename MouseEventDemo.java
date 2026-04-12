import java.awt.*;
import java.awt.event.*;

class MouseEventDemo extends Frame implements MouseListener {
    Label label;

    MouseEventDemo() {
        label = new Label();
        label.setBounds(20, 50, 300, 20);

        add(label);
        addMouseListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
