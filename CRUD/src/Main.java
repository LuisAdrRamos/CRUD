import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JFrame create = new JFrame("Crear");
        create.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        create.setContentPane(new update().UPDATE);
        create.pack();
        create.setSize(400, 400);
        create.setLocationRelativeTo(null);
        create.setVisible(true);
    }
}