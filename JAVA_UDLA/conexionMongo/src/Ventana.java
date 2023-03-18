
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

public class Ventana extends javax.swing.JFrame {

    //Conexion conn;
    String texto;

    public Ventana() {
        initComponents();
        //this.conn = conn;
        setResizable(false);
        //tablaClientes();
        //tablaMascotas();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SImagen = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 150));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        SImagen.setText("Subir Imagen");
        SImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SImagenActionPerformed(evt);
            }
        });
        jPanel1.add(SImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SImagen;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
