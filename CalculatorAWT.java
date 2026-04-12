import java.awt.*;
import java.awt.event.*;

class CalculatorAWT extends Frame implements ActionListener {
    TextField tf1, tf2, tfResult;
    Button add, sub, mul, div;

    CalculatorAWT() {
        // Create components with specific sizes
        tf1 = new TextField(10); 
        tf2 = new TextField(10);
        tfResult = new TextField(10);
        tfResult.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        // Set layout and add components
        setLayout(new FlowLayout());
        add(new Label("Number 1:"));
        add(tf1);
        add(new Label("Number 2:"));
        add(tf2);
        add(new Label("Result:"));
        add(tfResult);

        add(add);
        add(sub);
        add(mul);
        add(div);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Frame settings
        setSize(250, 250); // Thoda size adjust kiya hai taaki sab theek dikhe
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(tf1.getText());
            double num2 = Double.parseDouble(tf2.getText());
            double result = 0;

            if (e.getSource() == add) result = num1 + num2;
            else if (e.getSource() == sub) result = num1 - num2;
            else if (e.getSource() == mul) result = num1 * num2;
            else if (e.getSource() == div) result = num1 / num2;

            tfResult.setText(String.valueOf(result));
        } catch (Exception ex) {
            tfResult.setText("Error");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}