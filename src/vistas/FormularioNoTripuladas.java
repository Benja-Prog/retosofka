/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import Modelo.ConectorDB;
import java.sql.Connection;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FormularioNoTripuladas extends javax.swing.JPanel {
        //Instanciamos nuestro Objeto ConectorDB  
        ConectorDB cc = new ConectorDB();
        Connection con = cc.conexion();
        
    public FormularioNoTripuladas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenidoCrearNoTri = new javax.swing.JPanel();
        Matricula = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        Peso = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        Combustible = new javax.swing.JLabel();
        jTextCombustible = new javax.swing.JTextField();
        Empuje = new javax.swing.JLabel();
        jTextEmpuje = new javax.swing.JTextField();
        Velocidad = new javax.swing.JLabel();
        jTextVelocidad = new javax.swing.JTextField();
        BotonCrear = new javax.swing.JPanel();
        Crear = new javax.swing.JLabel();
        TServicio = new javax.swing.JLabel();
        jTextTservicio = new javax.swing.JTextField();

        ContenidoCrearNoTri.setBackground(new java.awt.Color(0, 0, 153));

        Matricula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Matricula.setForeground(new java.awt.Color(255, 255, 255));
        Matricula.setText("Matrícula:");

        jTextMatricula.setBackground(new java.awt.Color(0, 0, 153));
        jTextMatricula.setForeground(new java.awt.Color(204, 204, 204));
        jTextMatricula.setText("Ingrese la Matricula");
        jTextMatricula.setBorder(null);
        jTextMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextMatriculaMousePressed(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre:");

        jTextNombre.setBackground(new java.awt.Color(0, 0, 153));
        jTextNombre.setForeground(new java.awt.Color(204, 204, 204));
        jTextNombre.setText("Ingrese el nombre");
        jTextNombre.setBorder(null);
        jTextNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextNombreMousePressed(evt);
            }
        });

        Peso.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Peso.setForeground(new java.awt.Color(255, 255, 255));
        Peso.setText("Peso:");

        jTextPeso.setBackground(new java.awt.Color(0, 0, 153));
        jTextPeso.setForeground(new java.awt.Color(204, 204, 204));
        jTextPeso.setText("Ingrese el Peso");
        jTextPeso.setBorder(null);
        jTextPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextPesoMousePressed(evt);
            }
        });

        Combustible.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Combustible.setForeground(new java.awt.Color(255, 255, 255));
        Combustible.setText("Combustible:");

        jTextCombustible.setBackground(new java.awt.Color(0, 0, 153));
        jTextCombustible.setForeground(new java.awt.Color(204, 204, 204));
        jTextCombustible.setText("Ingrese tipo de Combustible");
        jTextCombustible.setBorder(null);
        jTextCombustible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextCombustibleMousePressed(evt);
            }
        });

        Empuje.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Empuje.setForeground(new java.awt.Color(255, 255, 255));
        Empuje.setText("Empuje:");

        jTextEmpuje.setBackground(new java.awt.Color(0, 0, 153));
        jTextEmpuje.setForeground(new java.awt.Color(204, 204, 204));
        jTextEmpuje.setText("Ingrese el Empuje");
        jTextEmpuje.setBorder(null);
        jTextEmpuje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextEmpujeMousePressed(evt);
            }
        });

        Velocidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Velocidad.setForeground(new java.awt.Color(255, 255, 255));
        Velocidad.setText("Velocidad:");

        jTextVelocidad.setBackground(new java.awt.Color(0, 0, 153));
        jTextVelocidad.setForeground(new java.awt.Color(204, 204, 204));
        jTextVelocidad.setText("Ingrese Velocidad");
        jTextVelocidad.setBorder(null);
        jTextVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextVelocidadMousePressed(evt);
            }
        });

        BotonCrear.setBackground(new java.awt.Color(0, 0, 0));
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

        TServicio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TServicio.setForeground(new java.awt.Color(255, 255, 255));
        TServicio.setText("T en Servicio");

        jTextTservicio.setBackground(new java.awt.Color(0, 0, 153));
        jTextTservicio.setForeground(new java.awt.Color(204, 204, 204));
        jTextTservicio.setText("Ingrese tiempo de servicio");
        jTextTservicio.setBorder(null);
        jTextTservicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextTservicioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ContenidoCrearNoTriLayout = new javax.swing.GroupLayout(ContenidoCrearNoTri);
        ContenidoCrearNoTri.setLayout(ContenidoCrearNoTriLayout);
        ContenidoCrearNoTriLayout.setHorizontalGroup(
            ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                        .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                                .addComponent(Matricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                                .addComponent(Peso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                                .addComponent(Empuje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                                .addComponent(Combustible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                                .addComponent(Velocidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                        .addComponent(TServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTservicio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContenidoCrearNoTriLayout.setVerticalGroup(
            ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoCrearNoTriLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combustible, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empuje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(ContenidoCrearNoTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoCrearNoTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoCrearNoTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMatriculaMousePressed
        
        //Cuando damos click sobre el JTextFiel de los formularios la letra por defecto desaparecerá automaticamente
        
        if(jTextMatricula.getText().equals("Ingrese la Matricula")){
            jTextMatricula.setText("");
            jTextMatricula.setForeground(Color. white);
        }

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingrese el nombre");
            jTextNombre.setForeground(Color.gray);
        }

        if (jTextPeso.getText().isEmpty()) {
            jTextPeso.setText("Ingrese el Peso");
            jTextPeso.setForeground(Color.gray);
        }

        if (jTextCombustible.getText().isEmpty()) {
            jTextCombustible.setText("Ingrese tipo de Combustible");
            jTextCombustible.setForeground(Color.gray);
        }

        if(jTextEmpuje.getText().isEmpty()){
            jTextEmpuje.setText("Ingrese el Empuje");
            jTextEmpuje.setForeground(Color. gray);
        }

        if (jTextVelocidad.getText().isEmpty()) {
            jTextVelocidad.setText("Ingrese Velocidad");
            jTextVelocidad.setForeground(Color.gray);
        }
        
        if (jTextTservicio.getText().isEmpty()) {
            jTextTservicio.setText("Ingrese tiempo de servicio");
            jTextTservicio.setForeground(Color.gray);
        }
        

    }//GEN-LAST:event_jTextMatriculaMousePressed

    private void jTextNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNombreMousePressed
        if(jTextNombre.getText().equals("Ingrese el nombre")){
            jTextNombre.setText("");
            jTextNombre.setForeground(Color. white);
        }

        if (jTextMatricula.getText().isEmpty()) {
            jTextMatricula.setText("Ingrese la Matricula");
            jTextMatricula.setForeground(Color.gray);
        }

        if (jTextPeso.getText().isEmpty()) {
            jTextPeso.setText("Ingrese el Peso");
            jTextPeso.setForeground(Color.gray);
        }

        if (jTextCombustible.getText().isEmpty()) {
            jTextCombustible.setText("Ingrese tipo de Combustible");
            jTextCombustible.setForeground(Color.gray);
        }

        if(jTextEmpuje.getText().isEmpty()){
            jTextEmpuje.setText("Ingrese el Empuje");
            jTextEmpuje.setForeground(Color. gray);
        }

        if (jTextVelocidad.getText().isEmpty()) {
            jTextVelocidad.setText("Ingrese Velocidad");
            jTextVelocidad.setForeground(Color.gray);
        }
        
        if (jTextTservicio.getText().isEmpty()) {
            jTextTservicio.setText("Ingrese tiempo de servicio");
            jTextTservicio.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_jTextNombreMousePressed

    private void jTextPesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPesoMousePressed
        if(jTextPeso.getText().equals("Ingrese el Peso")){
            jTextPeso.setText("");
            jTextPeso.setForeground(Color. white);
        }

        if (jTextMatricula.getText().isEmpty()) {
            jTextMatricula.setText("Ingrese la Matricula");
            jTextMatricula.setForeground(Color.gray);
        }

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingrese el nombre");
            jTextNombre.setForeground(Color.gray);
        }

        if (jTextCombustible.getText().isEmpty()) {
            jTextCombustible.setText("Ingrese tipo de Combustible");
            jTextCombustible.setForeground(Color.gray);
        }

        if(jTextEmpuje.getText().isEmpty()){
            jTextEmpuje.setText("Ingrese el Empuje");
            jTextEmpuje.setForeground(Color. gray);
        }

        if (jTextVelocidad.getText().isEmpty()) {
            jTextVelocidad.setText("Ingrese Velocidad");
            jTextVelocidad.setForeground(Color.gray);
        }
        
        if (jTextTservicio.getText().isEmpty()) {
            jTextTservicio.setText("Ingrese tiempo de servicio");
            jTextTservicio.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_jTextPesoMousePressed

    private void jTextCombustibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextCombustibleMousePressed
        if(jTextCombustible.getText().equals("Ingrese tipo de Combustible")){
            jTextCombustible.setText("");
            jTextCombustible.setForeground(Color. white);
        }

        if (jTextMatricula.getText().isEmpty()) {
            jTextMatricula.setText("Ingrese la Matricula");
            jTextMatricula.setForeground(Color.gray);
        }

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingrese el nombre");
            jTextNombre.setForeground(Color.gray);
        }

        if (jTextPeso.getText().isEmpty()) {
            jTextPeso.setText("Ingrese el Peso");
            jTextPeso.setForeground(Color.gray);
        }

        if(jTextEmpuje.getText().isEmpty()){
            jTextEmpuje.setText("Ingrese el Empuje");
            jTextEmpuje.setForeground(Color. gray);
        }

        if (jTextVelocidad.getText().isEmpty()) {
            jTextVelocidad.setText("Ingrese Velocidad");
            jTextVelocidad.setForeground(Color.gray);
        }
        
        if (jTextTservicio.getText().isEmpty()) {
            jTextTservicio.setText("Ingrese tiempo de servicio");
            jTextTservicio.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_jTextCombustibleMousePressed

    private void jTextEmpujeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextEmpujeMousePressed
        if(jTextEmpuje.getText().equals("Ingrese el Empuje")){
            jTextEmpuje.setText("");
            jTextEmpuje.setForeground(Color. white);
        }

        if (jTextMatricula.getText().isEmpty()) {
            jTextMatricula.setText("Ingrese la Matricula");
            jTextMatricula.setForeground(Color.gray);
        }

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingrese el nombre");
            jTextNombre.setForeground(Color.gray);
        }

        if (jTextPeso.getText().isEmpty()) {
            jTextPeso.setText("Ingrese el Peso");
            jTextPeso.setForeground(Color.gray);
        }

        if (jTextCombustible.getText().isEmpty()) {
            jTextCombustible.setText("Ingrese tipo de Combustible");
            jTextCombustible.setForeground(Color.gray);
        }

        if (jTextVelocidad.getText().isEmpty()) {
            jTextVelocidad.setText("Ingrese Velocidad");
            jTextVelocidad.setForeground(Color.gray);
        }
        
        if (jTextTservicio.getText().isEmpty()) {
            jTextTservicio.setText("Ingrese tiempo de servicio");
            jTextTservicio.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_jTextEmpujeMousePressed

    private void jTextVelocidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextVelocidadMousePressed
        if(jTextVelocidad.getText().equals("Ingrese Velocidad")){
            jTextVelocidad.setText("");
            jTextVelocidad.setForeground(Color. white);
        }

        if (jTextMatricula.getText().isEmpty()) {
            jTextMatricula.setText("Ingrese la Matricula");
            jTextMatricula.setForeground(Color.gray);
        }

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingrese el nombre");
            jTextNombre.setForeground(Color.gray);
        }

        if (jTextPeso.getText().isEmpty()) {
            jTextPeso.setText("Ingrese el Peso");
            jTextPeso.setForeground(Color.gray);
        }

        if (jTextCombustible.getText().isEmpty()) {
            jTextCombustible.setText("Ingrese tipo de Combustible");
            jTextCombustible.setForeground(Color.gray);
        }

        if(jTextEmpuje.getText().isEmpty()){
            jTextEmpuje.setText("Ingrese el Empuje");
            jTextEmpuje.setForeground(Color. gray);
        }    
        
         if (jTextTservicio.getText().isEmpty()) {
            jTextTservicio.setText("Ingrese tiempo de servicio");
            jTextTservicio.setForeground(Color.gray);
        }
        

    }//GEN-LAST:event_jTextVelocidadMousePressed

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked
        insertarDatos();
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseEntered
        BotonCrear.setBackground(Color.white);
        Crear.setForeground(Color.black);
    }//GEN-LAST:event_BotonCrearMouseEntered

    private void BotonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseExited
        BotonCrear.setBackground(new Color(0,0,0));
        Crear.setForeground(Color.white);
    }//GEN-LAST:event_BotonCrearMouseExited

    private void jTextTservicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextTservicioMousePressed
        if(jTextTservicio.getText().equals("Ingrese tiempo de servicio")){
            jTextTservicio.setText("");
            jTextTservicio.setForeground(Color. white);
        }
        
        if (jTextMatricula.getText().isEmpty()) {
            jTextMatricula.setText("Ingrese la Matricula");
            jTextMatricula.setForeground(Color.gray);
        }

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingrese el nombre");
            jTextNombre.setForeground(Color.gray);
        }

        if (jTextPeso.getText().isEmpty()) {
            jTextPeso.setText("Ingrese el Peso");
            jTextPeso.setForeground(Color.gray);
        }

        if (jTextCombustible.getText().isEmpty()) {
            jTextCombustible.setText("Ingrese tipo de Combustible");
            jTextCombustible.setForeground(Color.gray);
        }

        if(jTextEmpuje.getText().isEmpty()){
            jTextEmpuje.setText("Ingrese el Empuje");
            jTextEmpuje.setForeground(Color. gray);
        }
        
        if (jTextVelocidad.getText().isEmpty()) {
            jTextVelocidad.setText("Ingrese Velocidad");
            jTextVelocidad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextTservicioMousePressed

    //Método que permite ingresar datos a la tabla "notripulada"
    
    public void insertarDatos(){
        try {
            String SQL =("INSERT INTO notripulada (matricula_id, nombre, peso, combustible, empuje, velocidad, tiemposervicio) VALUES (?, ?, ?, ?, ?, ?, ?) ");
            
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setString(1, jTextMatricula.getText());
            pst.setString(2, jTextNombre.getText());
            pst.setString(3, jTextPeso.getText());
            pst.setString(4, jTextCombustible.getText());
            pst.setString(5, jTextEmpuje.getText());
            pst.setString(6, jTextVelocidad.getText());
            pst.setString(7, jTextTservicio.getText());
                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Registro"+e.getMessage());
        }
    }
    
    //Método para limpiar los JTextFiel del formulario
     public void LimpiarFormulario(){
        jTextMatricula.setText("");
        jTextNombre.setText("");
        jTextPeso.setText("");
        jTextCombustible.setText("");
        jTextEmpuje.setText("");
        jTextVelocidad.setText(""); 
        jTextTservicio.setText(""); 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonCrear;
    private javax.swing.JLabel Combustible;
    private javax.swing.JPanel ContenidoCrearNoTri;
    private javax.swing.JLabel Crear;
    private javax.swing.JLabel Empuje;
    private javax.swing.JLabel Matricula;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Peso;
    private javax.swing.JLabel TServicio;
    private javax.swing.JLabel Velocidad;
    private javax.swing.JTextField jTextCombustible;
    private javax.swing.JTextField jTextEmpuje;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextTservicio;
    private javax.swing.JTextField jTextVelocidad;
    // End of variables declaration//GEN-END:variables
}
