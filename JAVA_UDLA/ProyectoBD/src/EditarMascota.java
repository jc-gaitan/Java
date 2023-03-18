
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class EditarMascota extends javax.swing.JDialog {

    Conexion conn;

    public EditarMascota(JFrame padre, boolean modal, Conexion conn) {
        super(padre, modal);
        setTitle("datos mascota");
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        BGuardar1 = new javax.swing.JButton();
        BCancelar1 = new javax.swing.JButton();
        TextCc1 = new javax.swing.JTextField();
        TextTelefono3 = new javax.swing.JTextField();
        TextTelefono4 = new javax.swing.JTextField();
        TextDireccion1 = new javax.swing.JTextField();
        TextBarrio1 = new javax.swing.JTextField();
        TextEmail1 = new javax.swing.JTextField();
        TextApellido3 = new javax.swing.JTextField();
        TextApellido4 = new javax.swing.JTextField();
        TextNombre3 = new javax.swing.JTextField();
        TextNombre4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        BCancelar2 = new javax.swing.JButton();
        TextCc2 = new javax.swing.JTextField();
        TextTelefono5 = new javax.swing.JTextField();
        TextTelefono6 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        N2 = new javax.swing.JTextField();
        N1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonBucasr = new javax.swing.JButton();
        EN1 = new javax.swing.JButton();
        EN2 = new javax.swing.JButton();
        EA1 = new javax.swing.JButton();
        EA2 = new javax.swing.JButton();
        ET1 = new javax.swing.JButton();
        ET2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JTextField();
        BuscarEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de registro cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Formulario de registro cliente");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("CC:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Nombre1:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Nombre2:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Apellido1:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Apellido2: ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Telefono1: ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Telefono2: ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Direccion:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Barrio:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Email:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, -1, -1));

        BGuardar1.setText("Guardar");
        BGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        BCancelar1.setText("Cancelar");
        BCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));
        jPanel2.add(TextCc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 23));
        jPanel2.add(TextTelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 23));
        jPanel2.add(TextTelefono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 23));
        jPanel2.add(TextDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, 23));
        jPanel2.add(TextBarrio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, 23));
        jPanel2.add(TextEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 140, 23));
        jPanel2.add(TextApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 23));
        jPanel2.add(TextApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, 23));
        jPanel2.add(TextNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, 23));
        jPanel2.add(TextNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 23));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Editar de registro mascota");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Ingrese el  id de la mascota que desea modificar: ");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Nombre:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Sexo:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("FechaNa:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Raza:");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Peso:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Alergias: ");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        BCancelar2.setText("Cancelar");
        BCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelar2ActionPerformed(evt);
            }
        });
        jPanel3.add(BCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 160, -1));

        TextCc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCc2ActionPerformed(evt);
            }
        });
        jPanel3.add(TextCc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 160, 23));
        jPanel3.add(TextTelefono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 140, 23));
        jPanel3.add(TextTelefono6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 140, 23));
        jPanel3.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 140, 23));
        jPanel3.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 140, 23));
        jPanel3.add(N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, 23));
        jPanel3.add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 140, 23));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 100));

        jButtonBucasr.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonBucasr.setText("Buscar");
        jButtonBucasr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBucasrActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBucasr, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        EN1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        EN1.setText("Editar");
        EN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EN1ActionPerformed(evt);
            }
        });
        jPanel3.add(EN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        EN2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        EN2.setText("Editar");
        EN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EN2ActionPerformed(evt);
            }
        });
        jPanel3.add(EN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        EA1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        EA1.setText("Editar");
        EA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EA1ActionPerformed(evt);
            }
        });
        jPanel3.add(EA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        EA2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        EA2.setText("Editar");
        EA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EA2ActionPerformed(evt);
            }
        });
        jPanel3.add(EA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        ET1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        ET1.setText("Editar");
        ET1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ET1ActionPerformed(evt);
            }
        });
        jPanel3.add(ET1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        ET2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        ET2.setText("Editar");
        ET2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ET2ActionPerformed(evt);
            }
        });
        jPanel3.add(ET2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Ingrese el id de la mascota que desea eliminar:");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 20));

        BuscarEliminar.setText("Buscar");
        BuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(BuscarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 90, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 320, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 340, 210));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Eliminar registro");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed

    }//GEN-LAST:event_BGuardarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_BCancelarActionPerformed

    public void limpiar() {
        jTextArea1.setText("");
    }

    private void BGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardar1ActionPerformed
        try {
            Connection con = conn.getConnection();
            CallableStatement cs = con.prepareCall("{call insertCliente(?,?,?,?,?,?,?,?,?,?)}");
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
            con.close();
            System.out.println("guardado correctamente.");
            JOptionPane.showMessageDialog(null, "Cliente almacenado");
        } catch (SQLException ex) {
            System.out.println("Error: El mensaje no se guardo correctamente. " + ex.getMessage());
        }

        limpiar();
    }//GEN-LAST:event_BGuardar1ActionPerformed

    private void BCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_BCancelar1ActionPerformed

    private void BCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelar2ActionPerformed
        limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_BCancelar2ActionPerformed

    private void EN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EN1ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call UpdateClienteNombre(?,?)}");
            cs.setLong(1, Long.parseLong(TextCc2.getText()));
            cs.setString(2, N1.getText());
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("update.");
            JOptionPane.showMessageDialog(null, "Datos clientes actualizado");
            N1.setText("");
            TextCc2.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no update. " + ex.getMessage());
        }
    }//GEN-LAST:event_EN1ActionPerformed

    private void EN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EN2ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call UpdateClienteNombre2(?,?)}");
            cs.setLong(1, Long.parseLong(TextCc2.getText()));
            cs.setString(2, N2.getText());
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("update.");
            JOptionPane.showMessageDialog(null, "Datos clientes actualizado");
            N2.setText("");
            TextCc2.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no update. " + ex.getMessage());
        }
    }//GEN-LAST:event_EN2ActionPerformed

    private void EA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EA1ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call UpdateClienteApellido(?,?)}");
            cs.setLong(1, Long.parseLong(TextCc2.getText()));
            cs.setString(2, A1.getText());
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("update.");
            JOptionPane.showMessageDialog(null, "Datos clientes actualizado");
            A1.setText("");
            TextCc2.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no update. " + ex.getMessage());
        }
    }//GEN-LAST:event_EA1ActionPerformed

    private void EA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EA2ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call UpdateClienteApellido2(?,?)}");
            cs.setLong(1, Long.parseLong(TextCc2.getText()));
            cs.setString(2, A2.getText());
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("update.");
            JOptionPane.showMessageDialog(null, "Datos clientes actualizado");
            A2.setText("");
            TextCc2.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no update. " + ex.getMessage());
        }
    }//GEN-LAST:event_EA2ActionPerformed

    private void ET1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ET1ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call UpdateClienteTelefono1(?,?)}");
            cs.setLong(1, Long.parseLong(TextCc2.getText()));
            cs.setLong(2, Long.parseLong(TextTelefono6.getText()));
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("update.");
            JOptionPane.showMessageDialog(null, "Datos clientes actualizado");
            TextTelefono6.setText("");
            TextCc2.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no update. " + ex.getMessage());
        }
    }//GEN-LAST:event_ET1ActionPerformed

    private void ET2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ET2ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call UpdateClienteTelefono2(?,?)}");
            cs.setLong(1, Long.parseLong(TextCc2.getText()));
            cs.setLong(2, Long.parseLong(TextTelefono5.getText()));
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("update.");
            JOptionPane.showMessageDialog(null, "Datos clientes actualizado");
            TextTelefono5.setText("");
            TextCc2.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no update. " + ex.getMessage());
        }
    }//GEN-LAST:event_ET2ActionPerformed

    private void jButtonBucasrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBucasrActionPerformed
        try {
            Connection con = conn.getConnection();
            CallableStatement cs = con.prepareCall("{call BuscarMascota.sp_sMascotas(?,?)}");
            cs.setInt(1, Integer.parseInt(TextCc2.getText()));
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet) cs.getObject(2);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
                jTextArea1.setText("  Id: " + rs.getString(1) + "\n  Nombre: " + rs.getString(2) + "\n  Sexo: " + rs.getString(3)
                                    + "\n  FechaNa: " + rs.getString(4) + "\n  Raza: " + rs.getString(5) + "\n  Peso: " + rs.getString(6)
                                    + "\n  Alergias: " + rs.getString(7));
            }
        } catch (SQLException ex) {
            System.out.println("Error: El mensaje no se guardo correctamente. " + ex.getMessage());
        }

    }//GEN-LAST:event_jButtonBucasrActionPerformed

    private void TextCc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCc2ActionPerformed

    private void BuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEliminarActionPerformed
        try {
            Connection con = conn.getConnection();
            CallableStatement cs = con.prepareCall("{call BuscarCliente.sp_sClientes(?,?)}");
            cs.setInt(1, Integer.parseInt(Eliminar.getText()));
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet) cs.getObject(2);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
                jTextArea2.setText("  Cedula: " + rs.getString(1) + "\n  Nombre: " + rs.getString(2) + "\n  Apellido: " + rs.getString(3)
                                    + "\n  Telefono: " + rs.getString(4) + "\n  Email: " + rs.getString(5) + "\n  Direccion: " + rs.getString(6)
                                    + "\n  Barrio: " + rs.getString(7));
            }
        } catch (SQLException ex) {
            System.out.println("Error: El mensaje no se guardo correctamente. " + ex.getMessage());
        }
    }//GEN-LAST:event_BuscarEliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection conn = Conexion.getConnection();
        try {
            CallableStatement cs = conn.prepareCall("{call deleteCliente(?)}");
            cs.setLong(1, Long.parseLong(Eliminar.getText()));
            cs.executeQuery();
            cs.close();
            conn.close();
            System.out.println("delete.");
            JOptionPane.showMessageDialog(null, "Datos clientes eliminados");
            Eliminar.setText("");
            jTextArea2.setText("");
        } catch (SQLException ex) {
            System.out.println("Error: no delete. " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /*public static void main(String args[]) {

     java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     asd dialog = new asd(new javax.swing.JFrame(), true);
     dialog.addWindowListener(new java.awt.event.WindowAdapter() {
     @Override
     public void windowClosing(java.awt.event.WindowEvent e) {
     System.exit(0);
     }
     });
     dialog.setVisible(true);
     }
     });
     }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BCancelar1;
    private javax.swing.JButton BCancelar2;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BGuardar1;
    private javax.swing.JButton BuscarEliminar;
    private javax.swing.JButton EA1;
    private javax.swing.JButton EA2;
    private javax.swing.JButton EN1;
    private javax.swing.JButton EN2;
    private javax.swing.JButton ET1;
    private javax.swing.JButton ET2;
    private javax.swing.JTextField Eliminar;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JTextField TextApellido1;
    private javax.swing.JTextField TextApellido2;
    private javax.swing.JTextField TextApellido3;
    private javax.swing.JTextField TextApellido4;
    private javax.swing.JTextField TextBarrio;
    private javax.swing.JTextField TextBarrio1;
    private javax.swing.JTextField TextCc;
    private javax.swing.JTextField TextCc1;
    private javax.swing.JTextField TextCc2;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextDireccion1;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextEmail1;
    private javax.swing.JTextField TextNombre1;
    private javax.swing.JTextField TextNombre2;
    private javax.swing.JTextField TextNombre3;
    private javax.swing.JTextField TextNombre4;
    private javax.swing.JTextField TextTelefono1;
    private javax.swing.JTextField TextTelefono2;
    private javax.swing.JTextField TextTelefono3;
    private javax.swing.JTextField TextTelefono4;
    private javax.swing.JTextField TextTelefono5;
    private javax.swing.JTextField TextTelefono6;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBucasr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
