
package vista;

import controlador.Controlador;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Alumno;
import persistencia.Singleton;


public class PrintTutorados extends javax.swing.JFrame 
{

    DefaultListModel modelo;
    Controlador controlador;
    VentanaMaestro formMaestro;
    
    public PrintTutorados(VentanaMaestro formMaestro) 
    {
        try
        {
            initComponents();
            setDefaultCloseOperation(HIDE_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setTitle("Ventana Imprimir Tutorados");

            
            controlador = new Controlador();
            

            tfTutor.setText(Singleton.get().getMaestro().getNombre());


            modelo = new DefaultListModel();
            lTutorados.setModel(modelo);

            
            consultarTutorados(Singleton.get().getMaestro().getUsuarioID());
            ArrayList<Alumno> alumnos = controlador.getAlumnos();
            for(int i=0; i<alumnos.size(); i++)
            {
               modelo.addElement(alumnos.get(i).getUsuarioID() + " --- " + alumnos.get(i).getNombre() + " --- " + 
                       alumnos.get(i).getEmail() + "@tutorate.mx");
            }
            
            
            this.formMaestro = formMaestro;
            
        }
        catch(Exception ex)
        {
            System.out.println("PrintTutorados: Error con crear PrintTutorados() " + ex.getMessage());
        }
    }

    
    
    public void consultarTutorados(int MaestroID) 
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarTutorados(MaestroID);
            controlador.cerrarConexion();
            System.out.println("Se han consultado los tutorados con exito");
        }
        catch(Exception ex)
        {
            System.out.println("PrintTutorados: Error con consultarTutorados " + ex.getMessage());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneImprimirTutorados = new javax.swing.JPanel();
        paneImpresion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lTutorados = new javax.swing.JList<>();
        lblTutorados = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        tfTutor = new java.awt.TextField();
        lblIconoImpresora = new javax.swing.JLabel();
        lblImprimir = new javax.swing.JLabel();
        lblTutorate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        paneImprimirTutorados.setBackground(new java.awt.Color(255, 255, 255));
        paneImprimirTutorados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        paneImpresion.setBackground(new java.awt.Color(255, 255, 255));
        paneImpresion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(lTutorados);

        lblTutorados.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblTutorados.setText("TUTORADOS");

        lblDocente.setText("Docente:");

        javax.swing.GroupLayout paneImpresionLayout = new javax.swing.GroupLayout(paneImpresion);
        paneImpresion.setLayout(paneImpresionLayout);
        paneImpresionLayout.setHorizontalGroup(
            paneImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImpresionLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(paneImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneImpresionLayout.createSequentialGroup()
                        .addComponent(lblDocente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImpresionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTutorados)
                .addGap(89, 89, 89))
        );
        paneImpresionLayout.setVerticalGroup(
            paneImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImpresionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTutorados)
                .addGap(49, 49, 49)
                .addGroup(paneImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

        javax.swing.GroupLayout paneImprimirTutoradosLayout = new javax.swing.GroupLayout(paneImprimirTutorados);
        paneImprimirTutorados.setLayout(paneImprimirTutoradosLayout);
        paneImprimirTutoradosLayout.setHorizontalGroup(
            paneImprimirTutoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImprimirTutoradosLayout.createSequentialGroup()
                .addGroup(paneImprimirTutoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneImprimirTutoradosLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblIconoImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneImprimirTutoradosLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblImprimir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(paneImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(lblTutorate)
                .addContainerGap())
        );
        paneImprimirTutoradosLayout.setVerticalGroup(
            paneImprimirTutoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImprimirTutoradosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconoImpresora)
                .addGroup(paneImprimirTutoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneImprimirTutoradosLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblTutorate))
                    .addGroup(paneImprimirTutoradosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImprimir)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImprimirTutoradosLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(paneImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneImprimirTutorados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneImprimirTutorados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void lblIconoImpresoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoImpresoraMouseClicked
       JOptionPane.showMessageDialog(null, "Conecte la impresora men", "Sad Moment", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_lblIconoImpresoraMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        this.setVisible(false);
        this.dispose();
        formMaestro.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

   
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new PrintTutorados(new VentanaMaestro()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lTutorados;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblIconoImpresora;
    private javax.swing.JLabel lblImprimir;
    private javax.swing.JLabel lblTutorados;
    private javax.swing.JLabel lblTutorate;
    private javax.swing.JPanel paneImpresion;
    private javax.swing.JPanel paneImprimirTutorados;
    private java.awt.TextField tfTutor;
    // End of variables declaration//GEN-END:variables
}
