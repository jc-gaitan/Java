
import com.mongodb.*;
import com.mongodb.gridfs.*;
import java.io.*;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Recepcionista extends javax.swing.JFrame {

    Conexion conn;
    String texto;

    public Recepcionista(Conexion conn) {
        initComponents();
        this.conn = conn;
        setResizable(false);
        tablaClientes();
        tablaMascotas();
        setLocationRelativeTo(null);
    }

    public void tablaClientes() {
        //Para establecer el modelo al JTable
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
        this.jTable1.setEnabled(false);
        //Para ejecutar la consulta
        Statement s;
        try {
            Connection con = conn.getConnection();
            s = con.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
            ResultSet rs = s.executeQuery("select * from vista_clientes");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Recepcionista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tablaMascotas() {
        //Para establecer el modelo al JTable
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable2.setModel(modelo);
        this.jTable2.setEnabled(false);
        //Para ejecutar la consulta
        Statement s;
        try {
            Connection con = conn.getConnection();
            s = con.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
            ResultSet rs = s.executeQuery("select * from vista_mascotas");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Recepcionista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonAgregarCliente = new javax.swing.JButton();
        jButtonEditarcliente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonEditarmascota = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        SImagen = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 150));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 690, 190));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Mascotas");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jButtonAgregarCliente.setText("Agregar Cliente");
        jButtonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 180, 30));

        jButtonEditarcliente.setText("Editar y eliminar cliente");
        jButtonEditarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarclienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 180, 30));

        jButton3.setText("Agregar Mascota");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 140, 30));

        jButtonEditarmascota.setText("Editar y eliminar Mascota");
        jButtonEditarmascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarmascotaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditarmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 170, 30));

        jButton1.setText("Agendar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 180, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("Clientes");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 690, 220));

        SImagen.setText("Subir Imagen");
        SImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SImagenActionPerformed(evt);
            }
        });
        jPanel1.add(SImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarClienteActionPerformed
        RegistrarCliente a = new RegistrarCliente(this, true, conn);
        a.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarClienteActionPerformed

    private void jButtonEditarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarclienteActionPerformed
        EditarCliente a = new EditarCliente(this, true, conn);
        a.setVisible(true);
    }//GEN-LAST:event_jButtonEditarclienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegistrarMascota a = new RegistrarMascota(this, true, conn);
        a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonEditarmascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarmascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarmascotaActionPerformed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        tablaClientes();
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        tablaMascotas();
    }//GEN-LAST:event_jLabel2MouseReleased

    private void SImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SImagenActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_SImagenActionPerformed

    private String abrirArchivo() {
        ConexionMongo conexionMongo = new ConexionMongo();

        JFileChooser file = new JFileChooser();
        file.showOpenDialog(this);
        File abre = file.getSelectedFile();
        String ubi = file.getCurrentDirectory()+""+file.getSelectedFile().getName();
        System.out.println(ubi);
        conexionMongo.Mon(ubi, "asd");
        ImageIcon Gran = new ImageIcon((Image)conexionMongo.decodeToImage(conexionMongo.ConsultarImagen("asd")));
        Gran = new ImageIcon(Gran.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        jLabelFoto.setIcon(Gran);
        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgregarCliente;
    private javax.swing.JButton jButtonEditarcliente;
    private javax.swing.JButton jButtonEditarmascota;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
