
package vista;

import controlador.Controlador;

public class FrameDePruebaNoOficial extends javax.swing.JFrame 
{
    Controlador controlador;
    
    public FrameDePruebaNoOficial() 
    {
        try
        {
            initComponents();
        
            controlador = new Controlador(); 
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con crearUnMaestro");
        }
    }
    
    // INSERTAR
    
    public void insertarMaestro(String nombre, String email, int edad, String contraseña, String especialidad)
    {
        try
        {
            controlador.abrirConexion();
            controlador.cargarMaestro(nombre, email, edad, contraseña, especialidad);
            controlador.insertarMaestro();
            controlador.cerrarConexion();
            System.out.println("Se ha creado un maestro con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con crearUnMaestro");
        }
    }
    
    public void insertarAlumno(String nombre, String email, int edad, String contraseña, int IDtutor)
    {
        try
        {
            controlador.abrirConexion();
            controlador.cargarAlumno(nombre, email, edad, contraseña, IDtutor);
            controlador.insertarAlumno();
            controlador.cerrarConexion();
            System.out.println("Se ha creado un alumno con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con crearUnAlumno");
        }
    }
    
    // CONSULTAR
    
    public void consultarMaestroPorID(int ID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarMaestroPorID(ID);
            controlador.cerrarConexion();
            System.out.println("Se ha consultado un maestro con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarUnMaestro");
        }
    }
    
    public void consultarAlumnoPorID(int ID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarAlumnoPorID(ID);
            controlador.cerrarConexion();
            System.out.println("Se ha consultado un alumno con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarUnAlumno");
        }
    }
    
    // ACTUALIZAR
    
    public void actualizarMaestroPorID(String nombre, String email, int edad, String contraseña, String especialidad, int ID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.cargarMaestro(nombre, email, edad, contraseña, especialidad);
            controlador.actualizarMaestro(ID);
            controlador.cerrarConexion();
            System.out.println("Se ha actualizado un maestro con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con actualizarUnMaestro");
        }
    }
    
    public void actualizarAlumnoPorID(String nombre, String email, int edad, String contraseña, int ID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.cargarAlumno(nombre, email, edad, contraseña, 0);
            controlador.actualizarAlumno(ID);
            controlador.cerrarConexion();
            System.out.println("Se ha actualizado un alumno con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con actualizarUnAlumno");
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreAlumnos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmailAlumnos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdadAlumnos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContrasenaAlumnos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreMaestros = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmailMaestros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdadMaestros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContrasenaMaestros = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEspecialidadMaestros = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnConsultarAlumno = new javax.swing.JButton();
        btnActualizarAlumno = new javax.swing.JButton();
        btnEliminarAlumno = new javax.swing.JButton();
        btnInsertarAlumno = new javax.swing.JButton();
        btnConsultarMaestro = new javax.swing.JButton();
        btnActualizarMaestro = new javax.swing.JButton();
        btnEliminarMaestro = new javax.swing.JButton();
        btnInsertarMaestro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtIDMaestros = new javax.swing.JTextField();
        txtIDAlumnos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIDTutor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombreTutor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Email");

        jLabel3.setText("Edad");

        jLabel4.setText("Contraseña");

        jLabel6.setText("Especialidad");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Email");

        jLabel9.setText("Edad");

        jLabel10.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Maestros");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Alumnos");

        btnConsultarAlumno.setText("Consultar");
        btnConsultarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAlumnoActionPerformed(evt);
            }
        });

        btnActualizarAlumno.setText("Actualizar");
        btnActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlumnoActionPerformed(evt);
            }
        });

        btnEliminarAlumno.setText("Eliminar");
        btnEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoActionPerformed(evt);
            }
        });

        btnInsertarAlumno.setText("Insertar");
        btnInsertarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAlumnoActionPerformed(evt);
            }
        });

        btnConsultarMaestro.setText("Consultar");
        btnConsultarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMaestroActionPerformed(evt);
            }
        });

        btnActualizarMaestro.setText("Actualizar");
        btnActualizarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMaestroActionPerformed(evt);
            }
        });

        btnEliminarMaestro.setText("Eliminar");
        btnEliminarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMaestroActionPerformed(evt);
            }
        });

        btnInsertarMaestro.setText("Insertar");
        btnInsertarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarMaestroActionPerformed(evt);
            }
        });

        jLabel12.setText("ID");

        jLabel13.setText("ID");

        jLabel14.setText("ID del tutor");

        jLabel15.setText("Nombre del tutor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConsultarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIDTutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(txtContrasenaAlumnos)
                                    .addComponent(txtEdadAlumnos)
                                    .addComponent(txtEmailAlumnos)
                                    .addComponent(txtNombreAlumnos)
                                    .addComponent(txtIDAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11)
                                .addComponent(jLabel13))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConsultarMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertarMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(txtContrasenaMaestros)
                                .addComponent(txtEdadMaestros)
                                .addComponent(txtEmailMaestros)
                                .addComponent(txtNombreMaestros)
                                .addComponent(txtEspecialidadMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(txtIDMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContrasenaMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContrasenaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidadMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertarMaestro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarMaestro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarMaestro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMaestro)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnInsertarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAlumnoActionPerformed
        
        insertarAlumno(txtNombreAlumnos.getText(), txtEmailAlumnos.getText(), Integer.parseInt(txtEdadAlumnos.getText()), 
                txtContrasenaAlumnos.getText(), Integer.parseInt(txtIDTutor.getText()));
    
    }//GEN-LAST:event_btnInsertarAlumnoActionPerformed

    private void btnConsultarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAlumnoActionPerformed
    
        consultarAlumnoPorID(Integer.parseInt(txtIDAlumnos.getText()));
        
    }//GEN-LAST:event_btnConsultarAlumnoActionPerformed

    private void btnActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlumnoActionPerformed
        
        actualizarAlumnoPorID(txtNombreAlumnos.getText(), txtEmailAlumnos.getText(), Integer.parseInt(txtEdadAlumnos.getText()), 
                txtContrasenaAlumnos.getText(), Integer.parseInt(txtIDAlumnos.getText()));
        
    }//GEN-LAST:event_btnActualizarAlumnoActionPerformed

    private void btnEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoActionPerformed
        
    }//GEN-LAST:event_btnEliminarAlumnoActionPerformed

        
        
        
        
    private void btnInsertarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarMaestroActionPerformed
        
       insertarMaestro(txtNombreMaestros.getText(), txtEmailMaestros.getText(), Integer.parseInt(txtEdadMaestros.getText()), 
               txtContrasenaMaestros.getText(), txtEspecialidadMaestros.getText());
       
    }//GEN-LAST:event_btnInsertarMaestroActionPerformed

    private void btnConsultarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMaestroActionPerformed
        
        consultarMaestroPorID(Integer.parseInt(txtIDMaestros.getText()));
        
    }//GEN-LAST:event_btnConsultarMaestroActionPerformed

    private void btnActualizarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMaestroActionPerformed
        
        actualizarMaestroPorID(txtNombreMaestros.getText(), txtEmailMaestros.getText(), Integer.parseInt(txtEdadMaestros.getText()), 
               txtContrasenaMaestros.getText(), txtEspecialidadMaestros.getText(), Integer.parseInt(txtIDMaestros.getText()));
        
    }//GEN-LAST:event_btnActualizarMaestroActionPerformed

    private void btnEliminarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMaestroActionPerformed
        
    }//GEN-LAST:event_btnEliminarMaestroActionPerformed

    
    
    
    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FrameDePruebaNoOficial().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAlumno;
    private javax.swing.JButton btnActualizarMaestro;
    private javax.swing.JButton btnConsultarAlumno;
    private javax.swing.JButton btnConsultarMaestro;
    private javax.swing.JButton btnEliminarAlumno;
    private javax.swing.JButton btnEliminarMaestro;
    private javax.swing.JButton btnInsertarAlumno;
    private javax.swing.JButton btnInsertarMaestro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtContrasenaAlumnos;
    private javax.swing.JTextField txtContrasenaMaestros;
    private javax.swing.JTextField txtEdadAlumnos;
    private javax.swing.JTextField txtEdadMaestros;
    private javax.swing.JTextField txtEmailAlumnos;
    private javax.swing.JTextField txtEmailMaestros;
    private javax.swing.JTextField txtEspecialidadMaestros;
    private javax.swing.JTextField txtIDAlumnos;
    private javax.swing.JTextField txtIDMaestros;
    private javax.swing.JTextField txtIDTutor;
    private javax.swing.JTextField txtNombreAlumnos;
    private javax.swing.JTextField txtNombreMaestros;
    private javax.swing.JTextField txtNombreTutor;
    // End of variables declaration//GEN-END:variables
}
