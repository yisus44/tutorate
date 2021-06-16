
package vista;

import controlador.Controlador;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import modelo.Alumno;
import modelo.Maestro;
import persistencia.Singleton;


public class PrintTutores extends javax.swing.JFrame 
{
    DefaultListModel modelo;
    
    Controlador controlador;
    
    VentanaAlumno formAlumno;

    public PrintTutores(VentanaAlumno formAlumno) 
    {
        try
        {
            initComponents();
            setDefaultCloseOperation(HIDE_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setTitle("Ventana Imprimir Tutores");

            controlador = new Controlador();

            tfAlumno.setText(Singleton.get().getAlumno().getNombre());
            
            modelo = new DefaultListModel();
            lTutores.setModel(modelo);
            
            consultarMaestrosTutores(Singleton.get().getAlumno().getUsuarioID());
            ArrayList<Maestro> maestros = controlador.getMaestrosTutores();
            for(int i=0; i<maestros.size(); i++)
            {
               modelo.addElement(maestros.get(i).getUsuarioID() + " --- " + maestros.get(i).getNombre() + " --- " + 
                       maestros.get(i).getEmail() + "@tutorate.mx" + " --- " + maestros.get(i).getEspecialidad());
            }
            
            
            this.formAlumno = formAlumno;
            
        }
        catch(Exception ex)
        {
            System.out.println("PrintTutores: Error con crear PrintTutores() " + ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paneImpresionMisTutores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lTutores = new javax.swing.JList<>();
        lblMisTutores = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        tfAlumno = new java.awt.TextField();
        lblIconoImpresora = new javax.swing.JLabel();
        lblImprimir = new javax.swing.JLabel();
        lblTutorate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        paneImpresionMisTutores.setBackground(new java.awt.Color(255, 255, 255));
        paneImpresionMisTutores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(lTutores);

        lblMisTutores.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblMisTutores.setText("MIS TUTORES");

        lblAlumno.setText("ALUMNO:");

        javax.swing.GroupLayout paneImpresionMisTutoresLayout = new javax.swing.GroupLayout(paneImpresionMisTutores);
        paneImpresionMisTutores.setLayout(paneImpresionMisTutoresLayout);
        paneImpresionMisTutoresLayout.setHorizontalGroup(
            paneImpresionMisTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImpresionMisTutoresLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(paneImpresionMisTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImpresionMisTutoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(paneImpresionMisTutoresLayout.createSequentialGroup()
                        .addComponent(lblAlumno)
                        .addGap(23, 23, 23)
                        .addGroup(paneImpresionMisTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMisTutores)
                            .addComponent(tfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        paneImpresionMisTutoresLayout.setVerticalGroup(
            paneImpresionMisTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImpresionMisTutoresLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblMisTutores)
                .addGap(51, 51, 51)
                .addGroup(paneImpresionMisTutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlumno)
                    .addComponent(tfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lblIconoImpresora.setBackground(new java.awt.Color(204, 204, 204));
        lblIconoImpresora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoImpresora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoImprimir_2.PNG"))); // NOI18N
        lblIconoImpresora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoImpresoraMouseClicked(evt);
            }
        });

        lblImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblImprimir.setText("Imprimir");

        lblTutorate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_3.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImprimir)
                        .addGap(32, 32, 32)))
                .addGap(95, 95, 95)
                .addComponent(paneImpresionMisTutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblTutorate)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconoImpresora)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblTutorate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImprimir)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(paneImpresionMisTutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void lblIconoImpresoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoImpresoraMouseClicked
       JOptionPane.showMessageDialog(null, "Conecte la impresora men", "Sad Moment", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_lblIconoImpresoraMouseClicked

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        this.dispose();
        formAlumno.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    
    public void consultarMaestrosTutores(int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarMaestrosTutores(AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se han consultado los tutores con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarMaestrosTutores");
        }
    }
    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new PrintTutores(new VentanaAlumno()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lTutores;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblIconoImpresora;
    private javax.swing.JLabel lblImprimir;
    private javax.swing.JLabel lblMisTutores;
    private javax.swing.JLabel lblTutorate;
    private javax.swing.JPanel paneImpresionMisTutores;
    private java.awt.TextField tfAlumno;
    // End of variables declaration//GEN-END:variables
}
