
package vistas;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.awt.Color;
import Modelo.ConectorDB;


public class Lanzador extends javax.swing.JPanel {
    //Instanciamos nuestro Objeto ConectorDB 
    ConectorDB cc = new ConectorDB();
    Connection con = cc.conexion();
    
    public Lanzador() {
        initComponents();
        
        
        FormularioLanzadera fl = new FormularioLanzadera();
        fl.setSize(750, 430);
        fl.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(fl, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabezote = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        BotonCrear = new javax.swing.JPanel();
        Crear = new javax.swing.JLabel();
        BotonVer = new javax.swing.JPanel();
        Ver = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();

        Cabezote.setBackground(new java.awt.Color(0, 0, 0));
        Cabezote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanzadera.png"))); // NOI18N
        Cabezote.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 12, 189, -1));

        Titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("VEHÍCULOS ESPACIALES DE LANZADERA");
        Cabezote.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 470, 70));

        BotonCrear.setBackground(new java.awt.Color(0, 0, 153));
        BotonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCrearMouseExited(evt);
            }
        });

        Crear.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Crear.setText("Crear Nave");

        javax.swing.GroupLayout BotonCrearLayout = new javax.swing.GroupLayout(BotonCrear);
        BotonCrear.setLayout(BotonCrearLayout);
        BotonCrearLayout.setHorizontalGroup(
            BotonCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonCrearLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        BotonCrearLayout.setVerticalGroup(
            BotonCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Crear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BotonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 210, -1, -1));

        BotonVer.setBackground(new java.awt.Color(0, 0, 153));
        BotonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVerMouseExited(evt);
            }
        });

        Ver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Ver.setForeground(new java.awt.Color(255, 255, 255));
        Ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ver.setText("Ver Naves");

        javax.swing.GroupLayout BotonVerLayout = new javax.swing.GroupLayout(BotonVer);
        BotonVer.setLayout(BotonVerLayout);
        BotonVerLayout.setHorizontalGroup(
            BotonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonVerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        BotonVerLayout.setVerticalGroup(
            BotonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ver, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BotonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 210, -1, -1));

        Contenido.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Cabezote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabezote, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseEntered
        BotonCrear.setBackground(Color.white);
        Crear.setForeground(Color.black);
    }//GEN-LAST:event_BotonCrearMouseEntered

    private void BotonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseExited
        BotonCrear.setBackground(new Color(0,0,153));
        Crear.setForeground(Color.white);
    }//GEN-LAST:event_BotonCrearMouseExited

    private void BotonVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVerMouseEntered
        BotonVer.setBackground(Color.white);
        Ver.setForeground(Color.black);
    }//GEN-LAST:event_BotonVerMouseEntered

    private void BotonVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVerMouseExited
        BotonVer.setBackground(new Color(0,0,153));
        Ver.setForeground(Color.white);
    }//GEN-LAST:event_BotonVerMouseExited

    private void BotonVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVerMouseClicked
        VerNavesLanzaderas vnl = new VerNavesLanzaderas();
        vnl.setSize(750, 430);
        vnl.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(vnl, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
        
        
    }//GEN-LAST:event_BotonVerMouseClicked

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked
        FormularioLanzadera fl = new FormularioLanzadera();
        fl.setSize(750, 430);
        fl.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(fl, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BotonCrearMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonCrear;
    private javax.swing.JPanel BotonVer;
    private javax.swing.JPanel Cabezote;
    private javax.swing.JPanel Contenido;
    private javax.swing.JLabel Crear;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Ver;
    private javax.swing.JLabel imagen;
    // End of variables declaration//GEN-END:variables
}
