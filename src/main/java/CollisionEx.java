import java.awt.EventQueue;
import javax.swing.JFrame;

//Создание окна по данным из board, пользовательский интерфейс
public class CollisionEx extends JFrame {

    public CollisionEx() {

        initUI();
    }

    private void initUI() {

        add(new Board()); //взять данные для стола из класса board

        setResizable(false); //не изменяемый размер
        pack();

        setTitle("Collision"); //название
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            CollisionEx ex = new CollisionEx();
            ex.setVisible(true);
        });
    }
}