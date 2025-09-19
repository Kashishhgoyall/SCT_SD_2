import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessTheNumberGUI extends JFrame {
    private int numberToGuess;
    private int attempts;
    private JTextField guessField;
    private JLabel feedbackLabel;

    public GuessTheNumberGUI() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        attempts = 0;

        // Frame setup
        setTitle("Guess The Number 🎯");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter your guess (1-100): "));
        guessField = new JTextField(10);
        inputPanel.add(guessField);

        // Button
        JButton guessButton = new JButton("Guess");
        inputPanel.add(guessButton);

        // Feedback label
        feedbackLabel = new JLabel(" ");
        feedbackLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(inputPanel);
        add(feedbackLabel);

        // Event handling
        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        // Enter key handling
        guessField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    private void checkGuess() {
        String input = guessField.getText();

        try {
            int guess = Integer.parseInt(input);
            attempts++;

            if (guess < numberToGuess) {
                feedbackLabel.setText("📉 Too low! Attempts: " + attempts);
            } else if (guess > numberToGuess) {
                feedbackLabel.setText("📈 Too high! Attempts: " + attempts);
            } else {
                feedbackLabel.setText("✅ Correct! Guessed in " + attempts + " attempts.");
                JOptionPane.showMessageDialog(this, 
                        "Congratulations 🎉! You guessed the number in " + attempts + " attempts.");
                resetGame();
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("⚠️ Please enter a valid number!");
        }

        guessField.setText("");
    }

    private void resetGame() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        attempts = 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GuessTheNumberGUI game = new GuessTheNumberGUI();
            game.setVisible(true);
        });
    }
}
