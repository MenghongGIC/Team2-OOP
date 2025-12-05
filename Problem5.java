import javax.swing.*;

public class Problem5 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("First GUI");
        frame.setSize(350, 350);
        frame.setLayout(null);

        JLabel lbTitle = new JLabel("Calculator");
        lbTitle.setBounds(20, 10, 200, 20);
        frame.add(lbTitle);

        JLabel lbA = new JLabel("A =");
        lbA.setBounds(20, 40, 50, 20);
        frame.add(lbA);

        JTextField txtA = new JTextField();
        txtA.setBounds(60, 40, 150, 25);
        frame.add(txtA);

        JLabel lbB = new JLabel("B =");
        lbB.setBounds(20, 80, 50, 20);
        frame.add(lbB);

        JTextField txtB = new JTextField();
        txtB.setBounds(60, 80, 150, 25);
        frame.add(txtB);

        JLabel lbResult = new JLabel("= ");
        lbResult.setBounds(20, 260, 200, 30);
        frame.add(lbResult);

        JButton btnAdd = new JButton("A + B");
        btnAdd.setBounds(20, 120, 100, 30);
        frame.add(btnAdd);

        btnAdd.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            lbResult.setText("= " + (a + b));
        });

        JButton btnSub = new JButton("A - B");
        btnSub.setBounds(20, 160, 100, 30);
        frame.add(btnSub);

        btnSub.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            lbResult.setText("= " + (a - b));
        });

        JButton btnMul = new JButton("A * B");
        btnMul.setBounds(20, 200, 100, 30);
        frame.add(btnMul);

        btnMul.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            lbResult.setText("= " + (a * b));
        });

        JButton btnDiv = new JButton("A / B");
        btnDiv.setBounds(20, 240, 100, 30);
        frame.add(btnDiv);

        btnDiv.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            if (b == 0) {
                lbResult.setText("= Error (divide by 0)");
            } else {
                lbResult.setText("= " + (a / b));
            }
        });

        frame.setVisible(true);
    }
}
