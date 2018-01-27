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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Suspense extends JFrame implements ActionListener  {
   private int numClicks= 0;
     private int numClicks1= 0;
         private int numClicks2= 0;
   
   TextField text = new TextField(20);
   TextField text1 = new TextField(20);
   TextField text2 = new TextField(20);
   
    private enum Actions {
    DOGS,
    CATS,
    NEITHER
    
    
  
    }
     
     
    public Suspense(){
        super("Cats or Dogs?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360,120);
        FlowLayout lm = new FlowLayout(FlowLayout.CENTER);
        setLayout(lm);
        JButton a = new JButton("Dogs");
        JButton b = new JButton("Cats");
        JButton c = new JButton("Neither");
        add(text);
        add(text1);
        add(text2);
        
        add(a);
         a.setActionCommand(Actions.DOGS.name());
         b.setActionCommand(Actions.CATS.name());
         c.setActionCommand(Actions.NEITHER.name());

        add(b);
        add(c);

        
       a.addActionListener(this);
         b.addActionListener(this);
          c.addActionListener(this);

        
         setVisible(true);
        
    }
  private void setLookAndFeel(){
      try{
          UIManager.setLookAndFeel(
                  "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
          SwingUtilities.updateComponentTreeUI(this);
      }catch(Exception exc){
         System.out.println("system" + exc);
    }
  }

 
    public static void main(String[] args){
         Suspense frame = new Suspense();
     }
   
  
public void actionPerformed(ActionEvent e) { 
    
   if (e.getActionCommand() == Actions.DOGS.name()) {
      JOptionPane.showMessageDialog(null, "You have voted for dogs!!");
            numClicks++;
            text.setText("Votes for Dogs " + numClicks);
            if(numClicks >= 5)
            {text.setText("Dogs WIN!!!");
            text1.setText("Dogs WIN!!!");
            text2.setText("Dogs WIN!!!");
            }
             if(numClicks1 >= 5 )
          {
              
              text.setText("Cats WIN!!");
              JOptionPane.showMessageDialog(null, "Cats have already won");
              
          }
           if(numClicks2 >= 5 )
          {
              
              text.setText("Neither WIN!!");
              JOptionPane.showMessageDialog(null, "Neither has already won");
          }
   
    } else if (e.getActionCommand() == Actions.CATS.name()) {
      JOptionPane.showMessageDialog(null, "You have voted for Cats");
         numClicks1++;
          text1.setText("Votes for Cats" + numClicks1);
           if(numClicks1 >= 5)
            {text1.setText("Cats WIN!!!");
            text.setText("Cats WIN!!!");
            text2.setText("Cats WIN!!!");
            }
           
            if(numClicks >= 5 )
          {
              
              text1.setText("Dogs WIN!!");
              JOptionPane.showMessageDialog(null, "Dogs have already won");
          }
           if(numClicks2 >= 5 )
          {
              
              text1.setText("Neither WIN!!");
              JOptionPane.showMessageDialog(null, "Neither has already won");
          }
   
    }
     else if (e.getActionCommand() == Actions.NEITHER.name()) {
      JOptionPane.showMessageDialog(null, "You have voted for neither");
         numClicks2++;
         text2.setText("Votes for Netiher" + numClicks2);
          if(numClicks2 >= 5)
            {text2.setText("Neither WINS!!!");
            text.setText("Neither WINS!!!");
            text1.setText("Neither WINS!!!");
            
            }
          if(numClicks >= 5 )
          {
              
              text2.setText("Dogs WIN!!");
              JOptionPane.showMessageDialog(null, "Dogs have already won");
          }
           if(numClicks1 >= 5 )
          {
              
              text2.setText("Cats WIN!!");
            
               JOptionPane.showMessageDialog(null, "Cats have already won");
          }
   
   
       } 

                
     }       
}
