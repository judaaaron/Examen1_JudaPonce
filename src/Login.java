
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    ArrayList<Alumnos> students = new ArrayList();
    Alumnos seleccionado;

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGIIN = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tf_user1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_password1 = new javax.swing.JPasswordField();
        bt_iniciar1 = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        MenuStudents = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bt_Editar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fondoStudents = new javax.swing.JLabel();
        listarAlumnos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        Cb_Alumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabi = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RegistroAlumnos = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        tf_edad1 = new javax.swing.JTextField();
        tf_carrera1 = new javax.swing.JTextField();
        tf_lugar1 = new javax.swing.JTextField();
        tf_numeroCuenta1 = new javax.swing.JTextField();
        tf_usuario1 = new javax.swing.JTextField();
        cb_tipoAlumno1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        bt_registrar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cb_crearAlumno = new javax.swing.JButton();
        cb_login = new javax.swing.JButton();
        cb_crearExamen = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        LOGIIN.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setText("Iniciar Sesion");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 30));
        jPanel2.add(tf_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, 30));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setText("Contraseña");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, 30));
        jPanel2.add(tf_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 110, 30));

        bt_iniciar1.setBackground(new java.awt.Color(51, 255, 51));
        bt_iniciar1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt_iniciar1.setText("Iniciar Sesion");
        jPanel2.add(bt_iniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 70));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iamges/iniciar-sesion (1).png"))); // NOI18N
        jPanel2.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 510, 540));

        LOGIIN.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuStudents.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido estudiante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 50));

        bt_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iamges/editar (1).png"))); // NOI18N
        jPanel1.add(bt_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 50, 60));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar Datos del alumno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 40));

        fondoStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iamges/white2.png"))); // NOI18N
        jPanel1.add(fondoStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        MenuStudents.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        listarAlumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cb_Alumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cb_AlumnosItemStateChanged(evt);
            }
        });
        Cb_Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_AlumnosActionPerformed(evt);
            }
        });
        jPanel3.add(Cb_Alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 120, 40));

        tabi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Carrera", "Lugar de nacimiento", "Numero de cuenta", "Usuario", "Contraseña", "Conocimiento acumulado", "Nivel de aprendizaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabi);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 820, 210));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de Alumnos");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iamges/white2.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 610));

        listarAlumnos.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RegistroAlumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Usuario");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 90, 40));

        jLabel14.setText("Numero de cuenta");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 120, 40));

        jLabel15.setText("Lugar de nacimiento");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 140, 40));

        jLabel16.setText("Edad");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 90, 40));

        jLabel17.setText("Carrera");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 40));

        jLabel18.setText("Contraseña");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 90, 40));

        jLabel19.setText("Nombre");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, 40));
        jPanel5.add(tf_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, 30));
        jPanel5.add(tf_edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 120, 30));
        jPanel5.add(tf_carrera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 120, 30));
        jPanel5.add(tf_lugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 120, 30));
        jPanel5.add(tf_numeroCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 120, 30));
        jPanel5.add(tf_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 120, 30));

        cb_tipoAlumno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tutores", "Estudiantes normales" }));
        cb_tipoAlumno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_tipoAlumno1MouseClicked(evt);
            }
        });
        cb_tipoAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoAlumno1ActionPerformed(evt);
            }
        });
        jPanel5.add(cb_tipoAlumno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 110, 40));

        jLabel1.setText("Tipo de alumno");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 100, 40));
        jPanel5.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 120, 30));

        bt_registrar.setText("Registrarse");
        bt_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarMouseClicked(evt);
            }
        });
        jPanel5.add(bt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 130, 40));
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 690));

        RegistroAlumnos.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_crearAlumno.setBackground(new java.awt.Color(0, 0, 255));
        cb_crearAlumno.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        cb_crearAlumno.setText("Crear alumno");
        cb_crearAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_crearAlumnoMouseClicked(evt);
            }
        });
        getContentPane().add(cb_crearAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 40));

        cb_login.setBackground(new java.awt.Color(255, 0, 0));
        cb_login.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        cb_login.setText("Login");
        cb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_loginMouseClicked(evt);
            }
        });
        getContentPane().add(cb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 120, 40));

        cb_crearExamen.setBackground(new java.awt.Color(255, 255, 0));
        cb_crearExamen.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        cb_crearExamen.setText("Crear Examen");
        getContentPane().add(cb_crearExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 150, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iamges/menu.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_tipoAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoAlumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoAlumno1ActionPerformed

    private void cb_tipoAlumno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_tipoAlumno1MouseClicked

    }//GEN-LAST:event_cb_tipoAlumno1MouseClicked

    private void bt_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarMouseClicked
        // TODO add your handling code here:

        String name = tf_nombre1.getText();
        String edad = tf_edad1.getText();
        String carrera = tf_carrera1.getText();
        String lugar = tf_lugar1.getText();
        String numero = tf_numeroCuenta1.getText();
        String usuario = tf_usuario1.getText();
        String password = tf_password.getText();
        if (cb_tipoAlumno1.getSelectedItem().toString().equals("Tutores")) {
            int ense = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese nivel de enseñanza del tutor"));

            students.add(new tutores(0, 0, ense, name, carrera, lugar, usuario, password, numero, edad));
            Alumnos L = new tutores(0, 0, ense, name, carrera, lugar, usuario, password, numero, edad);
            students.add(L);

            //DefaultComboBoxModel st = (DefaultComboBoxModel) Cb_tutores.getModel();
            //st.addElement(L);
            //Cb_tutores.setModel(st);
            JOptionPane.showMessageDialog(this, " Tutor creado con exito");

        } else {
            int opi = Integer.parseInt(JOptionPane.showInputDialog(" Seleccione que tipo de estudiante es, \n"
                    + " 1. Ingenieros,\n"
                    + " 2. Licenciados,\n"
                    + " 3. Medicos"));
            switch (opi) {
                case 1:
                    int apren = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese nivel de aprendizaje del estudiante ingeniero"));
                    students.add(new Ingenieros(0, 0, 0, apren, name, carrera, lugar, usuario, password, numero, edad));

                    Alumnos L = new Ingenieros(0, 0, 0, apren, name, carrera, lugar, usuario, password, numero, edad);
                    students.add(L);
                    DefaultComboBoxModel st = (DefaultComboBoxModel) Cb_Alumnos.getModel();

                    st.addElement(L);
                    Cb_Alumnos.setModel(st);
                    JOptionPane.showMessageDialog(this, " Alumno ingeniero creado con exito");

                    tf_nombre1.setText("");
                    tf_edad1.setText("");
                    tf_carrera1.setText("");
                    tf_lugar1.setText("");
                    tf_numeroCuenta1.setText("");
                    tf_usuario1.setText("");
                    tf_password.setText("");

                    break;

                case 2:
                    int aprend = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese nivel de aprendizaje del estudiante licenciado"));
                    students.add(new Licenciados(0, 0, aprend, name, carrera, lugar, usuario, password, numero, edad));

                    L = new Licenciados(0, 0, aprend, name, carrera, lugar, usuario, password, numero, edad);
                    students.add(L);

                    DefaultComboBoxModel sd = (DefaultComboBoxModel) Cb_Alumnos.getModel();
                    sd.addElement(L);
                    Cb_Alumnos.setModel(sd);

                    JOptionPane.showMessageDialog(this, " Alumno licenciado creado con exito");

                    tf_nombre1.setText("");
                    tf_edad1.setText("");
                    tf_carrera1.setText("");
                    tf_lugar1.setText("");
                    tf_numeroCuenta1.setText("");
                    tf_usuario1.setText("");
                    tf_password.setText("");

                    break;

                case 3:
                    int apre = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese nivel de aprendizaje del estudiante medico"));
                    students.add(new Medicos(0, 0, 0, apre, name, carrera, lugar, usuario, password, numero, edad));

                    L = new Medicos(0, 0, 0, apre, name, carrera, lugar, usuario, password, numero, edad);
                    students.add(L);

                    DefaultComboBoxModel sp = (DefaultComboBoxModel) Cb_Alumnos.getModel();
                    sp.addElement(L);
                    Cb_Alumnos.setModel(sp);

                    tf_nombre1.setText("");
                    tf_edad1.setText("");
                    tf_carrera1.setText("");
                    tf_lugar1.setText("");
                    tf_numeroCuenta1.setText("");
                    tf_usuario1.setText("");
                    tf_password.setText("");

                    JOptionPane.showMessageDialog(this, " Alumno medico creado con exito");

                    break;
                default:
                    JOptionPane.showMessageDialog(this, " Opcion Incorrecta");
            }

        }


    }//GEN-LAST:event_bt_registrarMouseClicked

    private void Cb_AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_AlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_AlumnosActionPerformed

    private void Cb_AlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cb_AlumnosItemStateChanged
        if (evt.getStateChange() == 2) {
            EstudiantesNormales s = (EstudiantesNormales) Cb_Alumnos.getSelectedItem();
            Object[] newrow = {
                s, s.getNombre(), s.getEdad(), s.getCarrera(), s.getLugar(), s.getCuenta(), s.getUsuario(), s.getPassword(), s.getConocimiento(), s.getAprendizaje()
            };

            DefaultTableModel modelo = (DefaultTableModel) tabi.getModel();
            modelo.addRow(newrow);
            tabi.setModel(modelo);
        }

    }//GEN-LAST:event_Cb_AlumnosItemStateChanged

    private void cb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_loginMouseClicked

    private void cb_crearAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_crearAlumnoMouseClicked
        RegistroAlumnos.pack();
        RegistroAlumnos.setModal(true);
        RegistroAlumnos.setLocationRelativeTo(this);
        RegistroAlumnos.setVisible(true);

    }//GEN-LAST:event_cb_crearAlumnoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_Alumnos;
    private javax.swing.JDialog LOGIIN;
    private javax.swing.JDialog MenuStudents;
    private javax.swing.JDialog RegistroAlumnos;
    private javax.swing.JButton bt_Editar;
    private javax.swing.JButton bt_iniciar1;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton cb_crearAlumno;
    private javax.swing.JButton cb_crearExamen;
    private javax.swing.JButton cb_login;
    private javax.swing.JComboBox<String> cb_tipoAlumno1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondoStudents;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog listarAlumnos;
    private javax.swing.JTable tabi;
    private javax.swing.JTextField tf_carrera1;
    private javax.swing.JTextField tf_edad1;
    private javax.swing.JTextField tf_lugar1;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_numeroCuenta1;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JPasswordField tf_password1;
    private javax.swing.JTextField tf_user1;
    private javax.swing.JTextField tf_usuario1;
    // End of variables declaration//GEN-END:variables

}
