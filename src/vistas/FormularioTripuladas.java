
package vistas;

import navespacialsofka.ConectorDB;
import java.sql.Connection;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FormularioTripuladas extends javax.swing.JPanel {

        ConectorDB cc = new ConectorDB();
        Connection con = cc.conexion();
        
    public FormularioTripuladas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenidoCrearTri = new javax.swing.JPanel();
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
        TModelo = new javax.swing.JLabel();
        jTextTmodelo = new javax.swing.JTextField();
        TPais = new javax.swing.JLabel();
        jTextTPais = new javax.swing.JTextField();

        ContenidoCrearTri.setBackground(new java.awt.Color(0, 0, 153));

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

        TModelo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TModelo.setForeground(new java.awt.Color(255, 255, 255));
        TModelo.setText("Modelo:");

        jTextTmodelo.setBackground(new java.awt.Color(0, 0, 153));
        jTextTmodelo.setForeground(new java.awt.Color(204, 204, 204));
        jTextTmodelo.setText("Ingrese Modelo");
        jTextTmodelo.setBorder(null);
        jTextTmodelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextTmodeloMousePressed(evt);
            }
        });

        TPais.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TPais.setForeground(new java.awt.Color(255, 255, 255));
        TPais.setText("Pais:");

        jTextTPais.setBackground(new java.awt.Color(0, 0, 153));
        jTextTPais.setForeground(new java.awt.Color(204, 204, 204));
        jTextTPais.setText("Ingrese Pais");
        jTextTPais.setBorder(null);
        jTextTPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextTPaisMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ContenidoCrearTriLayout = new javax.swing.GroupLayout(ContenidoCrearTri);
        ContenidoCrearTri.setLayout(ContenidoCrearTriLayout);
        ContenidoCrearTriLayout.setHorizontalGroup(
            ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                        .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                                        .addComponent(Matricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                                        .addComponent(Peso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                                .addComponent(TModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTmodelo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                        .addComponent(Empuje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                        .addComponent(Velocidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                        .addComponent(Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                        .addComponent(Combustible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                        .addComponent(TPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTPais, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        ContenidoCrearTriLayout.setVerticalGroup(
            ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoCrearTriLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combustible, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empuje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmpuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TPais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextTPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoCrearTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoCrearTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenidoCrearTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMatriculaMousePressed
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

        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
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

        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
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

        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
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

        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
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

        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
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

        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
        }

    }//GEN-LAST:event_jTextVelocidadMousePressed

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked
        insertarDatos();
        LimpiarFormulario();
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseEntered
        BotonCrear.setBackground(Color.white);
        Crear.setForeground(Color.black);
    }//GEN-LAST:event_BotonCrearMouseEntered

    private void BotonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseExited
        BotonCrear.setBackground(new Color(0,0,0));
        Crear.setForeground(Color.white);
    }//GEN-LAST:event_BotonCrearMouseExited

    private void jTextTmodeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextTmodeloMousePressed
        if(jTextTmodelo.getText().equals("Ingrese Modelo")){
            jTextTmodelo.setText("");
            jTextTmodelo.setForeground(Color. white);
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
        
        if (jTextTPais.getText().isEmpty()) {
            jTextTPais.setText("Ingrese Pais");
            jTextTPais.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextTmodeloMousePressed

    private void jTextTPaisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextTPaisMousePressed
        if(jTextTPais.getText().equals("Ingrese Pais")){
            jTextTPais.setText("");
            jTextTPais.setForeground(Color. white);
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
        
        if (jTextTmodelo.getText().isEmpty()) {
            jTextTmodelo.setText("Ingrese Modelo");
            jTextTmodelo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextTPaisMousePressed

    public void insertarDatos(){
        try {
            String SQL =("INSERT INTO tripulada (matricula_id, nombre, peso, combustible, empuje, velocidad, modelo, pais) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ");
            
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setString(1, jTextMatricula.getText());
            pst.setString(2, jTextNombre.getText());
            pst.setString(3, jTextPeso.getText());
            pst.setString(4, jTextCombustible.getText());
            pst.setString(5, jTextEmpuje.getText());
            pst.setString(6, jTextVelocidad.getText());
            pst.setString(7, jTextTmodelo.getText());
            pst.setString(8, jTextTPais.getText());
                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Registro"+e.getMessage());
        }
    }
    
     public void LimpiarFormulario(){
        jTextMatricula.setText("");
        jTextNombre.setText("");
        jTextPeso.setText("");
        jTextCombustible.setText("");
        jTextEmpuje.setText("");
        jTextVelocidad.setText(""); 
        jTextTmodelo.setText(""); 
        jTextTPais.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonCrear;
    private javax.swing.JLabel Combustible;
    private javax.swing.JPanel ContenidoCrearTri;
    private javax.swing.JLabel Crear;
    private javax.swing.JLabel Empuje;
    private javax.swing.JLabel Matricula;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Peso;
    private javax.swing.JLabel TModelo;
    private javax.swing.JLabel TPais;
    private javax.swing.JLabel Velocidad;
    private javax.swing.JTextField jTextCombustible;
    private javax.swing.JTextField jTextEmpuje;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextTPais;
    private javax.swing.JTextField jTextTmodelo;
    private javax.swing.JTextField jTextVelocidad;
    // End of variables declaration//GEN-END:variables
}
