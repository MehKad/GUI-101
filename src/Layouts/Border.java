package Layouts;
import java.awt.BorderLayout;

import javax.swing.*;

public class Border extends JFrame {

   private JButton B1 = new JButton("1");
   private JButton B2 = new JButton("2");
   private JButton B3 = new JButton("3");
   private JButton B4 = new JButton("4");
   private JButton B5 = new JButton("5");

   public Border(){
      setTitle("Border Layout");
      setSize(500,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(B1,BorderLayout.NORTH);
      add(B2,BorderLayout.SOUTH);
      add(B3,BorderLayout.EAST);
      add(B4,BorderLayout.WEST);
      add(B5,BorderLayout.CENTER);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Border();
   }
   
}
