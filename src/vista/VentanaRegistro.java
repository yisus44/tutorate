/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class VentanaRegistro extends javax.swing.JFrame 
{
    
    ButtonGroup group;
    
    
    Controlador controlador;
    
    
    
    public VentanaRegistro() 
    {
        try
        {
            initComponents();
            setLocationRelativeTo(null);
            setResizable(false);
            setTitle("Ventana Registro");

            controlador = new Controlador();

            group = new ButtonGroup();
            group.add(rbMaestro);
            group.add(rbAlumno);
            
            tfEspecialidad.enable(false);
        }
        catch(Exception ex)
        {
            System.out.println("VentanaRegistro: Error con VentanaRegistro()");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneVerde = new javax.swing.JPanel();
        lbltutorate = new javax.swing.JLabel();
        paneAzul = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistro = new javax.swing.JLabel();
        rbAlumno = new javax.swing.JRadioButton();
        rbMaestro = new javax.swing.JRadioButton();
        lblMaestroIcon = new javax.swing.JLabel();
        lblIconoAlumno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        lblCorreoE = new javax.swing.JLabel();
        tfCorreoE = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        tfContraseña = new javax.swing.JTextField();
        cbTerminos = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        lblEspecialidad = new javax.swing.JLabel();
        tfEspecialidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneVerde.setBackground(new java.awt.Color(0, 153, 153));
        paneVerde.setPreferredSize(new java.awt.Dimension(230, 528));

        lbltutorate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltutorate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_2.PNG"))); // NOI18N

        javax.swing.GroupLayout paneVerdeLayout = new javax.swing.GroupLayout(paneVerde);
        paneVerde.setLayout(paneVerdeLayout);
        paneVerdeLayout.setHorizontalGroup(
            paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltutorate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneVerdeLayout.setVerticalGroup(
            paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltutorate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        paneAzul.setBackground(new java.awt.Color(204, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        lblRegistro.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblRegistro.setText("REGISTRO");

        rbAlumno.setBackground(new java.awt.Color(204, 255, 255));
        rbAlumno.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        rbAlumno.setLabel("Alumno");
        rbAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAlumnoMouseClicked(evt);
            }
        });

        rbMaestro.setBackground(new java.awt.Color(204, 255, 255));
        rbMaestro.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        rbMaestro.setText("Maestro");
        rbMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMaestroMouseClicked(evt);
            }
        });

        lblMaestroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6_1.PNG"))); // NOI18N

        lblIconoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5_1.PNG"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombre.setText("Nombre completo:");

        lblEdad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEdad.setText("Edad:");

        lblCorreoE.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCorreoE.setText("Correo electronico:");

        lblComplemento.setBackground(new java.awt.Color(255, 255, 255));
        lblComplemento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblComplemento.setText("@tutorate.mx");

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblContraseña.setText("Contraseña:");

        cbTerminos.setBackground(new java.awt.Color(204, 255, 255));
        cbTerminos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbTerminos.setForeground(new java.awt.Color(0, 0, 204));
        cbTerminos.setText("He leído y acepto los términos del contrato");
        cbTerminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTerminosMouseClicked(evt);
            }
        });
        cbTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTerminosActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblEspecialidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEspecialidad.setText("Especialidad:");

        javax.swing.GroupLayout paneAzulLayout = new javax.swing.GroupLayout(paneAzul);
        paneAzul.setLayout(paneAzulLayout);
        paneAzulLayout.setHorizontalGroup(
            paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAzulLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblMaestroIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAzulLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(rbMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(paneAzulLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAzulLayout.createSequentialGroup()
                        .addComponent(lblCorreoE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblComplemento))
                    .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneAzulLayout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneAzulLayout.createSequentialGroup()
                                    .addComponent(lblEdad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneAzulLayout.createSequentialGroup()
                                    .addComponent(cbTerminos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(219, 219, 219))
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(paneAzulLayout.createSequentialGroup()
                            .addComponent(lblEspecialidad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfEspecialidad))
                        .addGroup(paneAzulLayout.createSequentialGroup()
                            .addComponent(lblContraseña)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegistro)
                .addGap(156, 156, 156))
        );
        paneAzulLayout.setVerticalGroup(
            paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAzulLayout.createSequentialGroup()
                        .addComponent(lblMaestroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMaestro))
                    .addGroup(paneAzulLayout.createSequentialGroup()
                        .addComponent(lblIconoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAlumno)))
                .addGap(44, 44, 44)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoE)
                    .addComponent(tfCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento))
                .addGap(18, 18, 18)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidad)
                    .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(cbTerminos)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(paneVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(paneAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void cbTerminosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTerminosMouseClicked
        
        if(cbTerminos.isSelected())
        {
            cbTerminos.setSelected(false);
            
            JFrame frame = new JFrame();
            JDialog dialog = new JDialog(frame, "Terminos y Condiciones", true); // parameters: jframe, title, modal=true | non-modal=false
            TerminosCondiciones panel = new TerminosCondiciones(frame, this);
            dialog.add(panel);
            dialog.setSize(new Dimension(712, 472));
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        }
        
    }//GEN-LAST:event_cbTerminosMouseClicked

    public boolean isAceptoTerminos() 
    {
        return cbTerminos.isSelected();
    }

    public void setAceptoTerminos(boolean aceptoTerminos) 
    {
        this.cbTerminos.setSelected(aceptoTerminos);
    }
    
    
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        boolean exito = false;
        
        if(cbTerminos.isSelected())
        {
            if(rbMaestro.isSelected())
            {
                insertarMaestro(tfNombre.getText(), tfCorreoE.getText(), Integer.parseInt(tfEdad.getText()), 
                       tfContraseña.getText(), tfEspecialidad.getText());

                exito = true;
            }
            else if(rbAlumno.isSelected())
            {
                insertarAlumno(tfNombre.getText(), tfCorreoE.getText(), Integer.parseInt(tfEdad.getText()), 
                    tfContraseña.getText());

                exito = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Seleccionar si seras Maestro o Alumno", "", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Favor de aceptar Terminos y Condiciones", "", JOptionPane.WARNING_MESSAGE);
        }
        
        if(exito)
        {
            VentanaLogin formLogin = new VentanaLogin();
            formLogin.setVisible(true);
            formLogin.setTitle("Ventana Login");
            this.setVisible(false);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    
    private void rbMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMaestroMouseClicked
        
        if(rbMaestro.isSelected())
            tfEspecialidad.enable(true);
        
    }//GEN-LAST:event_rbMaestroMouseClicked

    private void rbAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAlumnoMouseClicked
        
        if(rbAlumno.isSelected())
        {
            tfEspecialidad.enable(false);
            tfEspecialidad.setText("");
        }
            
        
    }//GEN-LAST:event_rbAlumnoMouseClicked

    private void cbTerminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTerminosActionPerformed
        
    }//GEN-LAST:event_cbTerminosActionPerformed

    
    public void insertarMaestro(String nombre, String email, int edad, String contraseña, String especialidad)
    {
        try
        {
            controlador.abrirConexion();
            controlador.insertarMaestro(nombre, email, edad, contraseña, especialidad);
            controlador.cerrarConexion();
            System.out.println("Se ha creado un maestro con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con insertarMaestro");
        }
    }
    
    public void insertarAlumno(String nombre, String email, int edad, String contraseña)
    {
        try
        {
            controlador.abrirConexion();
            controlador.insertarAlumno(nombre, email, edad, contraseña);
            controlador.cerrarConexion();
            System.out.println("Se ha creado un alumno con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con insertarAlumno");
        }
    }
    
    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox cbTerminos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreoE;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblIconoAlumno;
    private javax.swing.JLabel lblMaestroIcon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lbltutorate;
    private javax.swing.JPanel paneAzul;
    private javax.swing.JPanel paneVerde;
    private javax.swing.JRadioButton rbAlumno;
    private javax.swing.JRadioButton rbMaestro;
    private javax.swing.JTextField tfContraseña;
    private javax.swing.JTextField tfCorreoE;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfEspecialidad;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
