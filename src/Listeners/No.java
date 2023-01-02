package Listeners;
import javax.swing.*;
import java.awt.event.*;

public class No extends JFrame implements ActionListener{

   private JPanel P1 = new JPanel();
   private JLabel txt = new JLabel("No page");
   private JButton Back = new JButton("<");

   public No(){
      setTitle("No");
      setSize(500,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      P1.add(txt);
      P1.add(Back);
      add(P1);
      Back.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e){
      if(e.getSource() == Back){
         this.dispose();
         new Buttons();
      }
   }
   
}
