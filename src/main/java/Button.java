import javax.swing.*;
import java.awt.*;

public class Button {
    static JFrame frame = new JFrame("Some name goes here");
    static Container contentPane = frame.getContentPane();

    private static final int BUTTON1_LOCATION_X = 300;  // location x
    private static final int BUTTON1_LOCATION_Y = 50;   // location y
    private static final int BUTTON2_LOCATION_X = 300;  // location x
    private static final int BUTTON2_LOCATION_Y = 120;   // location y
    private static final int BUTTON_SIZE_X = 140;      // size height
    private static final int BUTTON_SIZE_Y = 50;       // size width

    public static void newGameButton(){
        JButton startButton = new JButton("Click Me To Start!");
        startButton.setBounds(BUTTON1_LOCATION_X
                , BUTTON1_LOCATION_Y,
                BUTTON_SIZE_X,
                BUTTON_SIZE_Y );
        contentPane.add(startButton);

    }

    public static void exitButton(){
        JButton startButton = new JButton("Click Me To Start!");
        startButton.setBounds(BUTTON2_LOCATION_X
                , BUTTON2_LOCATION_Y,
                BUTTON_SIZE_X,
                BUTTON_SIZE_Y );
        contentPane.add(startButton);
    }

    public static void nextLevelButton(){
        JButton startButton = new JButton("Click Me To Start!");
        startButton.setBounds(BUTTON1_LOCATION_X
                , BUTTON1_LOCATION_Y,
                BUTTON_SIZE_X,
                BUTTON_SIZE_Y );
        contentPane.add(startButton);
    }
}
