/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Calculo;
import Modelo.Numero;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class Form_Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Form_Ventana
     */
    public Form_Ventana() {
        initComponents();
        this.jrbtn_otro.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_num1 = new javax.swing.JTextField();
        jtxt_num2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtn_calcular = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbl_mensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jrbtn_femenino = new javax.swing.JRadioButton();
        jrbtn_masculino = new javax.swing.JRadioButton();
        jrbtn_otro = new javax.swing.JRadioButton();
        jchkb_futbol = new javax.swing.JCheckBox();
        jchkb_voley = new javax.swing.JCheckBox();
        jchkb_ciclismo = new javax.swing.JCheckBox();
        jcb_operaciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Primera Ventana");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos"));

        jLabel3.setText("Número 1:");

        jLabel4.setText("Número 2:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jbtn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        jbtn_calcular.setText("Calcular");
        jbtn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_calcularActionPerformed(evt);
            }
        });

        jbtn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escoba.png"))); // NOI18N
        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jbtn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_calcular)
                    .addComponent(jbtn_limpiar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mi primera Ventana");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbl_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/duke2.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        buttonGroup1.add(jrbtn_femenino);
        jrbtn_femenino.setText("Femenino");

        buttonGroup1.add(jrbtn_masculino);
        jrbtn_masculino.setText("Masculino");
        jrbtn_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtn_masculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtn_otro);
        jrbtn_otro.setText("Otro");

        jchkb_futbol.setText("Futbol");

        jchkb_voley.setText("Voleyball");
        jchkb_voley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkb_voleyActionPerformed(evt);
            }
        });

        jchkb_ciclismo.setText("Ciclismo");

        jcb_operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Sumar", "Restar", "Multiplicar", "Dividir" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtn_femenino)
                    .addComponent(jrbtn_masculino)
                    .addComponent(jrbtn_otro))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchkb_ciclismo)
                    .addComponent(jchkb_voley)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jchkb_futbol)
                        .addGap(76, 76, 76)
                        .addComponent(jcb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtn_femenino)
                    .addComponent(jchkb_futbol)
                    .addComponent(jcb_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtn_masculino)
                    .addComponent(jchkb_voley))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtn_otro)
                    .addComponent(jchkb_ciclismo))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_calcularActionPerformed

        Calculo cal = new Calculo();
        String mensaje = "";
        int num1 = 0;
        int num2 = 0;
                
        //rescatar los datos del formulario
        
        try {
            num1 = Integer.parseInt(this.jtxt_num1.getText());
            num2 = Integer.parseInt(this.jtxt_num2.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de ingreso", "Validación",0);
            this.jtxt_num1.setBackground(Color.red);
            this.jtxt_num2.setBackground(Color.red);
            this.jtxt_num1.requestFocus();
           
        }
        
       Numero num = new Numero(num1, num2);
        

        int suma = cal.sumar(num);
        String sumaStr = String.valueOf(suma);

        int restar = cal.restar(num);
        String restarStr = String.valueOf(restar);

        int multi = cal.multi(num);
        String multiStr = String.valueOf(multi);

        double dividir = cal.dividir(num);
        String dividirStr = String.valueOf(dividir);

        if (this.jcb_operaciones.getSelectedIndex() == 1) {
            mensaje = "La suma de los números es: " + sumaStr;
        } else {
            if (this.jcb_operaciones.getSelectedIndex() == 2) {
                mensaje = "La resta de los números es: " + restarStr;
            } else {
                if (this.jcb_operaciones.getSelectedIndex() == 3) {
                    mensaje = "La multiplicación de los números es: " + multiStr;
                } else {
                    if (this.jcb_operaciones.getSelectedIndex() == 4) {
                        mensaje = "La división de los números es: " + dividirStr;

                    }
                }
            }
        }

        // ahora los radiobutton
        if (this.jrbtn_femenino.isSelected()) {
            mensaje = mensaje + " y es de sexo femenino";
        } else {
            if (this.jrbtn_masculino.isSelected()) {
                mensaje = mensaje + " y es de sexo masculino";
            } else {
                mensaje = mensaje + " y es de sexo otro";
            }
        }

        // ahora los checkbox
        
        if (this.jchkb_futbol.isSelected()==false && this.jchkb_voley.isSelected()==false && this.jchkb_ciclismo.isSelected()==false) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar alguno de los deportes","Aviso",1);
        }
        
        
        
        if (this.jchkb_futbol.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el fútbol");
        } 
        if (this.jchkb_voley.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el voley");
        } 
        if (this.jchkb_ciclismo.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el ciclismo");
        }
        if (this.jchkb_futbol.isSelected() && this.jchkb_voley.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el fútbol y voley");
        } 
        if (this.jchkb_futbol.isSelected() && this.jchkb_ciclismo.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el fútbol y ciclismo");
        }
                        
        if (this.jchkb_voley.isSelected() && this.jchkb_ciclismo.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el voley y ciclismo");
        }
        
         if (this.jchkb_voley.isSelected() && this.jchkb_ciclismo.isSelected()&& this.jchkb_futbol.isSelected()) {
            this.jlbl_mensaje.setText(mensaje + " le gusta el futbol, voley y ciclismo");
        }
              

    }//GEN-LAST:event_jbtn_calcularActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed

        this.jtxt_num1.setText("");
        this.jtxt_num2.setText("");
        this.jlbl_mensaje.setText("");
        this.jcb_operaciones.setSelectedIndex(0);
        this.jrbtn_otro.setSelected(true);
        this.jchkb_voley.setSelected(false);
        this.jchkb_ciclismo.setSelected(false);
        this.jchkb_futbol.setSelected(false);
        
        this.jtxt_num1.requestFocus();


    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jrbtn_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtn_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbtn_masculinoActionPerformed

    private void jchkb_voleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkb_voleyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkb_voleyActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtn_calcular;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JComboBox<String> jcb_operaciones;
    private javax.swing.JCheckBox jchkb_ciclismo;
    private javax.swing.JCheckBox jchkb_futbol;
    private javax.swing.JCheckBox jchkb_voley;
    private javax.swing.JLabel jlbl_mensaje;
    private javax.swing.JRadioButton jrbtn_femenino;
    private javax.swing.JRadioButton jrbtn_masculino;
    private javax.swing.JRadioButton jrbtn_otro;
    private javax.swing.JTextField jtxt_num1;
    private javax.swing.JTextField jtxt_num2;
    // End of variables declaration//GEN-END:variables
}
