package vista;

import controlador.Controlador;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import modelo.Maestro;
import persistencia.Singleton;
import tabla.Render;


public class TutoresDisponibles extends javax.swing.JPanel 
{

    DefaultTableModel modelo;
    
    Controlador controlador;
    
    public TutoresDisponibles() 
    {
        try
        {
            initComponents();
        
            controlador = new Controlador(); 
            
            tblTutoresDisponibles.setDefaultRenderer(Object.class, new Render());
            modelo = new DefaultTableModel()
            {
                public boolean isCellEditable(int row, int column)
                {
                return false;
                }
            };
            modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Especialidad",  "Agregar"});
            tblTutoresDisponibles.setModel(modelo);
            tblTutoresDisponibles.setRowHeight(40);
            
            
            consultarMaestrosDisponibles(Singleton.get().getAlumno().getUsuarioID());
            ArrayList<Maestro> maestrosDisponibles = controlador.getMaestrosDisponibles();
            for(int i=0; i<maestrosDisponibles.size(); i++)
            {
                nuevaFila(maestrosDisponibles.get(i).getUsuarioID(), maestrosDisponibles.get(i).getNombre(), 
                        maestrosDisponibles.get(i).getEspecialidad());
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("TutoresDisponibles: Error con TutoresDisponibles()");
        }
        
    }

    
    public void nuevaFila(int ID, String nombre, String especialidad)
    {
        JButton btnAgregar = new JButton("Agregar");

        Object struct[] = {ID, nombre, especialidad, btnAgregar};

        modelo.addRow(struct);
    }
    
    
    public void refrescar()
    {
        int filas = tblTutoresDisponibles.getRowCount();
        
        for(int i=filas-1; i>=0; i--)
        {
            modelo.removeRow(i);
        }
        
        consultarMaestrosDisponibles(Singleton.get().getAlumno().getUsuarioID());
        ArrayList<Maestro> maestrosDisponibles = controlador.getMaestrosDisponibles();
        for(int i=0; i<maestrosDisponibles.size(); i++)
        {
            nuevaFila(maestrosDisponibles.get(i).getUsuarioID(), maestrosDisponibles.get(i).getNombre(), 
                    maestrosDisponibles.get(i).getEspecialidad());
        }
    }
    
    
    
    public void consultarMaestrosDisponibles(int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.consultarMaestrosDisponibles(AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se han consultado los maestros disponibles con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con consultarMaestrosDisponibles");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTutoresDisponibles = new javax.swing.JTable();
        lblTutoresDisponibles = new javax.swing.JLabel();
        lblImagenMorra = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn cerrar_1.PNG"))); // NOI18N

        setBackground(new java.awt.Color(204, 255, 255));

        tblTutoresDisponibles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblTutoresDisponibles.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblTutoresDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTutoresDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTutoresDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTutoresDisponibles);

        lblTutoresDisponibles.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblTutoresDisponibles.setText("Tutores disponibles");

        lblImagenMorra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImagenMorra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aqui_2.PNG"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTutoresDisponibles))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagenMorra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTutoresDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenMorra, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void tblTutoresDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoresDisponiblesMouseClicked
        int column = tblTutoresDisponibles.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tblTutoresDisponibles.getRowHeight();

        if(row < tblTutoresDisponibles.getRowCount() && row >= 0 && column < tblTutoresDisponibles.getColumnCount() && column >= 0)
        {
            Object value = tblTutoresDisponibles.getValueAt(row, column);
            if(value instanceof JButton)
            {
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                insertarTutoria(controlador.getMaestrosDisponibles().get(row).getUsuarioID(), Singleton.get().getAlumno().getUsuarioID());
                
                refrescar();
            }
        }
        
    }//GEN-LAST:event_tblTutoresDisponiblesMouseClicked

    public void insertarTutoria(int MaestroID, int AlumnoID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.insertarTutoria(MaestroID, AlumnoID);
            controlador.cerrarConexion();
            System.out.println("Se ha creado una tutoria con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con insertarTutoria");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImagenMorra;
    private javax.swing.JLabel lblTutoresDisponibles;
    private javax.swing.JTable tblTutoresDisponibles;
    // End of variables declaration//GEN-END:variables
}
