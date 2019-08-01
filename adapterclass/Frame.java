/*
 * By:     Matthew Fischer
 * Date:   
 */
package adapterclass;

/**
 *
 * @author Matthew Fischer
 */
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Frame extends JFrame{
    
    private String detail;
    private JLabel statusBar;
    
    public Frame(){
        super("title");
        
        statusBar = new JLabel("this is default");
        add(statusBar,BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }
    
    private class Mouseclass extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            detail = String.format("You clicked %d ", e.getClickCount());
            
            if(e.isMetaDown())
                detail += "with right mouse button";
            else if(e.isAltDown())
                detail += "with center of mouse";
            else
                detail += "with left mouse button";
            
            statusBar.setText(detail);
        }
    }
}
