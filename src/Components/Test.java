package Components;
import javax.swing.*;

public class Test extends JFrame {

   JPanel P1 = new JPanel();
   JRadioButton ok = new JRadioButton("YES");
   JRadioButton rb = new JRadioButton("NO");
   JRadioButton tf = new JRadioButton("CANCEL");

   public Test(){
      setTitle("Components");
      setSize(500,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      P1.add(ok);
      P1.add(rb);
      P1.add(tf);
      add(P1);
   }
   public static void main(String[] args) {
      new Test();
   }
}
