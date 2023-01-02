package Components;

import javax.swing.*;

public class Input {

  public Input() {
    String text = JOptionPane.showInputDialog("Whats your name?");
    System.out.println(text);
  }

  public static void main(String[] args) {
    new Input();
  }
}
