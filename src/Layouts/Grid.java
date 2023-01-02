package Layouts;
import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {

   private JButton B1 = new JButton("1");
   private JButton B2 = new JButton("2");
   private JButton B3 = new JButton("3");
   private JButton B4 = new JButton("4");
   private JButton B5 = new JButton("5");
   private JButton B6 = new JButton("6");
   private JButton B7 = new JButton("7");

   public Grid(){
      setTitle("Grid Layout");
      setSize(500, 300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(new GridLayout(3,2));
      add(B1);
      add(B2);
      add(B3);
      add(B4);
      add(B5);
      add(B6);
      add(B7);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Grid();
   }
}
