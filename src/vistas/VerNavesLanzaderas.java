
package vistas;

import navespacialsofka.ConectorDB;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JOptionPane;

public class VerNavesLanzaderas extends javax.swing.JPanel {

        ConectorDB cc = new ConectorDB();
        Connection con = cc.conexion();
        
    public VerNavesLanzaderas() {
        initComponents();
        
        mostrarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLanzadera = new javax.swing.JTable();
        BotonBorrarNave = new javax.swing.JPanel();
        Crear = new javax.swing.JLabel();
        BotonActualizar = new javax.swing.JPanel();
        Actualizar = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 153));

        TablaLanzadera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaLanzadera);

        BotonBorrarNave.setBackground(new java.awt.Color(0, 0, 0));
        BotonBorrarNave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBorrarNaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBorrarNaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBorrarNaveMouseExited(evt);
            }
        });

        Crear.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Crear.setText("Borrar Nave");

        javax.swing.GroupLayout BotonBorrarNaveLayout = new javax.swing.GroupLayout(BotonBorrarNave);
        BotonBorrarNave.setLayout(BotonBorrarNaveLayout);
        BotonBorrarNaveLayout.setHorizontalGroup(
            BotonBorrarNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonBorrarNaveLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        BotonBorrarNaveLayout.setVerticalGroup(
            BotonBorrarNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonBorrarNaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Crear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        BotonActualizar.setBackground(new java.awt.Color(0, 0, 0));
        BotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseExited(evt);
            }
        });

        Actualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Actualizar.setText("Actualizar");

        javax.swing.GroupLayout BotonActualizarLayout = new javax.swing.GroupLayout(BotonActualizar);
        BotonActualizar.setLayout(BotonActualizarLayout);
        BotonActualizarLayout.setHorizontalGroup(
            BotonActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonActualizarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        BotonActualizarLayout.setVerticalGroup(
            BotonActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(BotonBorrarNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBorrarNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBorrarNaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarNaveMouseClicked
        borrarRegistros();
    }//GEN-LAST:event_BotonBorrarNaveMouseClicked

    private void BotonBorrarNaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarNaveMouseEntered
        BotonBorrarNave.setBackground(Color.white);
        Crear.setForeground(Color.black);
    }//GEN-LAST:event_BotonBorrarNaveMouseEntered

    private void BotonBorrarNaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarNaveMouseExited
        BotonBorrarNave.setBackground(new Color(0,0,0));
        Crear.setForeground(Color.white);
    }//GEN-LAST:event_BotonBorrarNaveMouseExited

    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked
        mostrarDatos();
    }//GEN-LAST:event_BotonActualizarMouseClicked

    private void BotonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseEntered
        BotonActualizar.setBackground(Color.white);
        Actualizar.setForeground(Color.black);
    }//GEN-LAST:event_BotonActualizarMouseEntered

    private void BotonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseExited
        BotonActualizar.setBackground(new Color(0,0,0));
        Actualizar.setForeground(Color.white);
    }//GEN-LAST:event_BotonActualizarMouseExited

    public void mostrarDatos(){
        String[] titulos = {"matricula_id", "nombre", "peso", "combustible", "empuje", "velocidad"};
        String[] registros = new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String SQL = "SELECT * FROM lanzadera";
        
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                registros[0]=rs.getString("matricula_id");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("peso");
                registros[3]=rs.getString("combustible");   
                registros[4]=rs.getString("empuje");
                registros[5]=rs.getString("velocidad");
                
                modelo.addRow(registros);
               
            }
            
            TablaLanzadera.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }
    }
    
     public void borrarRegistros(){
        
        int filaSeleccionada = TablaLanzadera.getSelectedRow();
        
        try {
            String SQL = "delete From lanzadera where matricula_id=" + TablaLanzadera.getValueAt(filaSeleccionada, 0);
            
            Statement st = con.createStatement();
            
            int n = st.executeUpdate(SQL);
            
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualizar;
    private javax.swing.JPanel BotonActualizar;
    private javax.swing.JPanel BotonBorrarNave;
    private javax.swing.JLabel Crear;
    private javax.swing.JTable TablaLanzadera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
