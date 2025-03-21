package example;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

public class Button extends JFrame {
    private final JButton[] buttons = new JButton[6];
    private final JButton check = new JButton("Check");
    private final Random random = new Random();

    public Button() {
        GridLayout gridLayout = new GridLayout(3, 3, 5, 5);
        setLayout(gridLayout);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            add(buttons[i]);
        }

        add(new JLabel());
        add(check);

        setVisible(true);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomAndHighlight();
            }
        });
    }

    private void generateRandomAndHighlight() {
        for (JButton button : buttons) {
            button.setBackground(null);
        }
        int randomNumber = random.nextInt(6); 
        buttons[randomNumber].setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        Button button = new Button();
    }
}
