package SortingJTable;
import javax.swing.*;


public class RunSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                UnsupportedLookAndFeelException ignored) {
        }
        //set image icon
        ImageIcon imageIcon = new ImageIcon("res/Bearly.png");
        JFrame jFrame = new JFrame("form sorting");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new Sorting().getrootPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(390, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}