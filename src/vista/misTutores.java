
package vista;

import controlador.Controlador;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.Maestro;
import persistencia.Singleton;
import tabla.Render;


public class MisTutores extends javax.swing.JPanel 
{
    DefaultTableModel modelo;
    Controlador controlador;
    
    public MisTutores() 
    {
        try
        {
            initComponents();
        
            controlador = new Controlador(); 
            
            tblMisTutores.setDefaultRenderer(Object.class, new Render());

            modelo = new DefaultTableModel()
            {
                public boolean isCellEditable(int row, int column)
                {
                return false;
                }
            };
            modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Especialidad"});
            tblMisTutores.setModel(modelo);
            tblMisTutores.setRowHeight(40);
            
            
            consultarMaestrosTutores(Singleton.get().getAlumno().getUsuarioID());
            ArrayList<Maestro> maestrosTutores = controlador.getMaestrosTutores();
            for(int i=0; i<maestrosTutores.size(); i++)
            {
                nuevaFila(maestrosTutores.get(i).getUsuarioID(), maestrosTutores.get(i).getNombre(), maestrosTutores.get(i).getEspecialidad());
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("MisTutores: Error con MisTutores");
        }
    }

    
    public void nuevaFila(int ID, String nombre, String especialidad)
    {
        Object struct[] = {ID, nombre, especialidad};
        modelo.addRow(struct);
    }
    
    public void refrescar()
    {
        int filas = tblMisTutores.getRowCount();
        
        for(int i=filas-1; i>=0; i--)
        {
            modelo.removeRow(i);
        }
        
        consultarMaestrosTutores(Singleton.get().getAlumno().getUsuarioID());
        ArrayList<Maestro> maestrosTutores = controlador.getMaestrosTutores();
        for(int i=0; i<maestrosTutores.size(); i++)
        {
            nuevaFila(maestrosTutores.get(i).getUsuarioID(), maestrosTutores.get(i).getNombre(), maestrosTutores.get(i).getEspecialidad());
        }
    }
    
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMisTutores = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblImagenMen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMisTutores = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));

        lblMisTutores.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblMisTutores.setText("Mis tutores");

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        lblImagenMen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImagenMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aquii_1.PNG"))); // NOI18N
        lblImagenMen.setToolTipText("");

        tblMisTutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMisTutores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMisTutores)
                        .addContainerGap(331, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagenMen, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblMisTutores)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagenMen))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImagenMen;
    private javax.swing.JLabel lblMisTutores;
    private javax.swing.JTable tblMisTutores;
    // End of variables declaration//GEN-END:variables
}
