
package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class MoverNoTripulada extends javax.swing.JFrame {

    int x, y;
    int xMouse, yMouse;
    
    public MoverNoTripulada() {
        initComponents();
        
        Panel.setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        RegresarAlSistema = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        BotonTripulada = new javax.swing.JPanel();
        IraTri = new javax.swing.JLabel();
        BotonLanzadera = new javax.swing.JPanel();
        LanzarNoTri = new javax.swing.JLabel();
        NoTripulada = new javax.swing.JLabel();
        Marte = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        Importante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Panel.setBackground(new java.awt.Color(0, 0, 0));
        Panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelKeyPressed(evt);
            }
        });
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setBackground(new java.awt.Color(0, 0, 0));
        Cerrar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(0, 0, 0));
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
        Panel.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, -1));

        RegresarAlSistema.setBackground(new java.awt.Color(0, 0, 153));
        RegresarAlSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarAlSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarAlSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarAlSistemaMouseExited(evt);
            }
        });

        Regresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regresar.setText("Regresar al sistema");

        javax.swing.GroupLayout RegresarAlSistemaLayout = new javax.swing.GroupLayout(RegresarAlSistema);
        RegresarAlSistema.setLayout(RegresarAlSistemaLayout);
        RegresarAlSistemaLayout.setHorizontalGroup(
            RegresarAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarAlSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RegresarAlSistemaLayout.setVerticalGroup(
            RegresarAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarAlSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(RegresarAlSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

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

        IraTri.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IraTri.setForeground(new java.awt.Color(255, 255, 255));
        IraTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IraTri.setText("Ir a Tripulada");

        javax.swing.GroupLayout BotonTripuladaLayout = new javax.swing.GroupLayout(BotonTripulada);
        BotonTripulada.setLayout(BotonTripuladaLayout);
        BotonTripuladaLayout.setHorizontalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IraTri, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        BotonTripuladaLayout.setVerticalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IraTri, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(BotonTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

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

        LanzarNoTri.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LanzarNoTri.setForeground(new java.awt.Color(255, 255, 255));
        LanzarNoTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LanzarNoTri.setText("Ir a Lanzadera");

        javax.swing.GroupLayout BotonLanzaderaLayout = new javax.swing.GroupLayout(BotonLanzadera);
        BotonLanzadera.setLayout(BotonLanzaderaLayout);
        BotonLanzaderaLayout.setHorizontalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LanzarNoTri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        BotonLanzaderaLayout.setVerticalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LanzarNoTri, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(BotonLanzadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 190, -1));

        NoTripulada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No tripuladas-mini.png"))); // NOI18N
        Panel.add(NoTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 113));

        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marte.jpg"))); // NOI18N
        Panel.add(Marte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        Panel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        Importante.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        Importante.setForeground(new java.awt.Color(255, 255, 255));
        Importante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Importante.setText("IMPORTANTE: Esta nave No Tripulada puede moverse por todo marte, no vuelva, por lo tanto debe estar en tierra, use las flechas del teclado para iniciar");
        Panel.add(Importante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 730, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarAlSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSistemaMouseClicked

        this.setVisible(false);
        Menu m= new Menu();
        m.setVisible(true);
        
    }//GEN-LAST:event_RegresarAlSistemaMouseClicked

    private void RegresarAlSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSistemaMouseEntered
        RegresarAlSistema.setBackground(Color.white);
        Regresar.setForeground(Color.black);
    }//GEN-LAST:event_RegresarAlSistemaMouseEntered

    private void RegresarAlSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSistemaMouseExited
        RegresarAlSistema.setBackground(new Color(0,0,153));
        Regresar.setForeground(Color.white);
    }//GEN-LAST:event_RegresarAlSistemaMouseExited

    private void BotonTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseClicked
        this.setVisible(false);
        MoverTripulada mt= new MoverTripulada();
        mt.setVisible(true);
    }//GEN-LAST:event_BotonTripuladaMouseClicked

    private void BotonTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseEntered
        BotonTripulada.setBackground(Color.white);
        IraTri.setForeground(Color.black);
    }//GEN-LAST:event_BotonTripuladaMouseEntered

    private void BotonTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseExited
        BotonTripulada.setBackground(new Color(0,0,153));
        IraTri.setForeground(Color.white);
    }//GEN-LAST:event_BotonTripuladaMouseExited

    private void BotonLanzaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseClicked
         this.setVisible(false);
        DespegarLanzadera p= new DespegarLanzadera();
        p.setVisible(true);
    }//GEN-LAST:event_BotonLanzaderaMouseClicked

    private void BotonLanzaderaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseEntered
        BotonLanzadera.setBackground(Color.white);
        LanzarNoTri.setForeground(Color.black);
    }//GEN-LAST:event_BotonLanzaderaMouseEntered

    private void BotonLanzaderaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseExited
        BotonLanzadera.setBackground(new Color(0,0,153));
        LanzarNoTri.setForeground(Color.white);
    }//GEN-LAST:event_BotonLanzaderaMouseExited

    private void PanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelKeyPressed
        x = NoTripulada.getX();
        y = NoTripulada.getY();
        System.out.println(NoTripulada.getLocation());

        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP: if(NoTripulada.getY()>=226) NoTripulada.setLocation(x, y-2);break;
            case KeyEvent.VK_DOWN: if(NoTripulada.getY()<=342) NoTripulada.setLocation(x, y+2);break;
            case KeyEvent.VK_RIGHT: if(NoTripulada.getX()<=648) NoTripulada.setLocation(x+2, y);break;
            case KeyEvent.VK_LEFT: if(NoTripulada.getX()>=3) NoTripulada.setLocation(x-2, y);break;
        }
    }//GEN-LAST:event_PanelKeyPressed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setForeground(Color.red);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setForeground(Color.black);
    }//GEN-LAST:event_CerrarMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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
            java.util.logging.Logger.getLogger(MoverNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoverNoTripulada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonLanzadera;
    private javax.swing.JPanel BotonTripulada;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Importante;
    private javax.swing.JLabel IraTri;
    private javax.swing.JLabel LanzarNoTri;
    private javax.swing.JLabel Marte;
    private javax.swing.JLabel NoTripulada;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Regresar;
    private javax.swing.JPanel RegresarAlSistema;
    private javax.swing.JPanel header;
    // End of variables declaration//GEN-END:variables
}
