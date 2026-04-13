import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ScientificCalculator extends JFrame implements ActionListener {
    JTextField display;
    JButton sin, cos, tan, log, sqrt;

    ScientificCalculator() {
        display = new JTextField();
        display.setEditable(true); // Isko true kar diya hai taaki type ho sake

        sin = new JButton("sin");
        cos = new JButton("cos");
        tan = new JButton("tan");
        log = new JButton("log");
        sqrt = new JButton("sqrt");
    

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));
        panel.add(sin);
        panel.add(cos);
        panel.add(tan);
        panel.add(log);
        panel.add(sqrt);

        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        log.addActionListener(this);
        sqrt.addActionListener(this);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X pe click karne pe proper close hoga
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double value = Double.parseDouble(display.getText());
            double result = 0;

            if (e.getSource() == sin) result = Math.sin(Math.toRadians(value));
            else if (e.getSource() == cos) result = Math.cos(Math.toRadians(value));
            else if (e.getSource() == tan) result = Math.tan(Math.toRadians(value));
            else if (e.getSource() == log) result = Math.log(value);
            else if (e.getSource() == sqrt) result = Math.sqrt(value);

            display.setText(String.valueOf(result));
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
} 