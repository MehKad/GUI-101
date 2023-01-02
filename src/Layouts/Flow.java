package Layouts;
import javax.swing.*;
public class Flow extends JFrame {
   private JButton B1 = new JButton("1");
   private JButton B2 = new JButton("2");
   private JButton B3 = new JButton("3");
   private JButton B4 = new JButton("4");
   private JButton B5 = new JButton("5");
   private JButton B6 = new JButton("6");
   private JPanel pan1 = new JPanel();

   public Flow(){
      setTitle("Flow Layout");
      setSize(300,150);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pan1.add(B1);
      pan1.add(B2);
      pan1.add(B3);
      pan1.add(B4);
      pan1.add(B5);
      pan1.add(B6);
      add(pan1);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Flow();
   }

}
