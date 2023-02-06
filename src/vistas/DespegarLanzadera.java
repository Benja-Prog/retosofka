
package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;


public class DespegarLanzadera extends javax.swing.JFrame {
    //Puntos para el movimiento de las naves
    int x, y;
    //Puntos que permiten mover la ventana con el Mouse
    int xMouse, yMouse;
    
    public DespegarLanzadera() {
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
        IraTripulada = new javax.swing.JLabel();
        BotonNoTripulada = new javax.swing.JPanel();
        IraNoTripulada = new javax.swing.JLabel();
        Lanzadera = new javax.swing.JLabel();
        Paisaje = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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
        Panel.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 46, -1));

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

        Panel.add(RegresarAlSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

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

        IraTripulada.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IraTripulada.setForeground(new java.awt.Color(255, 255, 255));
        IraTripulada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IraTripulada.setText("Ir a Tripulada");

        javax.swing.GroupLayout BotonTripuladaLayout = new javax.swing.GroupLayout(BotonTripulada);
        BotonTripulada.setLayout(BotonTripuladaLayout);
        BotonTripuladaLayout.setHorizontalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IraTripulada, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        BotonTripuladaLayout.setVerticalGroup(
            BotonTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IraTripulada, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(BotonTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

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

        IraNoTripulada.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IraNoTripulada.setForeground(new java.awt.Color(255, 255, 255));
        IraNoTripulada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IraNoTripulada.setText("Ir a No Tripulada");

        javax.swing.GroupLayout BotonNoTripuladaLayout = new javax.swing.GroupLayout(BotonNoTripulada);
        BotonNoTripulada.setLayout(BotonNoTripuladaLayout);
        BotonNoTripuladaLayout.setHorizontalGroup(
            BotonNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IraNoTripulada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        BotonNoTripuladaLayout.setVerticalGroup(
            BotonNoTripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonNoTripuladaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IraNoTripulada, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(BotonNoTripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 190, -1));

        Lanzadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanzadera-mini.png"))); // NOI18N
        Panel.add(Lanzadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 322, -1, 113));

        Paisaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paisaje.jpg"))); // NOI18N
        Panel.add(Paisaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

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

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IMPORTANTE: Esta nave Lanzadera solo puede moverse hacia arriba para despegar y hacia abajo para aterrizar, use las flechas arriba y Abajo.");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 660, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelKeyPressed
       
        //Método que permite mover la nave con las fechas del teclado
        
        x = Lanzadera.getX();
        y = Lanzadera.getY();
        System.out.println(Lanzadera.getLocation());

        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP: if(Lanzadera.getY()>=-2) Lanzadera.setLocation(x , y-2);break; //Tecla Arriba
            case KeyEvent.VK_DOWN: if(Lanzadera.getY()<=342) Lanzadera.setLocation(x, y+2);break;//Tecla Abajo
            //case KeyEvent.VK_RIGHT: if(Lanzadera.getX()<=701) Lanzadera.setLocation(x+2, y);break;//TeclaDerecha
            //case KeyEvent.VK_LEFT: if(Lanzadera.getX()>=3) Lanzadera.setLocation(x-2, y);break;//Tecla Izquierda
        }
    }//GEN-LAST:event_PanelKeyPressed

    private void RegresarAlSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarAlSistemaMouseClicked
        //Boton que permite regresar al programa
        this.setVisible(false);
        Menu m= new Menu();
        m.setVisible(true);
        
    }//GEN-LAST:event_RegresarAlSistemaMouseClicked
    //Metodos para aplicar a los botones el efecto Tipo Hover.
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
        IraTripulada.setForeground(Color.black);
    }//GEN-LAST:event_BotonTripuladaMouseEntered

    private void BotonTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTripuladaMouseExited
        BotonTripulada.setBackground(new Color(0,0,153));
        IraTripulada.setForeground(Color.white);
    }//GEN-LAST:event_BotonTripuladaMouseExited

    private void BotonNoTripuladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseClicked

       this.setVisible(false);
        MoverNoTripulada mnt= new MoverNoTripulada();
        mnt.setVisible(true);
    }//GEN-LAST:event_BotonNoTripuladaMouseClicked

    private void BotonNoTripuladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseEntered
        BotonNoTripulada.setBackground(Color.white);
        IraNoTripulada.setForeground(Color.black);
    }//GEN-LAST:event_BotonNoTripuladaMouseEntered

    private void BotonNoTripuladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoTripuladaMouseExited
        BotonNoTripulada.setBackground(new Color(0,0,153));
        IraNoTripulada.setForeground(Color.white);
    }//GEN-LAST:event_BotonNoTripuladaMouseExited

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
            java.util.logging.Logger.getLogger(DespegarLanzadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DespegarLanzadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DespegarLanzadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DespegarLanzadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DespegarLanzadera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonNoTripulada;
    private javax.swing.JPanel BotonTripulada;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel IraNoTripulada;
    private javax.swing.JLabel IraTripulada;
    private javax.swing.JLabel Lanzadera;
    private javax.swing.JLabel Paisaje;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Regresar;
    private javax.swing.JPanel RegresarAlSistema;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
