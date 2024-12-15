/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graficos.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class PantallaGraficos extends javax.swing.JFrame {

    /**
     * Creates new form PantallaGraficos
     */
    public PantallaGraficos() {
        initComponents();
    }

    public void setPieChart(boolean dim) {
        var dataset = new DefaultPieDataset();
        dataset.setValue("España", 15);
        dataset.setValue("Bulgaria", 85);

        JFreeChart piechart;
        if (dim) {
            piechart = ChartFactory.createPieChart3D("Vuelos", dataset);
        } else {
            piechart = ChartFactory.createPieChart("Vuelos", dataset);
        }

        ChartPanel chartPanel = new ChartPanel(piechart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelL.removeAll();
        jPanelL.setLayout(new BorderLayout());
        jPanelL.add(chartPanel, BorderLayout.CENTER);
        jPanelL.validate();
    }

    public void graficCircular() {
        var dataset = new DefaultPieDataset();
        dataset.setValue("España", 15);
        dataset.setValue("Bulgaria", 85);

        JFreeChart ringChart = ChartFactory.createRingChart("Gráfico Circular", dataset, true, true, false);

        ChartPanel chartPanel = new ChartPanel(ringChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelL.removeAll();
        jPanelL.setLayout(new BorderLayout());
        jPanelL.add(chartPanel, BorderLayout.CENTER);
        jPanelL.validate();
    }

    public void graficBars() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series 1", "Category 1");
        dataset.addValue(3.0, "Series 2", "Category 2");
        dataset.addValue(5.0, "Series 3", "Category 3");

        JFreeChart chart = ChartFactory.createBarChart(
                "Ejemplo de Gráfico de Barras",
                "Categorías",
                "Valores",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        chart.setBackgroundPaint(Color.WHITE);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelL.removeAll();
        jPanelL.setLayout(new BorderLayout());
        jPanelL.add(chartPanel, BorderLayout.CENTER);
        jPanelL.validate();
    }

    public void graficLineaYGuardar() {
        var series2023 = new XYSeries("2023");
        series2023.add(10, 20);
        series2023.add(20, 30);
        series2023.add(30, 40);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series2023);

        JFreeChart lineChart = ChartFactory.createXYLineChart(
                "Gráfico de Línea",
                "X",
                "Y",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelL.removeAll();
        jPanelL.setLayout(new BorderLayout());
        jPanelL.add(chartPanel, BorderLayout.CENTER);
        jPanelL.validate();

        // Guardar como PNG
        try {
            ChartUtils.saveChartAsPNG(new File("line_chart.png"), lineChart, 800, 600);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void graficCascada() {
        DefaultKeyedValues2DDataset dataset = new DefaultKeyedValues2DDataset();
        dataset.addValue(5, "Ganancia", "Enero");
        dataset.addValue(-2, "Ganancia", "Febrero");
        dataset.addValue(3, "Ganancia", "Marzo");

        JFreeChart waterfallChart = ChartFactory.createWaterfallChart(
                "Diagrama en Cascada",
                "Meses",
                "Valores",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(waterfallChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelL.removeAll();
        jPanelL.setLayout(new BorderLayout());
        jPanelL.add(chartPanel, BorderLayout.CENTER);
        jPanelL.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelL = new javax.swing.JPanel();
        jButtonDnormal = new javax.swing.JButton();
        jButtonBars = new javax.swing.JButton();
        jButtonLines = new javax.swing.JButton();
        jButton3D = new javax.swing.JButton();
        jButtonCascade = new javax.swing.JButton();
        jButtonRing = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelLLayout = new javax.swing.GroupLayout(jPanelL);
        jPanelL.setLayout(jPanelLLayout);
        jPanelLLayout.setHorizontalGroup(
            jPanelLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanelLLayout.setVerticalGroup(
            jPanelLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        jButtonDnormal.setBackground(new java.awt.Color(243, 0, 73));
        jButtonDnormal.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonDnormal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDnormal.setText("Diagrama Normal");
        jButtonDnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDnormalActionPerformed(evt);
            }
        });

        jButtonBars.setBackground(new java.awt.Color(126, 152, 255));
        jButtonBars.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonBars.setText("Diagrama Barras");
        jButtonBars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarsActionPerformed(evt);
            }
        });

        jButtonLines.setBackground(new java.awt.Color(110, 185, 235));
        jButtonLines.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonLines.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLines.setText("Diagrama Lineas");
        jButtonLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLinesActionPerformed(evt);
            }
        });

        jButton3D.setBackground(new java.awt.Color(255, 17, 134));
        jButton3D.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButton3D.setForeground(new java.awt.Color(255, 255, 255));
        jButton3D.setText("Diagrama 3D");
        jButton3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3DActionPerformed(evt);
            }
        });

        jButtonCascade.setBackground(new java.awt.Color(99, 255, 209));
        jButtonCascade.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonCascade.setText("Diagrama Cascada");
        jButtonCascade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCascadeActionPerformed(evt);
            }
        });

        jButtonRing.setBackground(new java.awt.Color(255, 116, 107));
        jButtonRing.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonRing.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRing.setText("Diagrama Circular");
        jButtonRing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDnormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCascade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3D, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRing, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanelL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3D, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCascade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBars, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLines, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRing, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanelL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarsActionPerformed
        // TODO add your handling code here:
        PantallaGraficos graphic = new PantallaGraficos();
        graphic.setVisible(true);
        graphic.graficBars(); // Muestra el gráfico de barras
        dispose();

    }//GEN-LAST:event_jButtonBarsActionPerformed

    private void jButtonDnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDnormalActionPerformed
        // TODO add your handling code here:
          PantallaGraficos graphic = new PantallaGraficos();
          graphic.setVisible(true);
          graphic.setPieChart(false); // Muestra el gráfico de sectores
          dispose();
    }//GEN-LAST:event_jButtonDnormalActionPerformed

    private void jButton3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3DActionPerformed
        // TODO add your handling code here:
        PantallaGraficos graphic = new PantallaGraficos();
        graphic.setVisible(true);                
        graphic.setPieChart(true); // Muestra el gráfico 3D
        dispose();

    }//GEN-LAST:event_jButton3DActionPerformed

    private void jButtonCascadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCascadeActionPerformed
        // TODO add your handling code here:
        PantallaGraficos graphic = new PantallaGraficos();
        graphic.setVisible(true);
        graphic.graficCascada(); // Muestra el gráfico en cascada
        dispose();
    }//GEN-LAST:event_jButtonCascadeActionPerformed

    private void jButtonLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLinesActionPerformed
        // TODO add your handling code here:
        PantallaGraficos graphic = new PantallaGraficos();
        graphic.setVisible(true);
        graphic.graficLineaYGuardar(); // Muestra el gráfico de líneas y lo guarda como PNG
        dispose();

    }//GEN-LAST:event_jButtonLinesActionPerformed

    private void jButtonRingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRingActionPerformed
        // TODO add your handling code here:
        PantallaGraficos graphic = new PantallaGraficos();
        graphic.setVisible(true);                
        graphic.graficCircular(); // Muestra el gráfico circular
        dispose();

    }//GEN-LAST:event_jButtonRingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3D;
    private javax.swing.JButton jButtonBars;
    private javax.swing.JButton jButtonCascade;
    private javax.swing.JButton jButtonDnormal;
    private javax.swing.JButton jButtonLines;
    private javax.swing.JButton jButtonRing;
    private javax.swing.JPanel jPanelL;
    // End of variables declaration//GEN-END:variables
}
