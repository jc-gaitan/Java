
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;

public class RegistrarMascota extends javax.swing.JDialog {

    Conexion conn;

    public RegistrarMascota(JFrame padre, boolean modal, Conexion conn) {
        super(padre, modal);
        setTitle("Registrar mascota");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(padre);
        this.conn = conn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BGuardar = new javax.swing.JButton();
        BCerrar = new javax.swing.JButton();
        CedulaCli = new javax.swing.JTextField();
        TextPeso = new javax.swing.JTextField();
        TextRaza = new javax.swing.JTextField();
        TextFecha = new javax.swing.JTextField();
        TextSexo = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        BCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TextAlergias1 = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de registro mascota");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("FechaNa:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Raza:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Peso:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("CedulaCliente: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        BCerrar.setText("Cerrar");
        BCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(BCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));
        jPanel1.add(CedulaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 23));
        jPanel1.add(TextPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 23));
        jPanel1.add(TextRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 23));
        jPanel1.add(TextFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, 23));
        jPanel1.add(TextSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, 23));
        jPanel1.add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 23));

        BCancelar.setText("Limpiar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Alergias: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));
        jPanel1.add(TextAlergias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        Connection con = Conexion.getConnection();

        try {
            CallableStatement cs = con.prepareCall("{call insertMascota(?,?,?,?,?,?)}");
            cs.setString(1, TextNombre.getText());
            cs.setString(2, TextSexo.getText());
            cs.setString(3, TextFecha.getText());
            cs.setInt(4, Integer.parseInt(TextPeso.getText()));
            cs.setString(5, TextAlergias1.getText());
            cs.setString(6, TextRaza.getText());
            cs.executeQuery();
            cs.close();
            con.close();
            System.out.println("insert");
            limpiar();
        } catch (SQLException ex) {
            System.out.println("Error: El mensaje no se guardo correctamente. " + ex.getMessage());
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    public void limpiar(){
        TextNombre.setText("");
        TextSexo.setText("");
        TextFecha.setText("");
        TextRaza.setText("");
        TextPeso.setText("");
        CedulaCli.setText("");
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
    private javax.swing.JTextField CedulaCli;
    private javax.swing.JTextField TextAlergias1;
    private javax.swing.JTextField TextFecha;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextPeso;
    private javax.swing.JTextField TextRaza;
    private javax.swing.JTextField TextSexo;
    private javax.swing.JLabel jLabel1;
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
