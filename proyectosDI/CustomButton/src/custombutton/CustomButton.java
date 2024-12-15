/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custombutton;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author estudiante
 */
public class CustomButton extends JButton implements Serializable {

    private Listener listen = null;
    
    public CustomButton() {
        setVisual();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                 if(listen != null) {
                    listen.exited();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(listen != null) {
                    listen.entered();
                }
            }
    
        });
    }
    
    public void addEnterExitEvents(Listener Plistener) {
        this.listen = Plistener;
    }
    
    private void setVisual() {
        this.setBackground(Color.red);
        this.setForeground(Color.white);
        Font fontStyle = new Font("Verdana", Font.BOLD, 24);
        this.setFont(fontStyle);
    }
    
}
