
package vistas;

import java.awt.Color;

public class DespegarNave extends javax.swing.JPanel {

   
    public DespegarNave() {
        initComponents();
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabezote = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonLanzadera = new javax.swing.JPanel();
        LanzarLan = new javax.swing.JLabel();
        BotonNoTripulada = new javax.swing.JPanel();
        LanzarNoTri = new javax.swing.JLabel();
        BotonTripulada = new javax.swing.JPanel();
        LanzarTri = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContenidoLanzar = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cabezote.setBackground(new java.awt.Color(0, 0, 0));
        Cabezote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("¿QUE TIPO DE NAVE DESEA PROBAR?");
        Cabezote.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 470, 70));

        BotonLanzadera.setBackground(new java.awt.Color(0, 0, 153));
        BotonLanzadera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLanzaderaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonLanzaderaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonLanzaderaMouseExited(evt);
            }
        });

        LanzarLan.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LanzarLan.setForeground(new java.awt.Color(255, 255, 255));
        LanzarLan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LanzarLan.setText("Lanzadera");

        javax.swing.GroupLayout BotonLanzaderaLayout = new javax.swing.GroupLayout(BotonLanzadera);
        BotonLanzadera.setLayout(BotonLanzaderaLayout);
        BotonLanzaderaLayout.setHorizontalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LanzarLan, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonLanzaderaLayout.setVerticalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LanzarLan, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BotonLanzadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        BotonNoTripulada.setBackground(new java.awt.Color(0, 0, 153));
        BotonNoTripulada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNoTripuladaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNoTripuladaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNoTripuladaMouseExited(evt);
            }
        });

        LanzarNoTri.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LanzarNoTri.setForeground(new java.awt.Color(255, 255, 255));
        LanzarNoTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LanzarNoTri.setText("No Tripulada");

        javax.swing.GroupLayout BotonNoTripuladaLayout = new javax.swing.GroupLayout(BotonNoTripulada);
        BotonNoTripulada.setLayout(BotonNoTripuladaLayout);
        BotonNoTripuladaLayout.setHorizontalGroup(
            BotonNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LanzarNoTri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        BotonNoTripuladaLayout.setVerticalGroup(
            BotonNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonNoTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LanzarNoTri, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BotonNoTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 190, -1));

        BotonTripulada.setBackground(new java.awt.Color(0, 0, 153));
        BotonTripulada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonTripuladaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonTripuladaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonTripuladaMouseExited(evt);
            }
        });

        LanzarTri.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LanzarTri.setForeground(new java.awt.Color(255, 255, 255));
        LanzarTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LanzarTri.setText("Tripulada");

        javax.swing.GroupLayout BotonTripuladaLayout = new javax.swing.GroupLayout(BotonTripulada);
        BotonTripulada.setLayout(BotonTripuladaLayout);
        BotonTripuladaLayout.setHorizontalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LanzarTri, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        BotonTripuladaLayout.setVerticalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LanzarTri, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cabezote.add(BotonTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanzadera-mini.png"))); // NOI18N
        Cabezote.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No tripuladas-mini.png"))); // NOI18N
        Cabezote.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apolo 11-mini.png"))); // NOI18N
        Cabezote.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 100, 110));

        add(Cabezote, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 749, 300));

        ContenidoLanzar.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ContenidoLanzarLayout = new javax.swing.GroupLayout(ContenidoLanzar);
        ContenidoLanzar.setLayout(ContenidoLanzarLayout);
        ContenidoLanzarLayout.setHorizontalGroup(
            ContenidoLanzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        ContenidoLanzarLayout.setVerticalGroup(
            ContenidoLanzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        add(ContenidoLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 296, -1, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLanzaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseClicked
        
        this.setVisible(false);
        DespegarLanzadera p= new DespegarLanzadera();
        p.setVisible(true);        
        
    }//GEN-LAST:event_BotonLanzaderaMouseClicked

    private void BotonLanzaderaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseEntered
        BotonLanzadera.setBackground(Color.white);
        LanzarLan.setForeground(Color.black);
    }//GEN-LAST:event_BotonLanzaderaMouseEntered

    private void BotonLanzaderaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseExited
        BotonLanzadera.setBackground(new Color(0,0,153));
        LanzarLan.setForeground(Color.white);
    }//GEN-LAST:event_BotonLanzaderaMouseExited

    private void BotonNoTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseClicked
       this.setVisible(false);
        MoverNoTripulada mnt= new MoverNoTripulada();
        mnt.setVisible(true);
               
    }//GEN-LAST:event_BotonNoTripuladaMouseClicked

    private void BotonNoTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseEntered
        BotonNoTripulada.setBackground(Color.white);
        LanzarNoTri.setForeground(Color.black);
    }//GEN-LAST:event_BotonNoTripuladaMouseEntered

    private void BotonNoTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseExited
        BotonNoTripulada.setBackground(new Color(0,0,153));
        LanzarNoTri.setForeground(Color.white);
    }//GEN-LAST:event_BotonNoTripuladaMouseExited

    private void BotonTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseClicked
        this.setVisible(false);
        MoverTripulada mt= new MoverTripulada();
        mt.setVisible(true);
    }//GEN-LAST:event_BotonTripuladaMouseClicked

    private void BotonTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseEntered
        BotonTripulada.setBackground(Color.white);
        LanzarTri.setForeground(Color.black);
    }//GEN-LAST:event_BotonTripuladaMouseEntered

    private void BotonTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseExited
        BotonTripulada.setBackground(new Color(0,0,153));
        LanzarTri.setForeground(Color.white);
    }//GEN-LAST:event_BotonTripuladaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonLanzadera;
    private javax.swing.JPanel BotonNoTripulada;
    private javax.swing.JPanel BotonTripulada;
    private javax.swing.JPanel Cabezote;
    private javax.swing.JPanel ContenidoLanzar;
    private javax.swing.JLabel LanzarLan;
    private javax.swing.JLabel LanzarNoTri;
    private javax.swing.JLabel LanzarTri;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
