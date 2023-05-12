import javax.swing.*;
import java.awt.*;

public class Game {
    private JFrame frame;
    private HomeScreen homeScreen;
    // ...

    public Game() {
        // Create main window
        frame = new JFrame("Multiplayer Shooting Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create home screen
        homeScreen = new HomeScreen();

        // Add home screen to main window
        frame.add(homeScreen);

        // Show main window
        frame.setVisible(true);
    }

    // ...
}
