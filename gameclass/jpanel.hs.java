import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeScreen extends JPanel implements ActionListener {
    private JButton startButton;
    private JTextField playerNameField;
    private JComboBox<String> weaponComboBox;
    private JLabel titleLabel;
    private JLabel playerNameLabel;
    private JLabel weaponLabel;

    public HomeScreen() {
        // Set layout manager
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Create title label
        titleLabel = new JLabel("War Zone Warriors");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        // Create player name label and field
        playerNameLabel = new JLabel("Enter your name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(playerNameLabel, gbc);
        playerNameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(playerNameField, gbc);

        // Create weapon label and combo box
        weaponLabel = new JLabel("Select your weapon:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(weaponLabel, gbc);
        weaponComboBox = new JComboBox<>(new String[] {"Pistol", "Rifle"});
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(weaponComboBox, gbc);

        // Create start button
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(startButton, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            String playerName = playerNameField.getText();
            String selectedWeapon = (String) weaponComboBox.getSelectedItem();
            // Start game with selected player name and weapon
            // ...
        }
    }
}
