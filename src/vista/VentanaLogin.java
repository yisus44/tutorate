
package vista;

import controlador.Controlador;
import javax.swing.JOptionPane;
import persistencia.Singleton;


public class VentanaLogin extends javax.swing.JFrame 
{

    Controlador controlador;
    
    public VentanaLogin() 
    {
        try
        {
            initComponents();
            setTitle("Ventana Login");
            setLocationRelativeTo(null);
            setResizable(false);
            
            controlador = new Controlador();
        }
        catch(Exception ex)
        {
            System.out.println("Ventana login: Error en VentanaLogin()");
        }
    }

    
    
    
    
    
    public int consultarLogin(String email, String contrasena)
    {
        try
        {
            controlador.abrirConexion();
            int res = controlador.consultarLogin(email, contrasena);
            if(res == -1)
            {
                JOptionPane.showMessageDialog(this, "Usuario no existe en la Base de Datos");
                return -1;
            }
            else if(res == -2)
            {
                JOptionPane.showMessageDialog(this, "IMPOSIBOOOOOOOL");
                return -2;
            }
            
            controlador.cerrarConexion();
            return 1;
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarLogin");
            return -1;
        }
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        paneVerde = new javax.swing.JPanel();
        lblTutorate2 = new javax.swing.JLabel();
        paneAzul = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        lblRegistrarse = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrarse = new javax.swing.JButton();
        cbRecuerdame = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneVerde.setBackground(new java.awt.Color(0, 153, 153));

        lblTutorate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTutorate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_1.PNG"))); // NOI18N

        javax.swing.GroupLayout paneVerdeLayout = new javax.swing.GroupLayout(paneVerde);
        paneVerde.setLayout(paneVerdeLayout);
        paneVerdeLayout.setHorizontalGroup(
            paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTutorate2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneVerdeLayout.setVerticalGroup(
            paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVerdeLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblTutorate2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneAzul.setBackground(new java.awt.Color(204, 255, 255));

        lblLogin.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblLogin.setText("INICIE SESIÓN");

        lblCorreo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCorreo.setText("Correo electronico");

        tfCorreo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tfCorreo.setText("Email2");

        lblComplemento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblComplemento.setText("@tutorate.mx");

        lblPass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPass.setText("Contraseña");

        tfPass.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tfPass.setText("12342");

        lblRegistrarse.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(0, 153, 153));
        lblRegistrarse.setText("¿Aun no tiene una cuenta?");

        btnRegistrarse.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrarse.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegistrarse.setText("Registrarme");
        btnRegistrarse.setToolTipText("");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        cbRecuerdame.setBackground(new java.awt.Color(204, 255, 255));
        cbRecuerdame.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbRecuerdame.setText("Recuérdame ");

        btnLogin.setBackground(new java.awt.Color(0, 153, 153));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.setToolTipText("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneAzulLayout = new javax.swing.GroupLayout(paneAzul);
        paneAzul.setLayout(paneAzulLayout);
        paneAzulLayout.setHorizontalGroup(
            paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paneAzulLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneAzulLayout.createSequentialGroup()
                        .addComponent(lblRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarse))
                    .addGroup(paneAzulLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPass)
                            .addComponent(lblCorreo)
                            .addGroup(paneAzulLayout.createSequentialGroup()
                                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(tfCorreo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblComplemento))
                            .addComponent(cbRecuerdame, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        paneAzulLayout.setVerticalGroup(
            paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAzulLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblLogin)
                .addGap(70, 70, 70)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento))
                .addGap(26, 26, 26)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cbRecuerdame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrarse)
                    .addComponent(btnRegistrarse))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(paneVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        int res = consultarLogin(tfCorreo.getText(), tfPass.getText());
        
        if(res == 1)
        {
            if(Singleton.get() != null)
            {
                if(Singleton.get().isEsMaestro())
                {
                    VentanaMaestro formMaestro = new VentanaMaestro();
                    formMaestro.setVisible(true);
                    formMaestro.setTitle("Ventana Maestro");
                    this.setVisible(false);
                    this.dispose();
                }
                else
                {
                    VentanaAlumno formAlumno = new VentanaAlumno();
                    formAlumno.setVisible(true);
                    formAlumno.setTitle("Ventana Alumno");
                    this.setVisible(false);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        VentanaRegistro formRegistro = new VentanaRegistro();
        formRegistro.setVisible(true);;
        formRegistro.setTitle("Ventana Registro");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    
    
    
    
    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBox cbRecuerdame;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblTutorate2;
    private javax.swing.JPanel paneAzul;
    private javax.swing.JPanel paneVerde;
    private java.awt.Panel panel1;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JPasswordField tfPass;
    // End of variables declaration//GEN-END:variables

}
