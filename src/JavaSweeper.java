import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private JPanel panel; //панель для рисования
    //Константы для панели
    private  final int COLS = 15;
    private final int ROWS = 10;
    private final int IMAGE_SIZE = 50;

    public static void main(String[] args) {

        new JavaSweeper();
    }

    private JavaSweeper() {
        initPanel(); // инициализация панели
        initFrame(); // инициализация фрейма
    }

    private void initPanel() {
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"),0,0,this);
                g.drawImage(getImage("flagged"),IMAGE_SIZE,0,this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS*IMAGE_SIZE, ROWS*IMAGE_SIZE));
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

    private Image getImage(String name){
        String filename = "img/"+name.toLowerCase()+".png";
        Image icon = new ImageIcon(getClass().getResource(filename)).getImage();
        return icon;
    }

}