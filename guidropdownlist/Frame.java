/*
 * By:     Matthew Fischer
 * Date:   
 */
package guidropdownlist;

/**
 *
 * @author Matthew Fischer
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Frame extends JFrame{
    
    private JComboBox box;
    private JLabel picture;
    
    private static String[] filename = {"b.png","x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    
    public Frame(){
        super("the title");
        setLayout(new FlowLayout());
        
        box = new JComboBox(filename);
        
        box.addItemListener( 
            new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent event) {
                
                    if(event.getStateChange()==ItemEvent.SELECTED)
                        picture.setIcon(pics[box.getSelectedIndex()]);
        
                    }
                }
            );
        
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }
    
   
}
