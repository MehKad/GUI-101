package Components;

import javax.swing.*;

public class Menu extends JFrame {

   private JPanel P1 = new JPanel();

   private JMenu File = new JMenu("File");
   private JMenu Edit = new JMenu("Edit");
   private JMenu View = new JMenu("View");

   public Menu(){
      setTitle("Menus");
      setSize(500,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      P1.add(File);
      P1.add(Edit);
      P1.add(View);

      add(P1);

      setVisible(true);
   }

   public static void main(String[] args) {
      new Menu();
   }
   
}
