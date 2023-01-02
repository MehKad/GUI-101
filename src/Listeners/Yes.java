package Listeners;
import javax.swing.*;
import java.awt.event.*;

public class Yes extends JFrame implements ActionListener{

   private JPanel P1 = new JPanel();
   private JLabel txt = new JLabel("Yes page");
   private JButton Back = new JButton("<");

   public Yes(){
      setTitle("Yes");
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
