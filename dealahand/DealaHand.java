/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealahand;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class DealaHand extends JFrame implements ActionListener{
    
    Deck deck;
    
    Container content = this.getContentPane();
    
    JPanel top = new JPanel();
    JPanel bottom = new JPanel();
    
    JButton deal = new JButton("Deal a Hand");
    JButton reset = new JButton("New Deck");
    
    JLabel status = new JLabel("Start of Deck");
    
    JLabel[] displayHand = new JLabel[5];
    Card[] hand = new Card[5];
    
    public DealaHand(){
        
        createWindow();
        
        // deck created
        deck = new Deck();
        deck.populate();
        deck.shuffle();
        
        content.add(status,BorderLayout.NORTH);
        top.add(new JLabel("Push to deal a hand"));
        top.add(deal);
        top.add(reset);
        
        content.add(top,BorderLayout.CENTER);
        deal.addActionListener(this);
        reset.addActionListener(this);
        
        bottom.setLayout(new GridLayout(1,5,3,3));
        bottom.setBackground(Color.white);
        
        content.add(bottom,BorderLayout.SOUTH);
        
        for(int row = 0; row < 5; row++){
            displayHand[row] = new JLabel("empty");
            displayHand[row].setForeground(Color.blue);
            bottom.add(displayHand[row]);
        }
        
        
    }
    
    public void createWindow()
    {
        // create program window
        this.setVisible(true);// set window visible
        this.setSize(500,500);// set window size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window will close on exiting button
        this.setTitle("Deal a Hand of Cards");// set window title
    }
    public static void main(String[] args) {
        DealaHand game = new DealaHand();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deal){
            status.setText("Next Hand");
            dealNewHand();
            if(deck.isEmpty()){
                status.setText("End of Deck");

            }
        }
        else{
            status.setText("New Deck");
            deck.populate();
            deck.shuffle();
                
            emptyHand();
        }
        
            
    }
    
    // method dealNewHand
    public void dealNewHand(){
        if(deck.isEmpty()){
            status.setText("Not enough cards. Hit NEW DECK button");
        }
        else{
            Card temp;
            for(int i = 0; i < 5; i++){
                temp = deck.dealCard();
                hand[i] = temp;
                displayHand[i].setText(hand[i].toString());

                // set color
                if(temp.getSuit() % 2 == 0)
                    displayHand[i].setForeground(Color.red);
                else
                    displayHand[i].setForeground(Color.black);
            }
        }
    }
    
    // empty hand
    public void emptyHand(){
        for(int row = 0; row < 5; row++){
            displayHand[row].setText("empty");
            displayHand[row].setForeground(Color.blue);
            bottom.add(displayHand[row]);
        }
    }
    
}
