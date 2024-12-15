/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficos.main;

/**
 *
 * @author lfelipeh
 */
public class MainGraficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PantallaGraficos graphic = new PantallaGraficos();
        graphic.setVisible(true);

        // GRAFICO NORMAL.
        graphic.setPieChart(false);
        
        // GRAFICO 3D.
        graphic.setPieChart(true);
        
        // GRAFICO DE ANILLO.
        graphic.graficCircular();
        
        // GRAFICO DE BARRAS.
        graphic.graficBars();
        
        // GRAFICO EJE X y Y.
        graphic.graficLineaYGuardar();
                
        // GRAFICO EN CASCADA.
        graphic.graficCascada(); // Muestra el gráfico en cascada
    }
}
