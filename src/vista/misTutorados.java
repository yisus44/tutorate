/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import persistencia.Singleton;
import tabla.Render;

/**
 *
 * @author Sarahí
 */
public class MisTutorados extends javax.swing.JPanel {

    DefaultTableModel modelo;
    Controlador controlador;
    
    public MisTutorados() 
    {
        try
        {
            initComponents();
        
            controlador = new Controlador(); 
            
            tblMisTutorados.setDefaultRenderer(Object.class, new Render());
            modelo = new DefaultTableModel()
            {
                public boolean isCellEditable(int row, int column)
                {
                    return false;
                }
            };
            modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Email", "Edad",  "Eliminar"});
            tblMisTutorados.setModel(modelo);
            tblMisTutorados.setRowHeight(40);
            
            
            consultarTutorados(Singleton.get().getMaestro().getUsuarioID());
            ArrayList<Alumno> alumnos = controlador.getAlumnos();
            
            
            for(int i=0; i<alumnos.size(); i++)
            {
                nuevaFila(alumnos.get(i).getUsuarioID(), alumnos.get(i).getNombre(), alumnos.get(i).getEmail(), alumnos.get(i).getEdad());
            }
        }
        catch(Exception ex)
        {
            System.out.println("MisTutorados: Error con MisTutorados()");
        }
    }
    
    
    public void nuevaFila(int ID, String nombre, String email, int edad)
    {
        JButton btnEliminar = new JButton("Eliminar");

        Object struct[] = {ID, nombre, email, edad, btnEliminar};

        modelo.addRow(struct);
    }
    
    
    public void refrescar()
    {
        int filas = tblMisTutorados.getRowCount();
        
        for(int i=filas-1; i>=0; i--)
        {
            modelo.removeRow(i);
        }
        
        consultarTutorados(Singleton.get().getMaestro().getUsuarioID());
        ArrayList<Alumno> alumnos = controlador.getAlumnos();
            
        for(int i=0; i<alumnos.size(); i++)
        {
            nuevaFila(alumnos.get(i).getUsuarioID(), alumnos.get(i).getNombre(), alumnos.get(i).getEmail(), alumnos.get(i).getEdad());
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
            System.out.println("Vista: Error con consultarTutorados");
        }
    }
    
    
    public void eliminarTutoria(int AlumnoID, int MaestroID)
    {
        try
        {
            controlador.abrirConexion();
            controlador.eliminarTutoria(AlumnoID, MaestroID);
            controlador.cerrarConexion();
            System.out.println("Se ha eliminado una tutoria con exito");
        }
        catch(Exception ex)
        {
            System.out.println("Vista: Error con eliminarTutoria");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMisTutorados = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMisTutorados = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblMisTutorados.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblMisTutorados.setText("Mis tutorados");

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        tblMisTutorados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMisTutorados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMisTutoradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMisTutorados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMisTutorados)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblMisTutorados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void tblMisTutoradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMisTutoradosMouseClicked
        
        int column = tblMisTutorados.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tblMisTutorados.getRowHeight();

        if(row < tblMisTutorados.getRowCount() && row >= 0 && column < tblMisTutorados.getColumnCount() && column >= 0)
        {
            Object value = tblMisTutorados.getValueAt(row, column);
            if(value instanceof JButton)
            {
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                modelo.removeRow(row);
                
                eliminarTutoria(controlador.getAlumnos().get(row).getUsuarioID(), Singleton.get().getMaestro().getUsuarioID());
            }
        }
    }//GEN-LAST:event_tblMisTutoradosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMisTutorados;
    private javax.swing.JTable tblMisTutorados;
    // End of variables declaration//GEN-END:variables
}
