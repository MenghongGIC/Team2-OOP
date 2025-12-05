import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("First GUI");
        JLabel I1,I2;
        I1 = new JLabel("Count number of Vowel, Consonant and Space");
        I1.setBounds(50,20,300,30);
        jFrame.add(I1);

        I2 = new JLabel("Text:");
        I1.setBounds(50,60,100,30);
        jFrame.add(I2);

        JTextField textField = new JTextField();
        textField.setBounds(50,90,250,30);
        jFrame.add(textField);

        JButton findBtn = new JButton("Find");
        findBtn.setBounds(50,140,100,35);
        jFrame.add(findBtn);

        JLabel vowelLabel = new JLabel("Count of vowel is: ");
        vowelLabel.setBounds(50, 190, 250, 30);
        jFrame.add(vowelLabel);

        JLabel consonantLabel = new JLabel("Count of consonant is: ");
        consonantLabel.setBounds(50, 220, 250, 30);
        jFrame.add(consonantLabel);

        JLabel spaceLabel = new JLabel("Count of space is: ");
        spaceLabel.setBounds(50, 250, 250, 30);
        jFrame.add(spaceLabel);

        findBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText().toLowerCase();

                int vowel = 0, consonant = 0, space = 0;

                for (char c : text.toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) {
                        vowel++;
                    } else if (c >= 'a' && c <= 'z') {
                        consonant++;
                    } else if (c == ' ') {
                        space++;
                    }
                }

                vowelLabel.setText("Count of vowel is: " + vowel);
                consonantLabel.setText("Count of consonant is: " + consonant);
                spaceLabel.setText("Count of space is: " + space);
            }
        });
        jFrame.setSize(300,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(500,380);

    }

}
