import javax.swing.*;

public class Hello {

    String nameOfTheMan = "Ivan";
    int height = 186;

    public static void main(String[] args) {

        System.out.println("Hello World " + args[0]);

        JFrame jFrame = new JFrame("321");
        jFrame.setSize(800, 600);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setText("123");

        jFrame.add(jTextPane);

        jFrame.setVisible(true);
    }
}
