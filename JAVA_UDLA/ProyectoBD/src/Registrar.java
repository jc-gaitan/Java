
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

public class Registrar extends javax.swing.JFrame {

    Connection conn;
    
    public Registrar(Connection conn) {
        initComponents();
        this.conn = conn;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BGuardar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        TextCc = new javax.swing.JTextField();
        TextTelefono2 = new javax.swing.JTextField();
        TextTelefono1 = new javax.swing.JTextField();
        TextDireccion = new javax.swing.JTextField();
        TextBarrio = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextApellido2 = new javax.swing.JTextField();
        TextApellido1 = new javax.swing.JTextField();
        TextNombre2 = new javax.swing.JTextField();
        TextNombre1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bconsultarclientes = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de registro cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("CC:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nombre1:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Nombre2:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Apellido1:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Apellido2: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Telefono1: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Telefono2: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Direccion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Barrio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, -1, -1));

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));
        jPanel1.add(TextCc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 23));
        jPanel1.add(TextTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 23));
        jPanel1.add(TextTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 23));
        jPanel1.add(TextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, 23));
        jPanel1.add(TextBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, 23));
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 140, 23));
        jPanel1.add(TextApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 23));
        jPanel1.add(TextApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, 23));
        jPanel1.add(TextNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, 23));
        jPanel1.add(TextNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 23));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setViewportView(jTable1);

        Bconsultarclientes.setText("Consultar Clientes");
        Bconsultarclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconsultarclientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Bconsultarclientes)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Bconsultarclientes)
                .addGap(204, 204, 204))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 450, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        //EnviarDatos a = new EnviarDatos();
        Connection conn = Conexion.getConnection();
        /*System.out.println(a.Insert(conn, new Cliente(Integer.parseInt(TextCc.getText()), TextNombre1.getText(), TextNombre2.getText(), TextApellido1.getText(), TextApellido2.getText(), Integer.parseInt(TextTelefono1.getText()), Integer.parseInt(TextTelefono2.getText()), TextDireccion.getText(), TextBarrio.getText(), TextEmail.getText())));
         try {
         if (conn != null) {
         conn.close();
         }
         } catch (Exception e) {
         }*/

        try {
            CallableStatement cs = conn.prepareCall("{call insertCliente(?,?,?,?,?,?,?,?,?,?)}");
            cs.setLong(1, Long.parseLong(TextCc.getText()));
            cs.setString(2, TextNombre1.getText());
            cs.setString(3, TextNombre2.getText());
            cs.setString(4, TextApellido1.getText());
            cs.setString(5, TextApellido2.getText());
            cs.setLong(6, Long.parseLong(TextTelefono1.getText()));
            cs.setLong(7, Long.parseLong(TextTelefono2.getText()));
            cs.setString(8, TextDireccion.getText());
            cs.setString(9, TextBarrio.getText());
            cs.setString(10, TextEmail.getText());
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("Mensaje guardado correctamente.");
        } catch (SQLException ex) {
            System.out.println("Error: El mensaje no se guardo correctamente. " + ex.getMessage());
        }
        TextCc.setText("");
        TextNombre1.setText("");
        TextNombre2.setText("");
        TextApellido1.setText("");
        TextApellido2.setText("");
        TextTelefono1.setText("");
        TextTelefono2.setText("");
        TextBarrio.setText("");
        TextDireccion.setText("");
        TextEmail.setText("");
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        TextCc.setText("");
        TextNombre1.setText("");
        TextNombre2.setText("");
        TextApellido1.setText("");
        TextApellido2.setText("");
        TextTelefono1.setText("");
        TextTelefono2.setText("");
        TextBarrio.setText("");
        TextDireccion.setText("");
        TextEmail.setText("");
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BconsultarclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconsultarclientesActionPerformed
        try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            //Connection conn = Conexion.getConnection();
            //Para ejecutar la consulta
            Statement s = conn.createStatement();
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
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_BconsultarclientesActionPerformed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton Bconsultarclientes;
    private javax.swing.JTextField TextApellido1;
    private javax.swing.JTextField TextApellido2;
    private javax.swing.JTextField TextBarrio;
    private javax.swing.JTextField TextCc;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNombre1;
    private javax.swing.JTextField TextNombre2;
    private javax.swing.JTextField TextTelefono1;
    private javax.swing.JTextField TextTelefono2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
