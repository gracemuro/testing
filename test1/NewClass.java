/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author gracemuro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NewClass extends JFrame implements ActionListener {
   private enum Actions{
       MAIL, DOG, PUPPY
   }
    
  public NewClass()
  {

    super("buttons");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(360,120);
     FlowLayout lm = new FlowLayout(FlowLayout.CENTER);
     setLayout(lm);
    
    JButton b1 = new JButton();
    
    add(b1);
    b1.addActionListener(this);
    b1.setActionCommand(Actions.MAIL.name());
    setVisible(true);
  }
  
  
  
  
  public void main (String args[])
  {
      NewClass frame =  new NewClass();
  }
  
  public void actionPerformed(ActionEvent evt)
  {
      if(evt.getActionCommand() == Actions.MAIL.name())
      {
          JOptionPane.showMessageDialog(null,"MAIL!");
      }
  }
  
}
