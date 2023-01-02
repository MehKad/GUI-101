package Components;
import javax.swing.*;

public class OutPutBox{
   public OutPutBox(){
      int x = JOptionPane.showConfirmDialog(null, "Are you an adult?","What Box",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
      if(x == JOptionPane.NO_OPTION){
         System.out.println("no " + x);
      }
      else if(x == JOptionPane.YES_OPTION){
         System.out.println("yes " + x);
      }
      else if(x == JOptionPane.CANCEL_OPTION){
         System.out.println("cancel " + x);
      }
      else if(x == JOptionPane.CLOSED_OPTION){
         System.out.println("exit " + x);
      }
   }
   public static void main(String[] args) {
      new OutPutBox();
   }
}
