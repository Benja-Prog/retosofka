

package vistas;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.awt.Color;
import Modelo.ConectorDB;

public class BuscarNaves extends javax.swing.JPanel {

    
    public BuscarNaves() {
        initComponents();
        
        //Cuando se ingresa a la vista "BuscarNaves" mostrará automaticamente el conrenido de la vista "BuscarLanzadera"
        BuscarLanzadera bl= new BuscarLanzadera();
        bl.setSize(750, 447);
        bl.setLocation(0, 0);
        
        ContenidoBuscar.removeAll();
        ContenidoBuscar.add(bl, BorderLayout.CENTER);
        ContenidoBuscar.revalidate();
        ContenidoBuscar.repaint();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabezote = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonBuscarLanzadera = new javax.swing.JPanel();
        BuscarLan = new javax.swing.JLabel();
        BuscarNoTripulada = new javax.swing.JPanel();
        BuscarNoTri = new javax.swing.JLabel();
        BuscarTripuladas = new javax.swing.JPanel();
        BuscarTri = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContenidoBuscar = new javax.swing.JPanel();

        Cabezote.setBackground(new java.awt.Color(0, 0, 0));
        Cabezote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("¿QUE TIPO DE NAVE DESEA BUSCAR?");
        Cabezote.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 470, 70));

        BotonBuscarLanzadera.setBackground(new java.awt.Color(0, 0, 153));
        BotonBuscarLanzadera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarLanzaderaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBuscarLanzaderaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBuscarLanzaderaMouseExited(evt);
            }
        });

        BuscarLan.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscarLan.setForeground(new java.awt.Color(255, 255, 255));
        BuscarLan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarLan.setText("Buscar Lanzadera");

        javax.swing.GroupLayout BotonBuscarLanzaderaLayout = new javax.swing.GroupLayout(BotonBuscarLanzadera);
        BotonBuscarLanzadera.setLayout(BotonBuscarLanzaderaLayout);
        BotonBuscarLanzaderaLayout.setHorizontalGroup(
            BotonBuscarLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonBuscarLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuscarLan, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonBuscarLanzaderaLayout.setVerticalGroup(
            BotonBuscarLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonBuscarLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuscarLan, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BotonBuscarLanzadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        BuscarNoTripulada.setBackground(new java.awt.Color(0, 0, 153));
        BuscarNoTripulada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarNoTripuladaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarNoTripuladaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarNoTripuladaMouseExited(evt);
            }
        });

        BuscarNoTri.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscarNoTri.setForeground(new java.awt.Color(255, 255, 255));
        BuscarNoTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarNoTri.setText("Buscar No Tripuladas");

        javax.swing.GroupLayout BuscarNoTripuladaLayout = new javax.swing.GroupLayout(BuscarNoTripulada);
        BuscarNoTripulada.setLayout(BuscarNoTripuladaLayout);
        BuscarNoTripuladaLayout.setHorizontalGroup(
            BuscarNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuscarNoTri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        BuscarNoTripuladaLayout.setVerticalGroup(
            BuscarNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarNoTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuscarNoTri, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BuscarNoTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 190, -1));

        BuscarTripuladas.setBackground(new java.awt.Color(0, 0, 153));
        BuscarTripuladas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarTripuladasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarTripuladasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarTripuladasMouseExited(evt);
            }
        });

        BuscarTri.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscarTri.setForeground(new java.awt.Color(255, 255, 255));
        BuscarTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarTri.setText("Buscar Tripuladas");

        javax.swing.GroupLayout BuscarTripuladasLayout = new javax.swing.GroupLayout(BuscarTripuladas);
        BuscarTripuladas.setLayout(BuscarTripuladasLayout);
        BuscarTripuladasLayout.setHorizontalGroup(
            BuscarTripuladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuscarTri, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        BuscarTripuladasLayout.setVerticalGroup(
            BuscarTripuladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarTripuladasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuscarTri, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BuscarTripuladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanzadera-mini.png"))); // NOI18N
        Cabezote.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No tripuladas-mini.png"))); // NOI18N
        Cabezote.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 110, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apolo 11-mini.png"))); // NOI18N
        Cabezote.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, 110));

        ContenidoBuscar.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout ContenidoBuscarLayout = new javax.swing.GroupLayout(ContenidoBuscar);
        ContenidoBuscar.setLayout(ContenidoBuscarLayout);
        ContenidoBuscarLayout.setHorizontalGroup(
            ContenidoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenidoBuscarLayout.setVerticalGroup(
            ContenidoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabezote, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
            .addComponent(ContenidoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabezote, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ContenidoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarLanzaderaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarLanzaderaMouseEntered
        BotonBuscarLanzadera.setBackground(Color.white);
        BuscarLan.setForeground(Color.black);
    }//GEN-LAST:event_BotonBuscarLanzaderaMouseEntered

    private void BotonBuscarLanzaderaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarLanzaderaMouseExited
        BotonBuscarLanzadera.setBackground(new Color(0,0,153));
        BuscarLan.setForeground(Color.white);
    }//GEN-LAST:event_BotonBuscarLanzaderaMouseExited

    private void BuscarTripuladasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTripuladasMouseClicked
       BuscarTripuladas bt = new BuscarTripuladas();
        bt.setSize(750, 447);
        bt.setLocation(0, 0);
        
        ContenidoBuscar.removeAll();
        ContenidoBuscar.add(bt, BorderLayout.CENTER);
        ContenidoBuscar.revalidate();
        ContenidoBuscar.repaint();
    }//GEN-LAST:event_BuscarTripuladasMouseClicked

    private void BuscarTripuladasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTripuladasMouseEntered
        BuscarTripuladas.setBackground(Color.white);
        BuscarTri.setForeground(Color.black);
    }//GEN-LAST:event_BuscarTripuladasMouseEntered

    private void BuscarTripuladasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTripuladasMouseExited
        BuscarTripuladas.setBackground(new Color(0,0,153));
        BuscarTri.setForeground(Color.white);
    }//GEN-LAST:event_BuscarTripuladasMouseExited

    private void BuscarNoTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarNoTripuladaMouseClicked
        BuscarNoTripuladas bnt = new BuscarNoTripuladas();
        bnt.setSize(750, 447);
        bnt.setLocation(0, 0);
        
        ContenidoBuscar.removeAll();
        ContenidoBuscar.add(bnt, BorderLayout.CENTER);
        ContenidoBuscar.revalidate();
        ContenidoBuscar.repaint();
    }//GEN-LAST:event_BuscarNoTripuladaMouseClicked

    private void BuscarNoTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarNoTripuladaMouseEntered
        BuscarNoTripulada.setBackground(Color.white);
        BuscarNoTri.setForeground(Color.black);
    }//GEN-LAST:event_BuscarNoTripuladaMouseEntered

    private void BuscarNoTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarNoTripuladaMouseExited
        BuscarNoTripulada.setBackground(new Color(0,0,153));
        BuscarNoTri.setForeground(Color.white);
    }//GEN-LAST:event_BuscarNoTripuladaMouseExited

    private void BotonBuscarLanzaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarLanzaderaMouseClicked
        BuscarLanzadera blz = new BuscarLanzadera();
        blz.setSize(750, 447);
        blz.setLocation(0, 0);
        
        ContenidoBuscar.removeAll();
        ContenidoBuscar.add(blz, BorderLayout.CENTER);
        ContenidoBuscar.revalidate();
        ContenidoBuscar.repaint();
    }//GEN-LAST:event_BotonBuscarLanzaderaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBuscarLanzadera;
    private javax.swing.JLabel BuscarLan;
    private javax.swing.JLabel BuscarNoTri;
    private javax.swing.JPanel BuscarNoTripulada;
    private javax.swing.JLabel BuscarTri;
    private javax.swing.JPanel BuscarTripuladas;
    private javax.swing.JPanel Cabezote;
    private javax.swing.JPanel ContenidoBuscar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
