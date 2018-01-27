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

public class frameConstructor extends JFrame implements ActionListener {

    private Button button1;

    public frameConstructor()
    {
        super("pls wprk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360,120);
        FlowLayout lm = new FlowLayout(FlowLayout.CENTER);
        setLayout(lm);
    
        this.setSize(100, 100);
        this.setVisible(true);

        JButton button1 = new JButton("1");
        button1.addActionListener(this);
        add(button1);
    }


    public static void main(String[] args) {

        frameConstructor calc = new frameConstructor();
        calc.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            JOptionPane.showMessageDialog(null, "Goodbye");
        }
            }
    
}