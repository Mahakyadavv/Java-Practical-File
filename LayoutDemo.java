import java.awt.*;

class LayoutDemo extends Frame {
    LayoutDemo() {
        setLayout(new GridLayout(2, 2));

        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutDemo();
    }
}
