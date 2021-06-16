
package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TerminosCondiciones extends javax.swing.JPanel 
{
    boolean acepta;
    JFrame frame;
    VentanaRegistro formRegistro;
    
    
    public TerminosCondiciones(JFrame frame, VentanaRegistro formRegistro) 
    {
        initComponents();
        this.frame = frame;
        acepta = false;
        this.formRegistro = formRegistro;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Contrato = new javax.swing.JTextArea();
        lblTerminos = new javax.swing.JLabel();
        cbContrato = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        Contrato.setColumns(20);
        Contrato.setRows(5);
        Contrato.setText("El presente contrato describe los términos y condiciones aplicables al uso del contenido, productos y/o servicios del sitio web Mil Formatos del cual es titular Rubén Pérez Pérez. Para hacer uso del contenido, productos y/o servicios del sitio web el usuario deberá sujetarse a los presentes términos y condiciones.\n\nI. OBJETO\nEl objeto es regular el acceso y utilización del contenido, productos y/o servicios a disposición del público en general en el dominio https://www.milformatos.com.\n\nEl titular se reserva el derecho de realizar cualquier tipo de modificación en el sitio web en cualquier momento y sin previo aviso, el usuario acepta dichas modificaciones.\n\nEl acceso al sitio web por parte del usuario es libre y gratuito, la utilización del contenido, productos y/o servicios implica un costo de suscripción para el usuario.\n\nEl sitio web solo admite el acceso a personas mayores de edad y no se hace responsable por el incumplimiento de esto.\n\nEl sitio web está dirigido a usuarios residentes en México y cumple con la legislación establecida en dicho país, si el usuario reside en otro país y decide acceder al sitio web lo hará bajo su responsabilidad.\n\nLa administración del sitio web puede ejercerse por terceros, es decir, personas distintas al titular, sin afectar esto los presentes términos y condiciones.\n\nII. USUARIO\nLa actividad del usuario en el sitio web como publicaciones o comentarios estarán sujetos a los presentes términos y condiciones. El usuario se compromete a utilizar el contenido, productos y/o servicios de forma lícita, sin faltar a la moral o al orden público, absteniéndose de realizar cualquier acto que afecte los derechos de terceros o el funcionamiento del sitio web.\n\nEl usuario se compromete a proporcionar información verídica en los formularios del sitio web.\n\nEl acceso al sitio web no supone una relación entre el usuario y el titular del sitio web.\n\nEl usuario manifiesta ser mayor de edad y contar con la capacidad jurídica de acatar los presentes términos y condiciones.\n\nIII. ACCESO Y NAVEGACIÓN EN EL SITIO WEB\nEl titular no garantiza la continuidad y disponibilidad del contenido, productos y/o servicios en el sitito web, realizará acciones que fomenten el buen funcionamiento de dicho sitio web sin responsabilidad alguna.\n\nEl titular no se responsabiliza de que el software esté libre de errores que puedan causar un daño al software y/o hardware del equipo del cual el usuario accede al sitio web. De igual forma, no se responsabiliza por los daños causados por el acceso y/o utilización del sitio web.\n\nIV. POLÍTICA DE PRIVACIDAD Y PROTECCIÓN DE DATOS\nConforme a lo establecido en la Ley Federal de Protección de Datos Personales en Posesión de Particulares, el titular de compromete a tomar las medidas necesarias que garanticen la seguridad del usuario, evitando que se haga uso indebido de los datos personales que el usuario proporcione en el sitio web.");
        jScrollPane1.setViewportView(Contrato);

        lblTerminos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblTerminos.setText("Terminos y condiciones");

        cbContrato.setBackground(new java.awt.Color(204, 255, 255));
        cbContrato.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbContrato.setText("He leído y acepto los términos del contrato");
        cbContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbContratoMouseClicked(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(lblTerminos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTerminos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbContrato)
                    .addComponent(btnAceptar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cbContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbContratoMouseClicked
        if(cbContrato.isSelected())
        {
            acepta = true;
        }
        else
        {
            acepta = false;
        }
    }//GEN-LAST:event_cbContratoMouseClicked

    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        if(cbContrato.isSelected())
        {
            formRegistro.setAceptoTerminos(true);
            frame.setVisible(false);
            frame.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(frame, "Acepte los terminos y condiciones");
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Contrato;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox cbContrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTerminos;
    // End of variables declaration//GEN-END:variables
}
