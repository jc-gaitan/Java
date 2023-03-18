
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;

public class RegistrarCliente extends javax.swing.JDialog {

    Conexion conn;

    public RegistrarCliente(JFrame padre, boolean modal, Conexion conn) {
        super(padre, modal);
        setTitle("Registrar cliente");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(padre);
        this.conn = conn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        BCerrar = new javax.swing.JButton();
        TextCc = new javax.swing.JTextField();
        TextTelefono2 = new javax.swing.JTextField();
        TextTelefono1 = new javax.swing.JTextField();
        TextDireccion = new javax.swing.JTextField();
        TextBarrio = new javax.swing.JTextField();
        Idmascota = new javax.swing.JTextField();
        TextApellido2 = new javax.swing.JTextField();
        TextApellido1 = new javax.swing.JTextField();
        TextNombre2 = new javax.swing.JTextField();
        TextNombre1 = new javax.swing.JTextField();
        BCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TextEmail1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jLabel11.setText("IdMascota: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        BCerrar.setText("Cerrar");
        BCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(BCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));
        jPanel1.add(TextCc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 23));
        jPanel1.add(TextTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 23));
        jPanel1.add(TextTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 23));
        jPanel1.add(TextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, 23));
        jPanel1.add(TextBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, 23));
        jPanel1.add(Idmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 140, 23));
        jPanel1.add(TextApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 23));
        jPanel1.add(TextApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, 23));
        jPanel1.add(TextNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, 23));
        jPanel1.add(TextNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 23));

        BCancelar.setText("Limpiar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Email:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, -1, -1));
        jPanel1.add(TextEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 140, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        Connection con = Conexion.getConnection();
        TextTelefono2.setText("");
        try {
            CallableStatement cs = con.prepareCall("{call insertCliente(?,?,?,?,?,?,?,?,?,?)}");
            cs.setLong(1, Long.parseLong(TextCc.getText()));
            cs.setString(2, TextNombre1.getText());
            cs.setString(3, TextNombre2.getText());
            cs.setString(4, TextApellido1.getText());
            cs.setString(5, TextApellido2.getText());
            cs.setLong(6, Long.parseLong(TextTelefono1.getText()));
            if(!TextTelefono2.getText().equals("")){
                cs.setLong(7, Long.parseLong(TextTelefono2.getText()));
            }else{
                cs.setLong(7, 0);
            }
            cs.setString(8, TextDireccion.getText());
            cs.setString(9, TextBarrio.getText());
            cs.setString(10, TextEmail1.getText());
            cs.executeQuery();
            cs.close();
            con.close();
            System.out.println("Mensaje guardado correctamente.");
            limpiar();
        } catch (SQLException ex) {
            System.out.println("Error: El mensaje no se guardo correctamente. " + ex.getMessage());
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    public void limpiar(){
        TextCc.setText("");
        TextNombre1.setText("");
        TextNombre2.setText("");
        TextApellido1.setText("");
        TextApellido2.setText("");
        TextTelefono1.setText("");
        TextTelefono2.setText("");
        TextBarrio.setText("");
        TextDireccion.setText("");
        Idmascota.setText("");
    }
    
    private void BCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BCerrarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_BCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BCerrar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JTextField Idmascota;
    private javax.swing.JTextField TextApellido1;
    private javax.swing.JTextField TextApellido2;
    private javax.swing.JTextField TextBarrio;
    private javax.swing.JTextField TextCc;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextEmail1;
    private javax.swing.JTextField TextNombre1;
    private javax.swing.JTextField TextNombre2;
    private javax.swing.JTextField TextTelefono1;
    private javax.swing.JTextField TextTelefono2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
