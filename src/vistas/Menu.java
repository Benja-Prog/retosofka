
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;


public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Menu() {
        initComponents();
        
        Lanzador lz = new Lanzador();
        lz.setSize(760, 770);
        lz.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(lz, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BotonLanzadera = new javax.swing.JPanel();
        Lanzadera = new javax.swing.JLabel();
        BotonNtripulada = new javax.swing.JPanel();
        NTripulada = new javax.swing.JLabel();
        BotonTripulada = new javax.swing.JPanel();
        Tripulada = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JPanel();
        Buscar = new javax.swing.JLabel();
        BotonProbarNaves = new javax.swing.JPanel();
        TexttProbarNaves = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenido.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 750, 770));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Lanzadera.setBackground(new java.awt.Color(0, 0, 0));
        Lanzadera.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Lanzadera.setForeground(new java.awt.Color(255, 255, 255));
        Lanzadera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lanzadera.setText("LANZADERA");

        javax.swing.GroupLayout BotonLanzaderaLayout = new javax.swing.GroupLayout(BotonLanzadera);
        BotonLanzadera.setLayout(BotonLanzaderaLayout);
        BotonLanzaderaLayout.setHorizontalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonLanzaderaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Lanzadera, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonLanzaderaLayout.setVerticalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lanzadera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(BotonLanzadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, -1));

        BotonNtripulada.setBackground(new java.awt.Color(0, 0, 153));
        BotonNtripulada.setForeground(new java.awt.Color(0, 0, 153));
        BotonNtripulada.setToolTipText("");
        BotonNtripulada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNtripuladaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNtripuladaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNtripuladaMouseExited(evt);
            }
        });

        NTripulada.setBackground(new java.awt.Color(0, 0, 0));
        NTripulada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        NTripulada.setForeground(new java.awt.Color(255, 255, 255));
        NTripulada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NTripulada.setText("NO TRIPULADA");

        javax.swing.GroupLayout BotonNtripuladaLayout = new javax.swing.GroupLayout(BotonNtripulada);
        BotonNtripulada.setLayout(BotonNtripuladaLayout);
        BotonNtripuladaLayout.setHorizontalGroup(
            BotonNtripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonNtripuladaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(NTripulada, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonNtripuladaLayout.setVerticalGroup(
            BotonNtripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonNtripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NTripulada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(BotonNtripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 195, 200, -1));

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

        Tripulada.setBackground(new java.awt.Color(0, 0, 0));
        Tripulada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tripulada.setForeground(new java.awt.Color(255, 255, 255));
        Tripulada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tripulada.setText("TRIPULADA");

        javax.swing.GroupLayout BotonTripuladaLayout = new javax.swing.GroupLayout(BotonTripulada);
        BotonTripulada.setLayout(BotonTripuladaLayout);
        BotonTripuladaLayout.setHorizontalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonTripuladaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Tripulada, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonTripuladaLayout.setVerticalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonTripuladaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tripulada)
                .addContainerGap())
        );

        jPanel1.add(BotonTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NAVE ESPACIAL SOFKA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 212, 53));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gestion de naves espaciales");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 77, 200, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NAVE ESPACIAL.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 343, -1, -1));

        BotonBuscar.setBackground(new java.awt.Color(0, 0, 153));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseExited(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscar.setText("BUSCAR");

        javax.swing.GroupLayout BotonBuscarLayout = new javax.swing.GroupLayout(BotonBuscar);
        BotonBuscar.setLayout(BotonBuscarLayout);
        BotonBuscarLayout.setHorizontalGroup(
            BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonBuscarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonBuscarLayout.setVerticalGroup(
            BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buscar)
                .addContainerGap())
        );

        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 200, -1));

        BotonProbarNaves.setBackground(new java.awt.Color(0, 0, 153));
        BotonProbarNaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonProbarNavesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonProbarNavesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonProbarNavesMouseExited(evt);
            }
        });

        TexttProbarNaves.setBackground(new java.awt.Color(0, 0, 0));
        TexttProbarNaves.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TexttProbarNaves.setForeground(new java.awt.Color(255, 255, 255));
        TexttProbarNaves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TexttProbarNaves.setText("PROBAR NAVES");

        javax.swing.GroupLayout BotonProbarNavesLayout = new javax.swing.GroupLayout(BotonProbarNaves);
        BotonProbarNaves.setLayout(BotonProbarNavesLayout);
        BotonProbarNavesLayout.setHorizontalGroup(
            BotonProbarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TexttProbarNaves, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        BotonProbarNavesLayout.setVerticalGroup(
            BotonProbarNavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonProbarNavesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TexttProbarNaves)
                .addContainerGap())
        );

        jPanel1.add(BotonProbarNaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 810));

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        Cerrar.setBackground(new java.awt.Color(0, 0, 0));
        Cerrar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(974, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(Cerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setForeground(Color.red);
        
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setForeground(Color.white);
    }//GEN-LAST:event_CerrarMouseExited

    private void BotonLanzaderaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseEntered
        BotonLanzadera.setBackground(Color.white);
        Lanzadera.setForeground(Color.black);
    }//GEN-LAST:event_BotonLanzaderaMouseEntered

    private void BotonLanzaderaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseExited
        BotonLanzadera.setBackground(new Color(0,0,153));
        Lanzadera.setForeground(Color.white);
    }//GEN-LAST:event_BotonLanzaderaMouseExited

    private void BotonNtripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNtripuladaMouseEntered
        BotonNtripulada.setBackground(Color.white);
        NTripulada.setForeground(Color.black);
    }//GEN-LAST:event_BotonNtripuladaMouseEntered

    private void BotonNtripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNtripuladaMouseExited
        BotonNtripulada.setBackground(new Color(0,0,153));
        NTripulada.setForeground(Color.white);
    }//GEN-LAST:event_BotonNtripuladaMouseExited

    private void BotonTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseEntered
        BotonTripulada.setBackground(Color.white);
        Tripulada.setForeground(Color.black);
    }//GEN-LAST:event_BotonTripuladaMouseEntered

    private void BotonTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseExited
        BotonTripulada.setBackground(new Color(0,0,153));
        Tripulada.setForeground(Color.white);
    }//GEN-LAST:event_BotonTripuladaMouseExited

    private void BotonLanzaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseClicked
        Lanzador lz = new Lanzador();
        lz.setSize(750, 770);
        lz.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(lz, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BotonLanzaderaMouseClicked

    private void BotonNtripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNtripuladaMouseClicked
        NoTripuladas nt = new NoTripuladas();
        nt.setSize(750, 770);
        nt.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(nt, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BotonNtripuladaMouseClicked

    private void BotonTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseClicked
        Tripuladas tp = new Tripuladas();
        tp.setSize(750, 770);
        tp.setLocation(0, 0);
        
        Contenido.removeAll();
        Contenido.add(tp, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BotonTripuladaMouseClicked

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        BotonBuscar.setBackground(Color.white);
        Buscar.setForeground(Color.black);
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        BotonBuscar.setBackground(new Color(0,0,153));
        Buscar.setForeground(Color.white);
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonProbarNavesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProbarNavesMouseEntered
        BotonProbarNaves.setBackground(Color.white);
        TexttProbarNaves.setForeground(Color.black);
    }//GEN-LAST:event_BotonProbarNavesMouseEntered

    private void BotonProbarNavesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProbarNavesMouseExited
        BotonProbarNaves.setBackground(new Color(0,0,153));
        TexttProbarNaves.setForeground(Color.white);
    }//GEN-LAST:event_BotonProbarNavesMouseExited

    private void BotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseClicked
        BuscarNaves bn = new BuscarNaves();
        bn.setSize(750, 770);
        bn.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(bn, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BotonBuscarMouseClicked

    private void BotonProbarNavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProbarNavesMouseClicked
        DespegarNave ln = new DespegarNave();
        ln.setSize(750, 770);
        ln.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(ln, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BotonProbarNavesMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonLanzadera;
    private javax.swing.JPanel BotonNtripulada;
    private javax.swing.JPanel BotonProbarNaves;
    private javax.swing.JPanel BotonTripulada;
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Contenido;
    private javax.swing.JLabel Lanzadera;
    private javax.swing.JLabel NTripulada;
    private javax.swing.JLabel TexttProbarNaves;
    private javax.swing.JLabel Tripulada;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
