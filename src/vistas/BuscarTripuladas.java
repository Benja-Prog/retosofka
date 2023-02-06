
package vistas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.ConectorDB;


public class BuscarTripuladas extends javax.swing.JPanel {
        //Instanciamos nuestro Objeto ConectorDB 
        ConectorDB cc = new ConectorDB();
        Connection con = cc.conexion();
        
    public BuscarTripuladas() {
        initComponents();
        //Cuando ingresamos a la vista "BuscarLanzadera" mostrará automaticamente el contenido de la tabla "tripulada"
        mostrarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Buscar = new javax.swing.JLabel();
        jTextBuscarDato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTripuladas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        Buscar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar:");

        jTextBuscarDato.setBackground(new java.awt.Color(0, 0, 153));
        jTextBuscarDato.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextBuscarDato.setForeground(new java.awt.Color(204, 204, 204));
        jTextBuscarDato.setText("Ingrese Dato de la Nave");
        jTextBuscarDato.setBorder(null);
        jTextBuscarDato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextBuscarDatoMousePressed(evt);
            }
        });
        jTextBuscarDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextBuscarDatoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBuscarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextBuscarDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 153));

        TablaTripuladas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaTripuladas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscarDatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarDatoKeyReleased
        filtrarDatos(jTextBuscarDato.getText());
    }//GEN-LAST:event_jTextBuscarDatoKeyReleased

    private void jTextBuscarDatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextBuscarDatoMousePressed
       //Cuando damos click sobre el JTextFiel de buscador la letra por defecto desaparecerá automaticamente
        if(jTextBuscarDato.getText().equals("Ingrese Dato de la Nave")){
            jTextBuscarDato.setText("");
            jTextBuscarDato.setForeground(Color. white);
        }
    }//GEN-LAST:event_jTextBuscarDatoMousePressed

    //Metodo Mostrar Datos desde nuestra tabla "tripulada"
    public void mostrarDatos(){
        String[] titulos = {"matricula_id", "nombre", "peso", "combustible", "ntripulantes", "velocidad", "modelo", "pais"};
        String[] registros = new String[8];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String SQL = "SELECT * FROM tripulada";
        
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                registros[0]=rs.getString("matricula_id");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("peso");
                registros[3]=rs.getString("combustible");   
                registros[4]=rs.getString("ntripulantes");
                registros[5]=rs.getString("velocidad");
                registros[6]=rs.getString("modelo");
                registros[7]=rs.getString("pais");                
                                
                modelo.addRow(registros);
               
            }
            
            TablaTripuladas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }
    }
    //Método Filtrar Datos - Para buscar datos alojados en nuestra tabla "lanzadera"
    public void filtrarDatos(String valor){
        String[] titulos = {"matricula_id", "nombre", "peso", "combustible", "ntripulantes", "velocidad", "modelo", "pais"};
        String[] registros = new String[8];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String SQL = "SELECT * FROM tripulada where nombre like  '%" + valor +"%'  ";
        
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                registros[0]=rs.getString("matricula_id");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("peso");
                registros[3]=rs.getString("combustible");   
                registros[4]=rs.getString("ntripulantes");
                registros[5]=rs.getString("velocidad");
                registros[6]=rs.getString("modelo");
                registros[7]=rs.getString("pais"); 
                
                modelo.addRow(registros);
               
            }
            
            TablaTripuladas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al filtrar Datos" + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JTable TablaTripuladas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscarDato;
    // End of variables declaration//GEN-END:variables
}
