import java.awt.*;
import java.awt.event.*;

class WindowEventDemo extends Frame implements WindowListener {
    WindowEventDemo() {
        addWindowListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new WindowEventDemo();
    }
}