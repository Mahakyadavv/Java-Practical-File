import java.awt.*;
import java.awt.event.*;

class KeyEventDemo extends Frame implements KeyListener {
    Label label;
    TextArea textArea;

    KeyEventDemo() {
        label = new Label();
        label.setBounds(20, 50, 300, 20);
        textArea = new TextArea();
        textArea.setBounds(20, 80, 300, 200);

        textArea.addKeyListener(this);

        add(label);
        add(textArea);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}