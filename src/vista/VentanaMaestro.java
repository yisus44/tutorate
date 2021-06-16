
package vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import persistencia.Singleton;

public class VentanaMaestro extends javax.swing.JFrame 
{
    Perfil pnPerfil = new Perfil(true);
    MisTutorados pnTutorados = new MisTutorados();
    
    JPanel panelActivo;
    
    public VentanaMaestro() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ventana Maestro");
        
        lblNombreTutor.setText(Singleton.get().getMaestro().getNombre());
        changePanel(pnTutorados);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneVerde = new javax.swing.JPanel();
        lblTutorate = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblNombreTutor = new javax.swing.JLabel();
        paneAzul = new javax.swing.JPanel();
        jmbVtnMaestro = new javax.swing.JMenuBar();
        menuMiPerfil = new javax.swing.JMenu();
        menuMostrarPerfil = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuRefrescar = new javax.swing.JMenu();
        menuVerTutorados = new javax.swing.JMenu();
        menuImprimirTutorados = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneVerde.setBackground(new java.awt.Color(0, 153, 153));

        lblTutorate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTutorate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_2.PNG"))); // NOI18N

        lblBienvenido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBienvenido.setText("Bienvenido");

        lblNombreTutor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNombreTutor.setText("nombre");

        javax.swing.GroupLayout paneVerdeLayout = new javax.swing.GroupLayout(paneVerde);
        paneVerde.setLayout(paneVerdeLayout);
        paneVerdeLayout.setHorizontalGroup(
            paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTutorate)
                .addGap(40, 40, 40))
            .addGroup(paneVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneVerdeLayout.setVerticalGroup(
            paneVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVerdeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTutorate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        paneAzul.setBackground(new java.awt.Color(204, 255, 255));
        paneAzul.setPreferredSize(new java.awt.Dimension(647, 520));
        paneAzul.setLayout(new java.awt.BorderLayout());

        menuMiPerfil.setText("Mi perfil");

        menuMostrarPerfil.setText("Mostrar perfil");
        menuMostrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarPerfilActionPerformed(evt);
            }
        });
        menuMiPerfil.add(menuMostrarPerfil);

        menuCerrarSesion.setText("Cerrar Sesión");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        menuMiPerfil.add(menuCerrarSesion);

        jmbVtnMaestro.add(menuMiPerfil);

        menuRefrescar.setText("Refrescar");
        menuRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRefrescarMouseClicked(evt);
            }
        });
        jmbVtnMaestro.add(menuRefrescar);

        menuVerTutorados.setText("Ver tutorados");
        menuVerTutorados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVerTutoradosMouseClicked(evt);
            }
        });
        jmbVtnMaestro.add(menuVerTutorados);

        menuImprimirTutorados.setText("Imprimir tutorados");
        menuImprimirTutorados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuImprimirTutoradosMouseClicked(evt);
            }
        });
        jmbVtnMaestro.add(menuImprimirTutorados);

        setJMenuBar(jmbVtnMaestro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    void changePanel(JPanel pn)
    {
        panelActivo = pn;
        
        paneAzul.removeAll();
        paneAzul.add(pn, BorderLayout.CENTER);
        paneAzul.revalidate();
        paneAzul.repaint();
    }
    
    
    private void menuMostrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarPerfilActionPerformed
       changePanel(pnPerfil);
    }//GEN-LAST:event_menuMostrarPerfilActionPerformed

    
    private void menuRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRefrescarMouseClicked
        pnTutorados.refrescar();
        
        if(panelActivo.equals(pnPerfil))
        {
            pnPerfil.refrescar();
        }
        else
        {
            pnTutorados.refrescar();
        }
        
        lblNombreTutor.setText(Singleton.get().getMaestro().getNombre());
    }//GEN-LAST:event_menuRefrescarMouseClicked

    
    private void menuVerTutoradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVerTutoradosMouseClicked
        changePanel(pnTutorados);
    }//GEN-LAST:event_menuVerTutoradosMouseClicked

    
    private void menuImprimirTutoradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuImprimirTutoradosMouseClicked
        PrintTutorados formImprimirTutorados = new PrintTutorados(this);
        formImprimirTutorados.setVisible(true);
        formImprimirTutorados.setTitle("Ventana Imprimir Tutorados");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuImprimirTutoradosMouseClicked

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        
        VentanaLogin formLogin = new VentanaLogin();
        formLogin.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new VentanaMaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jmbVtnMaestro;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNombreTutor;
    private javax.swing.JLabel lblTutorate;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenu menuImprimirTutorados;
    private javax.swing.JMenu menuMiPerfil;
    private javax.swing.JMenuItem menuMostrarPerfil;
    private javax.swing.JMenu menuRefrescar;
    private javax.swing.JMenu menuVerTutorados;
    private javax.swing.JPanel paneAzul;
    private javax.swing.JPanel paneVerde;
    // End of variables declaration//GEN-END:variables
}
