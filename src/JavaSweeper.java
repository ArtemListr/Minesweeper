import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private JPanel panel; //панель для рисования

    public static void main(String[] args) {

        new JavaSweeper();
    }

    private JavaSweeper() {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        add(panel);
    }

    // метод запуска окна
    private void initFrame() {
        // pack устанавливает минимальный необходимый размер контейнера для отображения всех элементов
        pack();
        // настройка для остановки программы при закрытии окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // установка заголовка окна
        setTitle("Сапёр");
        //установка окна по центру
        setLocationRelativeTo(null);
        //установка неизменяемого размера окна
        setResizable(false);
        setVisible(true);
    }

}