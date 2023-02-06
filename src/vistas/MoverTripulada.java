
package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class MoverTripulada extends javax.swing.JFrame {

    int x, y;
    int xMouse, yMouse;
    
    public MoverTripulada() {
        initComponents();
        
        Panel.setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        RegresarAlSis = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        BotonNoTripulada = new javax.swing.JPanel();
        IrANoTripu = new javax.swing.JLabel();
        BotonLanzadera = new javax.swing.JPanel();
        IraLanzadera = new javax.swing.JLabel();
        Tripulada = new javax.swing.JLabel();
        Luna = new javax.swing.JLabel();
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
        Panel.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 46, -1));

        RegresarAlSis.setBackground(new java.awt.Color(0, 0, 153));
        RegresarAlSis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarAlSisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarAlSisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarAlSisMouseExited(evt);
            }
        });

        Regresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regresar.setText("Regresar al sistema");

        javax.swing.GroupLayout RegresarAlSisLayout = new javax.swing.GroupLayout(RegresarAlSis);
        RegresarAlSis.setLayout(RegresarAlSisLayout);
        RegresarAlSisLayout.setHorizontalGroup(
            RegresarAlSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarAlSisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RegresarAlSisLayout.setVerticalGroup(
            RegresarAlSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarAlSisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(RegresarAlSis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

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

        IrANoTripu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IrANoTripu.setForeground(new java.awt.Color(255, 255, 255));
        IrANoTripu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IrANoTripu.setText("Ir a No Tripulada");

        javax.swing.GroupLayout BotonNoTripuladaLayout = new javax.swing.GroupLayout(BotonNoTripulada);
        BotonNoTripulada.setLayout(BotonNoTripuladaLayout);
        BotonNoTripuladaLayout.setHorizontalGroup(
            BotonNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IrANoTripu, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        BotonNoTripuladaLayout.setVerticalGroup(
            BotonNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonNoTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IrANoTripu, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(BotonNoTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

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

        IraLanzadera.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IraLanzadera.setForeground(new java.awt.Color(255, 255, 255));
        IraLanzadera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IraLanzadera.setText("Ir a Lanzadera");

        javax.swing.GroupLayout BotonLanzaderaLayout = new javax.swing.GroupLayout(BotonLanzadera);
        BotonLanzadera.setLayout(BotonLanzaderaLayout);
        BotonLanzaderaLayout.setHorizontalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IraLanzadera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        BotonLanzaderaLayout.setVerticalGroup(
            BotonLanzaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonLanzaderaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IraLanzadera, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(BotonLanzadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 190, -1));

        Tripulada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apolo 11-mini.png"))); // NOI18N
        Panel.add(Tripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 113));

        Luna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Luna.jpg"))); // NOI18N
        Panel.add(Luna, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

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
        Importante.setText("IMPORTANTE: Esta nave Tripulada puede moverse por toda la luna, los movimientos los hace volando, use las flechas del teclado para iniciar");
        Panel.add(Importante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 670, 10));

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

    private void RegresarAlSisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSisMouseClicked

        this.setVisible(false);
        Menu m= new Menu();
        m.setVisible(true);

    }//GEN-LAST:event_RegresarAlSisMouseClicked

    private void RegresarAlSisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSisMouseEntered
        RegresarAlSis.setBackground(Color.white);
        Regresar.setForeground(Color.black);
    }//GEN-LAST:event_RegresarAlSisMouseEntered

    private void RegresarAlSisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSisMouseExited
        RegresarAlSis.setBackground(new Color(0,0,153));
        Regresar.setForeground(Color.white);
    }//GEN-LAST:event_RegresarAlSisMouseExited

    private void BotonNoTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseClicked
        this.setVisible(false);
        MoverNoTripulada mnt= new MoverNoTripulada();
        mnt.setVisible(true);
    }//GEN-LAST:event_BotonNoTripuladaMouseClicked

    private void BotonNoTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseEntered
        BotonNoTripulada.setBackground(Color.white);
        IrANoTripu.setForeground(Color.black);
    }//GEN-LAST:event_BotonNoTripuladaMouseEntered

    private void BotonNoTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseExited
        BotonNoTripulada.setBackground(new Color(0,0,153));
        IrANoTripu.setForeground(Color.white);
    }//GEN-LAST:event_BotonNoTripuladaMouseExited

    private void BotonLanzaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseClicked
         this.setVisible(false);
        DespegarLanzadera p= new DespegarLanzadera();
        p.setVisible(true);
    }//GEN-LAST:event_BotonLanzaderaMouseClicked

    private void BotonLanzaderaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseEntered
        BotonLanzadera.setBackground(Color.white);
        IraLanzadera.setForeground(Color.black);
    }//GEN-LAST:event_BotonLanzaderaMouseEntered

    private void BotonLanzaderaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLanzaderaMouseExited
        BotonLanzadera.setBackground(new Color(0,0,153));
        IraLanzadera.setForeground(Color.white);
    }//GEN-LAST:event_BotonLanzaderaMouseExited

    private void PanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelKeyPressed
        x = Tripulada.getX();
        y = Tripulada.getY();
        System.out.println(Tripulada.getLocation());

        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP: if(Tripulada.getY()>=-2) Tripulada.setLocation(x, y-2);break;
            case KeyEvent.VK_DOWN: if(Tripulada.getY()<=342) Tripulada.setLocation(x, y+2);break;
            case KeyEvent.VK_RIGHT: if(Tripulada.getX()<=660) Tripulada.setLocation(x+2, y);break;
            case KeyEvent.VK_LEFT: if(Tripulada.getX()>=3) Tripulada.setLocation(x-2, y);break;
        }
    }//GEN-LAST:event_PanelKeyPressed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setForeground(Color.red);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setForeground(Color.white);
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
            java.util.logging.Logger.getLogger(MoverTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoverTripulada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonLanzadera;
    private javax.swing.JPanel BotonNoTripulada;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Importante;
    private javax.swing.JLabel IrANoTripu;
    private javax.swing.JLabel IraLanzadera;
    private javax.swing.JLabel Luna;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Regresar;
    private javax.swing.JPanel RegresarAlSis;
    private javax.swing.JLabel Tripulada;
    private javax.swing.JPanel header;
    // End of variables declaration//GEN-END:variables
}
