/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author lfelipeh
 */
public class CustomPanel  extends JPanel implements Serializable {

    // POR DEFECTO NOS SACA EL EXPLORADOR PERSONAL DE LA MAQUINA.
    private File backgroundImage;
    private boolean ratonPresionado;
    private Point puntoPresion;
    
    public CustomPanel() {
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(ratonPresionado) {
                    Point posicionActual = e.getPoint();
                    if(Math.abs(puntoPresion.x - puntoPresion.x) > 50) {
                        System.out.println("Funciona el arrastre.");
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ratonPresionado = true;
                puntoPresion = e.getPoint();
            }
            
        });
    }

    public File getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(File backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if(backgroundImage != null && backgroundImage.exists()) {
            Image imgBackground = Toolkit.getDefaultToolkit().createImage(backgroundImage.getAbsolutePath());
            System.out.println("Funciona imagen fondo");
            imgBackground = imgBackground.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon img2 = new ImageIcon(imgBackground); 
            g.drawImage(img2.getImage(), 0, 0, null);
        }
    }
    
}