import java.awt.EventQueue;
import javax.swing.JFrame;

//Создание окна по данным из board, пользовательский интерфейс
public class CollisionEx2 extends JFrame {

    public CollisionEx2() {

        initUI();
    }

    private void initUI() {

        add(new Board2()); //взять данные для стола из класса board

        setResizable(false); //не изменяемый размер
        pack();

        setTitle("Collision"); //название
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            CollisionEx2 ex = new CollisionEx2();
            ex.setVisible(true);
        });
    }
}