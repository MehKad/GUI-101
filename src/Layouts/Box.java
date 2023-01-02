package Layouts;
// import java.awt.*;

import javax.swing.*;

public class Box extends JFrame {

   private JButton B1 = new JButton("1");
   private JButton B2 = new JButton("2");
   private JButton B3 = new JButton("3");
   private JButton B4 = new JButton("4");
   private JButton B5 = new JButton("5");

   public Box(){
      setTitle("Box Layout");
      setSize(500,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
      add(B1);
      add(B2);
      add(B3);
      add(B4);
      add(B5);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Box();
   }
   
}
