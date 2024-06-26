/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
   public Object value;
    public Main() {
        initComponents();
        btnFormUpdate.setEnabled(false);
        
    }
    Main(int x){
        initComponents();
        btnFormUpdate.setEnabled(true);
        btnSubmit.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnShowData = new javax.swing.JButton();
        btnFormUpdate = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("Full Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 94, -1, -1));
        jPanel1.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 92, 146, -1));

        jLabel3.setText("Email:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 126, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 124, 146, -1));

        jLabel4.setText("Contact:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 159, -1, -1));
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 157, 146, -1));

        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 189, -1, -1));

        buttonGroup1.add(rdbtnMale);
        rdbtnMale.setText("Male");
        jPanel1.add(rdbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 183, 54, -1));

        buttonGroup1.add(rdbtnFemale);
        rdbtnFemale.setText("Female");
        jPanel1.add(rdbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 183, 80, -1));

        jLabel6.setText("City:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 226, -1, -1));

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[...Select One...]", "Karachi", "Islamabad", "Lahore", "Rawalpindi" }));
        jPanel1.add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 223, 146, -1));

        jLabel7.setText("Course:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 260, -1, -1));

        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[...Select One...]", "Graphic Designing", "Web Development", "Flutter", "Python", "Cyber Security" }));
        jPanel1.add(cmbCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 257, 146, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 68, -1));

        btnShowData.setText("Show Data");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, -1));

        btnFormUpdate.setText("Update");
        btnFormUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnFormUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(checkFields())
        {
            String gender = "";
            if(rdbtnMale.isSelected()) {gender = "Male";}
            else gender = "Female";
            
            DB obj = new DB();
            obj.addData(txtFullname.getText(),txtEmail.getText(), txtContact.getText(), gender, cmbCity.getSelectedItem().toString(), cmbCourse.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Data has been inserted successfully!");
            setFields();
            
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        // TODO add your handling code here:
        Data obj = new Data();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnFormUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormUpdateActionPerformed
        // TODO add your handling code here:
        String name="", email="", contact="", gender="", city="", course="";
       if( checkFields()){
         name = txtFullname.getText();
         email = txtEmail.getText();
         contact = txtContact.getText();
         
        if(rdbtnFemale.isSelected())
        {
            gender = "Female";
        } else gender = "Male";
         city = cmbCity.getSelectedItem().toString();
         course = cmbCourse.getSelectedItem().toString();
         DB obj = new DB();
       obj.Update(value, name, email, contact, gender, city, course);
       JOptionPane.showMessageDialog(this, "Data has been updated successfully!");
       }
     
         
       
       
      
    }//GEN-LAST:event_btnFormUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    public boolean checkFields()
    {
     String gender = "";
        if(txtFullname.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter your full name!");
            txtFullname.grabFocus();
            return false;
        } else if(txtEmail.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter your Email!");
            txtEmail.grabFocus();
            return false;
        }else if(txtContact.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter your Contact!");
            txtContact.grabFocus();
            return false;
        }
        if(rdbtnMale.isSelected()) gender = "Male";
        else if(rdbtnFemale.isSelected())gender = "Female";
        
        
        if(gender.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "select your gender");
            rdbtnMale.grabFocus();
            return false;
        }
        else if(cmbCity.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Select your city!");
            cmbCity.grabFocus();
            return false;
        }
        else if(cmbCourse.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Select your course!");
            cmbCourse.grabFocus();
            return false;
        }
           
        
        return true;
    }
    public void setValue(Object x)
    {
        value = x;
    }
    public void setFields()
    {
        txtFullname.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        buttonGroup1.clearSelection();
        cmbCity.setSelectedIndex(0);
        cmbCourse.setSelectedIndex(0);
                }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFormUpdate;
    private javax.swing.JButton btnShowData;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    // End of variables declaration//GEN-END:variables
}
