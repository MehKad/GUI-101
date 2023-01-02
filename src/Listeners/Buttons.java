package Listeners;
import javax.swing.*;
import java.awt.event.*;

public class Buttons extends JFrame implements ActionListener{

   private JPanel P1 = new JPanel();
   private JButton Yes = new JButton("Yes Page");
   private JButton No = new JButton("No Page");

   public Buttons(){
      setTitle("First Action Listeners");
      setSize(300,100);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      Yes.addActionListener(this);
      No.addActionListener(this);
      P1.add(Yes);
      P1.add(No);
      add(P1);
   }

   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == Yes){
         this.dispose();
         new Yes();
      }
      else{
         this.dispose();
         new No();
      }
   }

   public static void main(String[] args) {
      new Buttons();
   }

   
}
