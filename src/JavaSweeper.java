import javax.swing.*;

public class JavaSweeper extends JFrame {
    public static void main(String[] args) {

        new JavaSweeper();
    }


    private JavaSweeper(){
        initFrame();
    }

    // метод запуска окна
    private void initFrame(){
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