
package vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import persistencia.Singleton;


public class VentanaAlumno extends javax.swing.JFrame {

    Perfil pnPerfil = new Perfil(false);
    MisTutores pnTutores = new MisTutores();
    TutoresDisponibles pnTutoresDisponibles = new TutoresDisponibles();
    
    JPanel panelActivo;
    
    public VentanaAlumno() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ventana Alumno");
        
        changePanel(pnTutores);
        lblNombreAlumno.setText(Singleton.get().getAlumno().getNombre());
    }
    
    void changePanel(JPanel pn)
    {
        panelActivo = pn;
        paneAzul.removeAll();
        paneAzul.add(pn, BorderLayout.CENTER);
        paneAzul.revalidate();
        paneAzul.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistro = new javax.swing.JLabel();
        rbAlumno = new javax.swing.JRadioButton();
        rbMaestro = new javax.swing.JRadioButton();
        lblMaestroIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblComplemento2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        cbTerminos = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jpFondoA = new javax.swing.JPanel();
        lblTutorateIcono = new javax.swing.JLabel();
        lblNombreAlumno = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        paneAzul = new javax.swing.JPanel();
        jmbVntAlumno = new javax.swing.JMenuBar();
        jmVntAlumno = new javax.swing.JMenu();
        menuMostrarPerfil = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuTutorias = new javax.swing.JMenu();
        menuTutoresDisponibles = new javax.swing.JMenuItem();
        menuMisTutores = new javax.swing.JMenuItem();
        menuRefrescar = new javax.swing.JMenu();
        menuImprimirTutores = new javax.swing.JMenu();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_2.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        lblRegistro.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblRegistro.setText("REGISTRO");

        rbAlumno.setBackground(new java.awt.Color(204, 255, 255));
        rbAlumno.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        rbAlumno.setLabel("Alumno");

        rbMaestro.setBackground(new java.awt.Color(204, 255, 255));
        rbMaestro.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        rbMaestro.setText("Maestro");

        lblMaestroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6_1.PNG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5_1.PNG"))); // NOI18N

        jLabel3.setText("Nombre completo:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Correo electronico:");

        lblComplemento2.setBackground(new java.awt.Color(255, 255, 255));
        lblComplemento2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblComplemento2.setText("@tutorate.mx");

        jLabel6.setText("Contraseña:");

        cbTerminos.setBackground(new java.awt.Color(204, 255, 255));
        cbTerminos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cbTerminos.setText("He leído y acepto los términos del contrato");

        jButton1.setText("Registrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMaestroIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblComplemento2)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTerminos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegistro)
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegistro)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaestroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAlumno)
                    .addComponent(rbMaestro))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento2))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbTerminos)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondoA.setBackground(new java.awt.Color(0, 153, 153));

        lblTutorateIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTutorateIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_2.PNG"))); // NOI18N

        lblNombreAlumno.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNombreAlumno.setText("nombre");

        lblBienvenido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBienvenido.setText("Bienvenido");

        javax.swing.GroupLayout jpFondoALayout = new javax.swing.GroupLayout(jpFondoA);
        jpFondoA.setLayout(jpFondoALayout);
        jpFondoALayout.setHorizontalGroup(
            jpFondoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTutorateIcono)
                .addGap(40, 40, 40))
            .addGroup(jpFondoALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoALayout.setVerticalGroup(
            jpFondoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoALayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(lblTutorateIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        paneAzul.setBackground(new java.awt.Color(204, 255, 255));
        paneAzul.setLayout(new java.awt.BorderLayout());

        jmVntAlumno.setText("Mi perfil");

        menuMostrarPerfil.setText("Mostrar perfil");
        menuMostrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarPerfilActionPerformed(evt);
            }
        });
        jmVntAlumno.add(menuMostrarPerfil);

        menuCerrarSesion.setText("Cerrar sesión");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        jmVntAlumno.add(menuCerrarSesion);

        menuTutorias.setText("Tutorias");

        menuTutoresDisponibles.setText("Tutores disponibles");
        menuTutoresDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTutoresDisponiblesActionPerformed(evt);
            }
        });
        menuTutorias.add(menuTutoresDisponibles);

        menuMisTutores.setText("Mostrar mis tutores");
        menuMisTutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMisTutoresActionPerformed(evt);
            }
        });
        menuTutorias.add(menuMisTutores);

        jmVntAlumno.add(menuTutorias);

        jmbVntAlumno.add(jmVntAlumno);

        menuRefrescar.setText("Refrescar");
        menuRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRefrescarMouseClicked(evt);
            }
        });
        jmbVntAlumno.add(menuRefrescar);

        menuImprimirTutores.setText("Imprimir mis tutores");
        menuImprimirTutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuImprimirTutoresMouseClicked(evt);
            }
        });
        jmbVntAlumno.add(menuImprimirTutores);

        setJMenuBar(jmbVntAlumno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jpFondoA, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFondoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void menuMostrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarPerfilActionPerformed
        changePanel(pnPerfil);
    }//GEN-LAST:event_menuMostrarPerfilActionPerformed

    
    
    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        VentanaLogin formLogin = new VentanaLogin();
        formLogin.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    
    
    private void menuTutoresDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTutoresDisponiblesActionPerformed
        changePanel(pnTutoresDisponibles);
    }//GEN-LAST:event_menuTutoresDisponiblesActionPerformed

    
    private void menuMisTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMisTutoresActionPerformed
        changePanel(pnTutores);
    }//GEN-LAST:event_menuMisTutoresActionPerformed

    
    private void menuImprimirTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuImprimirTutoresMouseClicked
        PrintTutores formImprimirTutores = new PrintTutores(this);
        formImprimirTutores.setVisible(true);
        formImprimirTutores.setTitle("Ventana Imprimir Tutores");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuImprimirTutoresMouseClicked

    
    private void menuRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRefrescarMouseClicked
        
        if(panelActivo.equals(pnPerfil))
        {
            pnPerfil.refrescar();
        }
        else if(panelActivo.equals(pnTutores))
        {
            pnTutores.refrescar();
        }
        else
        {
            pnTutoresDisponibles.refrescar();
        }
        lblNombreAlumno.setText(Singleton.get().getAlumno().getNombre());
        
    }//GEN-LAST:event_menuRefrescarMouseClicked

    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VentanaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbTerminos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenu jmVntAlumno;
    private javax.swing.JMenuBar jmbVntAlumno;
    private javax.swing.JPanel jpFondoA;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblComplemento2;
    private javax.swing.JLabel lblMaestroIcon;
    private javax.swing.JLabel lblNombreAlumno;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTutorateIcono;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenu menuImprimirTutores;
    private javax.swing.JMenuItem menuMisTutores;
    private javax.swing.JMenuItem menuMostrarPerfil;
    private javax.swing.JMenu menuRefrescar;
    private javax.swing.JMenuItem menuTutoresDisponibles;
    private javax.swing.JMenu menuTutorias;
    private javax.swing.JPanel paneAzul;
    private javax.swing.JRadioButton rbAlumno;
    private javax.swing.JRadioButton rbMaestro;
    // End of variables declaration//GEN-END:variables
}
