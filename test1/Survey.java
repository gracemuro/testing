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
import java.util.Arrays;
        public class Survey extends JPanel implements ActionListener{ 
            int currentCard =0;
            CardLayout cards = new CardLayout();
            SurveyPanel[] ask = new SurveyPanel[3];
            
            public Survey(){
                super();
                setSize(240,140);
                setLayout(cards);
                
                String q1 = "What is your gender?";
                String [] resp1 = {"female", "male", "other"};
                ask[0] = new SurveyPanel(q1, resp1, 2);
                String question2 = "What is you age";
                String[] resp2 ={"Under 25", "25-34", "35-54"};
                ask[1] = new SurveyPanel(question2, resp2, 1);
                addListeners();
                
            }
            private void addListeners(){
                for(int i =0; i < ask.length;i++)
                {
                    ask[i].nextButton.addActionListener(this);
                    ask[i].finalButton.addActionListener(this);
                    add(ask[i],"Card " + i);
                    
                }
            }
              public void actionPerformed(ActionEvent evt)
              {
                  currentCard++;
                  if(currentCard >= ask.length){
                      System.exit(0);
                  }
              
                  cards.show(this,"Card" + currentCard);
              }  
            }
            class SurveyPanel extends JPanel
            {
                JLabel question;
                JRadioButton[] response;
                JButton nextButton = new JButton("Next");
                JButton finalButton = new JButton("Finish");
                
                SurveyPanel(String ques, String[] resp, int def)
                {
                    super();
                    setSize(160,100);
                    question = new JLabel(ques);
                    response = new JRadioButton[resp.length];
                    JPanel sub1 = new JPanel();
                    ButtonGroup group = new ButtonGroup();
                    JLabel quesLabel = new JLabel(ques);
                    sub1.add(quesLabel);
                    JPanel sub2 = new JPanel();
                    for(int i =0; i <resp.length; i++)
                    {
                        if(def == i)
                        {
                            response[i] = new JRadioButton(resp[i],true);
                        }
                        else
                        {
                           response[i] = new JRadioButton(resp[i],false);
                        }
                        group.add(response[i]);
                        sub2.add(response[i]);
                        
                    }
                    JPanel sub3 = new JPanel();
                    nextButton.setEnabled(true);
                    sub3.add(nextButton);
                    finalButton.setEnabled(true);
                    sub3.add(finalButton);
                    GridLayout grid = new GridLayout(3,1);
                    setLayout(grid);
                    add(sub1);
                    add(sub2);
                    add(sub3);
                    
                    
                }
                
               
                
            }
            //setLayout(cc);
            //add(options, "Options");
            
            


